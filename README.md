## T3GO Compiler
### Workflow
1. Edit lexical and syntactic rules. (.g4 file)
2. Generate the lexer and parser with ANTLR. (java file)
```
alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
antlr4 -visitor t3parser.g4
javac *.java
```
3. Create a new java project and a new package in Eclipse.
4. Copy all the java files and token files, and paste all of them into the java project.
5. Create a main file to test the stracture.
- create a CharStream that reads from standard input
- create a lexer that feeds off of input CharStream
- create a buffer of tokens pulled from the lexer
- create a parser that feeds off the tokens buffer
- begin parsing at init rule
- print LISP-style tree
```
		//新建一个CharStream，从标准输入读入数据
		CharStream input = CharStreams.fromStream(System.in);
		//新建一个词法分析器,处理CharStream
		t3parserLexer lexer = new t3parserLexer(input);
		//新建一个词法符号的缓冲区，用于存储词法分析器将生成的词法符号
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//新建一个语法分析器，处理词法符号缓冲区的内容
		t3parserParser parser = new t3parserParser(tokens);
		//针对ttcn3module规则开始语法分析
		Ttcn3moduleContext tree = parser.ttcn3module();
		//打印树形表示
		System.out.println(tree.toStringTree(parser));
```

### Abstract

Testing and Test Control Notation version 3 (TTCN-3) is a strongly typed testing language used in conformance testing of communicating system. Although there are compilers for TTCN-3 based on java and C++, the ability of concurrency is still a problem. The paper introduces the TTCN-3 compiler based on Go language. The workflow of the compiler can be separated into four phases: lexical analysis, syntax analysis, semantic analysis and translation. To make the compiler work well, the project uses ANTLR to enhance the performance of lexical and syntax analyzer, uses a powerful symbol table to guarantee the correctness of semantic phase and formulate a translate scheme to realize the output. Under the support of ANTLR and Go Language, TTCN-3 compiler can build parser tree, enforce static typing rules and generate Go language in a high efficiency.

### Intorduction

#### 1. TTCN-3

#### 2. Go language

#### 3. ANTLR

### Semantic analysis

After lexical analysis and syntax analysis, the parser tree has been built. It seems like the compiler is ready for the translation. While, we should make sure the symbols of the program are used correctly. In this case, what we need is a  semantic analyzer. The semantic analysis phase of a compiler connects variable definitions to their uses, checks that each expression has a correct type. The key to implementing this phase is an appropriate data structure called a **symbol table**. Our application will store symbols in the symbol table and then check identifier references for correctness by looking them up in the symbol table. 

#### 1. Symbol table

Symbol table is data structure that used by compiler to hold information about sourse program constructions. The language being implemented dictates a symbol table’s structure and complexity. TTCN-3 allows the same identifier to mean different things in different contexts. Thus, the symbol table groups symbols into *scopes*. A scope is just a set of symbols such as a list of parameters for a function or the list of variables and functions in a global scope. 

In this project, we use the scope tree and hash map to realize the data structure of the symbol table. Scope tree show the relationship between the scopes of a program and each scope holds the symbols which are defined in the corresponding  scope. Hash map is used to store the symbols because it can offer the efficient insert and read ability.

As for the scope node, there are different scope class for different scope node. All the scope nodes should implement the `Scope` interface, which offers the following methods:

- `public String getScopeName();`

`getScopeName ` method is used to return the name of the scope. The return type is `String` .

- `public Scope getEnclosingScope();`

`getEnclosingScope` method is used to get enclosing scope, which can support the `pop` method of the scope stack. The method will return a `Scope` type.

- `public void define(Symbol sym);`

`define` method is used to define a symbol into the current scope. The argument is a `Symbol` instance.

- `public Symbol resolve(String name);`

`resolve` method is used to look up name in the current scope or in enclosing scopes. The argument is a `String` type name and the return type is `Symbol` instance.

Apart from that, for each scope node, there is a pointer points to the enclosing scope and there is a hash map to hold the symbols which belong to the scope. At the very beginning of the semantic analysis, we should define a global scope for the `module` , and any other scopes will be defined under the global scope.

