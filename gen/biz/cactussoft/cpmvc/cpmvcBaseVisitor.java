// Generated from cpmvc.g4 by ANTLR 4.0
package biz.cactussoft.cpmvc;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class cpmvcBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements cpmvcVisitor<T> {
	@Override public T visitMapObject(cpmvcParser.MapObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitSimpleDataType(cpmvcParser.SimpleDataTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitNameTypeDecl(cpmvcParser.NameTypeDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitMvc(cpmvcParser.MvcContext ctx) { return visitChildren(ctx); }

	@Override public T visitControllerDecl(cpmvcParser.ControllerDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodParamDecl(cpmvcParser.MethodParamDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitArrayObject(cpmvcParser.ArrayObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitSimpleObject(cpmvcParser.SimpleObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitTypeDecl(cpmvcParser.TypeDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodDecl(cpmvcParser.MethodDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitInterfaceDecl(cpmvcParser.InterfaceDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitModelAttributeDecl(cpmvcParser.ModelAttributeDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitModelDecl(cpmvcParser.ModelDeclContext ctx) { return visitChildren(ctx); }
}