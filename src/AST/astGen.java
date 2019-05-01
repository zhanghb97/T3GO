package AST;

import antlr.t3parserBaseVisitor;
import antlr.t3parserParser;

public class AstGen extends t3parserBaseVisitor<Void> {
	@Override public Void visitTtcn3module(t3parserParser.Ttcn3moduleContext ctx) { 
		
		t3parserParser.ModuleIdContext moduleId = ctx.moduleId();
		
		System.out.println(ctx.moduleId().getText());
		return visitChildren(ctx.moduleId()); 
	}
	
	@Override public Void visitModuleId(t3parserParser.ModuleIdContext ctx) { 
		
		Symbol.Type t = Symbol.Type.tMODULE;
		Symbol s = new Symbol(ctx.IDENTIFIER().getText(), t);
		System.out.println("111");
		return visitChildren(ctx);
	}
}
