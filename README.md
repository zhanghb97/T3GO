## T3GO Compiler
### Workflow
1. Edit lexical and syntactic rules. (.g4 file)
2. Generate the lexer and parser with ANTLR. (java file)
```
alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
antlr4 t3parser.g4
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

### Git



