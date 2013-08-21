// Generated from cpmvc.g4 by ANTLR 4.0
package biz.cactussoft.cpmvc;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface cpmvcListener extends ParseTreeListener {
	void enterMapObject(cpmvcParser.MapObjectContext ctx);
	void exitMapObject(cpmvcParser.MapObjectContext ctx);

	void enterSimpleDataType(cpmvcParser.SimpleDataTypeContext ctx);
	void exitSimpleDataType(cpmvcParser.SimpleDataTypeContext ctx);

	void enterNameTypeDecl(cpmvcParser.NameTypeDeclContext ctx);
	void exitNameTypeDecl(cpmvcParser.NameTypeDeclContext ctx);

	void enterMvc(cpmvcParser.MvcContext ctx);
	void exitMvc(cpmvcParser.MvcContext ctx);

	void enterControllerDecl(cpmvcParser.ControllerDeclContext ctx);
	void exitControllerDecl(cpmvcParser.ControllerDeclContext ctx);

	void enterMethodParamDecl(cpmvcParser.MethodParamDeclContext ctx);
	void exitMethodParamDecl(cpmvcParser.MethodParamDeclContext ctx);

	void enterArrayObject(cpmvcParser.ArrayObjectContext ctx);
	void exitArrayObject(cpmvcParser.ArrayObjectContext ctx);

	void enterSimpleObject(cpmvcParser.SimpleObjectContext ctx);
	void exitSimpleObject(cpmvcParser.SimpleObjectContext ctx);

	void enterTypeDecl(cpmvcParser.TypeDeclContext ctx);
	void exitTypeDecl(cpmvcParser.TypeDeclContext ctx);

	void enterMethodDecl(cpmvcParser.MethodDeclContext ctx);
	void exitMethodDecl(cpmvcParser.MethodDeclContext ctx);

	void enterInterfaceDecl(cpmvcParser.InterfaceDeclContext ctx);
	void exitInterfaceDecl(cpmvcParser.InterfaceDeclContext ctx);

	void enterModelAttributeDecl(cpmvcParser.ModelAttributeDeclContext ctx);
	void exitModelAttributeDecl(cpmvcParser.ModelAttributeDeclContext ctx);

	void enterModelDecl(cpmvcParser.ModelDeclContext ctx);
	void exitModelDecl(cpmvcParser.ModelDeclContext ctx);
}