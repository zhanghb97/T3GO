package AST;

import antlr.t3parserBaseVisitor;
import antlr.t3parserParser;

public class astGen extends t3parserBaseVisitor<Void> {
	@Override public Void visitTtcn3module(t3parserParser.Ttcn3moduleContext ctx) { 
		System.out.println(ctx.getText());
		return visitChildren(ctx); }
}
