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

### Symbol table
#### 1. Data structure
#### 2. Symbol binder
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