Then came the hash map, we use hash map to store the symbols of a scope. Considering the order of some symbol like function parameters and record fields have special meanings, we choose the `Java LinkedHashMap` as the container of those symbols. Because `Java LinkedHashMap ` is a efficient data structure for inserting and reading data, with a predictable iteration. The key-value pair of hash map is `<String, Symbol>` . In this case, we can define and look up for a symbol with its name. Each symbol object has three member variables, they are name, type and scope. `name` tells us the name of the symbol and `scope` shows what scope contains it. `type` comes from a enum type of the `Symbol` class, which represents the type of the symbol. There are two constructed functions, one uses the name and type variables to construct, the other only use the name variable. Besides, `getName` method returns the symbol name and `toString` method return the information of the symbol in detail.

The symbol table by itself is just a repository of symbol definitions—it doesn’t do any checking. To validate code, we need to check the variable and function references in expressions against the rules we set up earlier. There are two fundamental operations for symbol validation: **defining** symbols and **resolving** symbols. Defining a symbol means adding it to a scope. Resolving a symbol means figuring out which definition the symbol refers to. In some sense, resolving a symbol means finding the “closest” matching definition. The closest scope is the closest enclosing scope. For example, let’s look at another Cymbol example that has symbol definitions in different scopes (labeled with circumscribed numbers). 

#### 2. Symbol binder

- VariableSymbol

TTCN-3 variables are statically typed variables. Variables are either value variables to store values or template variables to store templates. Variables can be declared and used in the module control part, test cases, functions and altsteps.

1. Value variable

A TTCN-3 value variable stores values. It is declared by the **var** keyword followed by a type identifier and a variable identifier. An initial value can be assigned at variable declaration. A value variable associates a name with the location of a value. A value variable may change its value during test execution several times. A value can be assigned several times to a value variable. The value variable can be referenced
multiple times in a TTCN-3 module.

2. Template variables

A TTCN-3 template variable stores templates. They are declared by the **var template** keyword followed by a type identifier and a variable identifier. An initial content can be assigned at declaration.

Templates are used to either transmit a set of distinct values or to test whether a set of received values matches the template specification. Templates can be defined globally or locally.

- ConstSymbol

A constant assigns a name to a fixed value. A value is assigned only once to a constant, at the place of its declaration. The constant does not change its value during test execution. The constant is defined only once, but can be referenced multiple times in a TTCN-3 module.

When the walker enter the `constDef` node, it will check the following element to determine the next action. If the following element is a predefined type, the `DefPhase` module will bind the predefined type and the constant value name. When it came to the user defined type, the `DefPhase` will figure out what the user defined type means, then bind the primary type with the constant value name.

- Port definition

Port symbol is treated as a `typedef` currently, which will be defined into the current scope. A port name can represent more than one type.

- Component definition

```
// TTCN-3
type component MyComponentType {
		var integer vc_myIntVar := 0; 
		port port1 pO1;
}
```



- Function definition

Function symbol is a sub-class of the symbol, which has the name, type and scope features. Meanwhile the function symbol also represents a scope. It implements the `Scope` interface and realizes all the methods of the `Scope` interface.

As for the symbol aspect, a function symbol instance is constructed by the function name, function return type and  scope that the function belongs to. After construction, the function symbol finish the bind step. When the walker enter the function definition part of the parser tree, the bind will be defined into the symbol table and ready for the typing checking step.

One the other hand, the function symbol also play a role of a scope. It can return its name by method `getScopeName()`. In order to build the scopes stack, the `getEnclosingScope()` method allows function symbol instance can return the enclosed scope, which equals to a pointer of the linked list. Then came the `define(Symbol sym)` of the function scope, arguments of a function will be stored as a hash map into the scope so that type checking step can verify a funcion call according to the argument list. Besides, the `resolve(String name)` offers the function symbol instance a function to look up the function name in current scope or in enclosing scopes.

Using these features above, the `DefPhase ` module can realize the function definition easily. First of all, when the semantic analyzer finds the function definition node of parser tree, the `DefPhase ` module will collect the function name and function return type. After that a function symbol will be created with the name and return type. Then the function symbol is defined into the current scope and the `currentscope` pointer will point to the function scope. As for the arguments, the `DefPhase ` module will get the arguments list and define each argument into the function scope. Finally the function symbol finishes buiding its environment and then it can handle the function body.

In conclusion, the function symbol is treated as a symbol and can be defined in the current scope so that the function can be called in the program. And it also a scope for its arguments which provide a environment for the body of a function.

- Altstep definition

Altsteps are scope units similar to functions. The altstep body defines an optional set of local definitions and a set of alternatives, the so-called *top alternatives*, that form the altstep body. The syntax rules of the top alternatives are identical to the syntax rules of the alternatives of **alt** statements. 

