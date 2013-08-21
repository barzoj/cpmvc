// Generated from cpmvc.g4 by ANTLR 4.0
package biz.cactussoft.cpmvc;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface cpmvcVisitor<T> extends ParseTreeVisitor<T> {
	T visitMapObject(cpmvcParser.MapObjectContext ctx);

	T visitSimpleDataType(cpmvcParser.SimpleDataTypeContext ctx);

	T visitNameTypeDecl(cpmvcParser.NameTypeDeclContext ctx);

	T visitMvc(cpmvcParser.MvcContext ctx);

	T visitControllerDecl(cpmvcParser.ControllerDeclContext ctx);

	T visitMethodParamDecl(cpmvcParser.MethodParamDeclContext ctx);

	T visitArrayObject(cpmvcParser.ArrayObjectContext ctx);

	T visitSimpleObject(cpmvcParser.SimpleObjectContext ctx);

	T visitTypeDecl(cpmvcParser.TypeDeclContext ctx);

	T visitMethodDecl(cpmvcParser.MethodDeclContext ctx);

	T visitInterfaceDecl(cpmvcParser.InterfaceDeclContext ctx);

	T visitModelAttributeDecl(cpmvcParser.ModelAttributeDeclContext ctx);

	T visitModelDecl(cpmvcParser.ModelDeclContext ctx);
}