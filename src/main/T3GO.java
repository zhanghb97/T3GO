package main;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr.t3parserLexer;
import antlr.t3parserParser;
import antlr.t3parserParser.Ttcn3moduleContext;

public class T3GO {

	public static void main(String[] args) throws IOException {
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

	}

}
