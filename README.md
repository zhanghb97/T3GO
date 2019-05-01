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

### Symbol table

#### 1. Data structure
#### 2. Symbol binder

- VariableSymbol

TTCN-3 variables are statically typed variables. Variables are either value variables to store values or template variables to store templates. Variables can be declared and used in the module control part, test cases, functions and altsteps.

1. Value variable

A TTCN-3 value variable stores values. It is declared by the **var** keyword followed by a type identifier and a variable identifier. An initial value can be assigned at variable declaration. A value variable associates a name with the location of a value. A value variable may change its value during test execution several times. A value can be assigned several times to a value variable. The value variable can be referenced
multiple times in a TTCN-3 module.

2. Template variables

A TTCN-3 template variable stores templates. They are declared by the **var template** keyword followed by a type identifier and a variable identifier. An initial content can be assigned at declaration.

- ConstSymbol

A constant assigns a name to a fixed value. A value is assigned only once to a constant, at the place of its declaration. The constant does not change its value during test execution. The constant is defined only once, but can be referenced multiple times in a TTCN-3 module.

When the walker enter the `constDef` node, it will check the following element to determine the next action. If the following element is a predefined type, the `DefPhase` module will bind the predefined type and the constant value name. When it came to the user defined type, the `DefPhase` will figure out what the user defined type means, then bind the primary type with the constant value name.

- Function definition

Function symbol is a sub-class of the symbol, which has the name, type and scope features. Meanwhile the function symbol also represents a scope. It implements the `Scope` interface and realizes all the methods of the `Scope` interface.

As for the symbol aspect, a function symbol instance is constructed by the function name, function return type and  scope that the function belongs to. After construction, the function symbol finish the bind step. When the walker enter the function definition part of the parser tree, the bind will be defined into the symbol table and ready for the typing checking step.

One the other hand, the function symbol also play a role of a scope. It can return its name by method `getScopeName()`. In order to build the scopes stack, the `getEnclosingScope()` method allows function symbol instance can return the enclosed scope, which equals to a pointer of the linked list. Then came the `define(Symbol sym)` of the function scope, arguments of a function will be stored as a hash map into the scope so that type checking step can verify a funcion call according to the argument list. Besides, the `resolve(String name)` offers the function symbol instance a function to look up the function name in current scope or in enclosing scopes.

Using these features above, the `DefPhase ` module can realize the function definition easily. First of all, when the semantic analyzer finds the function definition node of parser tree, the `DefPhase ` module will collect the function name and function return type. After that a function symbol will be created with the name and return type. Then the function symbol is defined into the current scope and the `currentscope` pointer will point to the function scope. As for the arguments, the `DefPhase ` module will get the arguments list and define each argument into the function scope. Finally the function symbol finishes buiding its environment and then it can handle the function body.

In conclusion, the function symbol is treated as a symbol and can be defined in the current scope so that the function can be called in the program. And it also a scope for its arguments which provide a environment for the body of a function.

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



#### 3. Typing check

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