The behaviour of an altstep can be defined by using the program statements and operations summarized in clause 18. Altsteps may invoke functions and altsteps or activate altsteps as defaults. 

- Record definition

```TTCN-3
// TTCN-3
type record MyRecordType {
		integer field1,
		string field2,
		boolean field3
}
```

The record symbol is a symbol that will be defined into the current scope. Meanwhile, the record symbol also plays a role of scope and fields belong to the record will be defined into the record scope. The difference between the function symbol and the record symbol is that the record symbol don't have return type, so the type of record expression is `tVOID`. Apart from that difference, other methods of definition and binding is as same as the function symbol.

- Testcase definition

In TTCN-3, test cases are a special kind of function. 

#### 3. Typing check

Our phase classes need three fields: a reference to a global scope, a parse tree annotator to track the scopes we create, and a pointer to the current scope.

- parse tree annotator

```java
ParseTreeProperty<Scope> scopes;
```

Associate a property with a parse tree node. Useful with parse tree listeners that need to associate values with particular tree nodes, kind of like specifying a return value for the listener event method that visited a particular node. 

### TTCN-3 scopes

|          TTCN-3          |       Go language       |
| :----------------------: | :---------------------: |
| Module definitions part  |         package         |
| Contorl part of a module |        func main        |
|     Component types      |         struct          |
|        Functions         |          func           |
|         Altsteps         |   func + switch case    |
|        Test cases        |          func           |
|     Statement blocks     |    Statement blocks     |
| User defined name types  | User defined name types |

#### 1. Module

A module is defined with the keyword **module**. T3GO uses the keyword **package** to translate the module keyword of TTCN-3. A TTCN-3 module groups a set of  TTCN-3 definitions. Module names are of the form of a TTCN-3 identifier.

```TTCN-3
// TTCN-3
module MyTestSuite
{...}
```

```go
// Go
package MyTestSuite
{...}
```

In the beginning of a module, the sementic analyzer will initialize the built-in environment. In this case, the analyzer define the built-in types and functions into the global scope which means these types and functions can be used in any scope.

The following table shows the types which will be initialized at the global scope.

| Class of type      | Keyword             |
| ------------------ | ------------------- |
| Simple basic types | integer             |
| Simple basic types | float               |
| Simple basic types | boolean             |
| Simple basic types | verdicttype         |
| Basic string types | bitstring           |
| Basic string types | hexstring           |
| Basic string types | octetstring         |
| Basic string types | charstring          |
| Basic string types | universal charsting |



#### 1.1 Module definitions part



#### 2. Contorl part of a module

### Structured types and values

#### 1. Record type and values

TTCN-3 supports ordered structured types known as **record**. The fields of a **record** type may be of any TTCN-3 type. The values of a **record** shall be compatible with the types of the **record** fields. The field identifiers are local to the **record** and shall be unique within the **record**, but do not have to be globally unique.

```TTCN-3
// TTCN-3
type record MyRecordType {
		integer field1,
		string field2,
		boolean field3
}
```

A **record** value is assigned on an individual field basis. The order of field values in the value list notation shall be the same as the order of fields in the related type definition. 

```
// TTCN-3
const MyRecordType myrecord := {
		field1 := 1,
		field2 := "ABC",
		field2 := true
}
```

Elements of a **record** shall be referenced by the dot notation TypeIdOrExpression.ElementId, where
TypeIdOrExpression resolves to the name of a structured type or an expression of a structured type such as
variable, formal parameter, module parameter, constant, template, or function invocation. ElementId shall resolve to the name of a field in the structured type. 

```
// TTCN-3
var integer r := myrecord.field1;
```

### Port types, component types and test configurations

#### 1. Port types



### Functions, altsteps and testcases

#### 1. Functions

#### 2. Altsteps

TTCN-3 uses altsteps to specify default behaviour or to structure the alternatives of an **alt** statement.

Altsteps are scope units similar to functions. The altstep body defines an optional set of local definitions and a set of alternatives, the so-called *top alternatives*, that form the altstep body. The syntax rules of the top alternatives are identical to the syntax rules of the alternatives of **alt** statements. Altsteps may invoke functions and altsteps or activate altsteps as defaults.

#### 3. Testcases

In TTCN-3, test cases are a special kind of function. Test cases define the behaviours, which have to be executed to check whether the SUT passes a test or not.