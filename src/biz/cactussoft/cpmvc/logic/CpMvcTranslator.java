package biz.cactussoft.cpmvc.logic;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.logging.*;


import biz.cactussoft.cpmvc.cpmvcListener;
import biz.cactussoft.cpmvc.cpmvcParser.ControllerDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.InterfaceDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.MapObjectContext;
import biz.cactussoft.cpmvc.cpmvcParser.MethodDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.MethodParamDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.ModelAttributeDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.ModelDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.MvcContext;
import biz.cactussoft.cpmvc.cpmvcParser.NameTypeDeclContext;
import biz.cactussoft.cpmvc.cpmvcParser.SimpleDataTypeContext;
import biz.cactussoft.cpmvc.cpmvcParser.SimpleObjectContext;
import biz.cactussoft.cpmvc.cpmvcParser.TypeDeclContext;
import biz.cactussoft.cpmvc.logic.exceptions.RedeclarationException;
import biz.cactussoft.cpmvc.syntax.*;
import biz.cactussoft.cpmvc.types.SimpleType;
import biz.cactussoft.cpmvc.utils.Utils;



/**
 * 
 */

/**
 * @author iddqd
 *
 */
public class CpMvcTranslator implements cpmvcListener {

	
	protected String m_fileName;
	protected ISyntaxNode m_root;
	protected TypeTable m_typeTable;
	
	private final static Logger LOG = Logger.getLogger( CpMvcTranslator.class.getName() );
	
	public ISyntaxNode getRootNode()
	{
		return this.m_root;
	}
	
	public CpMvcTranslator( String fileName )
	{
		this.m_fileName = fileName;
		this.m_root = SyntaxNode.createSyntaxNode( 0, MvcNodeTraits.createMvcNodeTraits( fileName ), null );
		this.m_typeTable = new TypeTable();
		
		//set log level
		LOG.setLevel( Level.FINEST );
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel( Level.FINE );
		LOG.addHandler( handler );
	}
	
	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#enterEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#exitEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode)
	 */
	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitTerminal(org.antlr.v4.runtime.tree.TerminalNode)
	 */
	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#enterMapObject(cpmvcParser.MapObjectContext)
	 */
	@Override
	public void enterMapObject(MapObjectContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitMapObject(cpmvcParser.MapObjectContext)
	 */
	@Override
	public void exitMapObject(MapObjectContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#enterSimpleDataType(cpmvcParser.SimpleDataTypeContext)
	 */
	@Override
	public void enterSimpleDataType(SimpleDataTypeContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitSimpleDataType(cpmvcParser.SimpleDataTypeContext)
	 */
	@Override
	public void exitSimpleDataType(SimpleDataTypeContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#enterMvc(cpmvcParser.MvcContext)
	 */
	@Override
	public void enterMvc(MvcContext ctx) {
		// TODO Auto-generated method stub


	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitMvc(cpmvcParser.MvcContext)
	 */
	@Override
	public void exitMvc(MvcContext ctx) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see cpmvcListener#enterControllerDecl(cpmvcParser.ControllerDeclContext)
	 */
	@Override
	public void enterControllerDecl(ControllerDeclContext ctx) 
	{
		this.m_root.addChild(SyntaxNode.createSyntaxNode( ctx.name.getLine(), ActionModelNodeTraits.createControllerNodeTraits( ctx.name.getText() ), this.m_root ) );
		LOG.log(Level.FINE, "interface " + ctx.name.getText() + " created" );
	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitControllerDecl(cpmvcParser.ControllerDeclContext)
	 */
	@Override
	public void exitControllerDecl(ControllerDeclContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#enterSimpleObject(cpmvcParser.SimpleObjectContext)
	 */
	@Override
	public void enterSimpleObject(SimpleObjectContext ctx) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitSimpleObject(cpmvcParser.SimpleObjectContext)
	 */
	@Override
	public void exitSimpleObject(SimpleObjectContext ctx) {
		// TODO Auto-generated method stub

	}

	
	
	/* (non-Javadoc)
	 * @see cpmvcListener#enterModelDecl(cpmvcParser.ModelDeclContext)
	 */
	@Override
	public void enterModelDecl(ModelDeclContext ctx) 
	{
		this.m_root.addChild(SyntaxNode.createSyntaxNode( ctx.name.getLine(), DataModelNodeTraits.createDataModelNodeTraits( ctx.name.getText() ), this.m_root ) );
		LOG.log(Level.FINE, "datamodel " + ctx.name.getText() + " created" );
	}

	/* (non-Javadoc)
	 * @see cpmvcListener#exitModelDecl(cpmvcParser.ModelDeclContext)
	 */
	@Override
	public void exitModelDecl(ModelDeclContext ctx) 
	{
		//add this data model to types table
		if ( this.m_root.getLastChild().getType() != SyntaxNodeType.DataModelDecl )
			throw new RuntimeException( "last node in root is not a datamodel" );
		if ( this.m_typeTable.containsType( ctx.name.getText() ) )
			throw new RedeclarationException( Utils.getFileName( this.m_root ) , ctx.name.getLine(),  ctx.name.getText() );
		this.m_typeTable.addType( Utils.createDataModelFromSyntaxNode( this.m_root.getLastChild(), this.m_typeTable) );
		LOG.log( Level.FINE, "datamodel " + ctx.name.getText() + " added to type table" );
	}

	@Override
	public void enterTypeDecl(TypeDeclContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeDecl(TypeDeclContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNameTypeDecl(NameTypeDeclContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNameTypeDecl(NameTypeDeclContext ctx) {
		// exception will be thrown if type doesn't exists
		Utils.createSimpleTypeFromTypeDeclContext( ctx.type, this.m_typeTable );
	}

	@Override
	public void enterModelAttributeDecl(ModelAttributeDeclContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitModelAttributeDecl(ModelAttributeDeclContext ctx) 
	{
		String name = ctx.nameTypeDecl().name.getText();
		SimpleType type = Utils.createSimpleTypeFromTypeDeclContext( ctx.nameTypeDecl().type, this.m_typeTable );
		
		
		this.m_root.getLastChild().addChild(
				SyntaxNode.createSyntaxNode(
						ctx.nameTypeDecl().name.getLine(),
						NameTypeNodeTraits.createNameTypeNodeTraits(
								name, 
								type ),
								this.m_root
								) );

		LOG.log(Level.FINE, "attribute with name " + name + " of type " + type.getTypeName() + " created" );

	}

	@Override
	public void enterArrayObject(
			biz.cactussoft.cpmvc.cpmvcParser.ArrayObjectContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayObject(
			biz.cactussoft.cpmvc.cpmvcParser.ArrayObjectContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodParamDecl(MethodParamDeclContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitMethodParamDecl(MethodParamDeclContext ctx) 
	{
		// check last node is an interface or controller node
		this.checkLastNodeType( new SyntaxNodeType[] 	{ 	
														SyntaxNodeType.ViewInterfaceDecl, 
														SyntaxNodeType.ContollerDecl 
				} );

		//make sure last node has a method
		ISyntaxNode node = this.m_root.getLastChild().getLastChild();
		if ( node.getType() != SyntaxNodeType.MethodDecl )
			throw new RuntimeException( "A child of action node is not a method" );
		
		//TODO: check if a parameter with same name already exists 
		for ( NameTypeDeclContext nameType : ctx.nameTypeDecl() )
		{
			node.addChild( SyntaxNode.createSyntaxNode(
											nameType.name.getLine(),
											MethodNodeTraits.createMethodNodeTraits( 
													nameType.name.getText(), 
													Utils.createSimpleTypeFromTypeDeclContext( nameType.type, this.m_typeTable ) ), 
											node ) 
							);
			LOG.log( Level.FINE, "param " + nameType.name.getText() + " added to method " + node.getTraits().getName() );
		}
		
	}

	@Override
	public void enterMethodDecl(MethodDeclContext ctx) 
	{
		// check last node is an interface or controller node
		this.checkLastNodeType( new SyntaxNodeType[] 	{ 	
														SyntaxNodeType.ViewInterfaceDecl, 
														SyntaxNodeType.ContollerDecl 
														} );
		//get name of return type. an exception will be thrown if no such type exists in type table
		SimpleType returnType = null;
		if ( ctx.returnType != null )
			returnType = Utils.createSimpleTypeFromTypeDeclContext( ctx.returnType, this.m_typeTable );
		
		//create new node for current method
		this.m_root.getLastChild().addChild( SyntaxNode.createSyntaxNode( 
												ctx.name.getLine(),
												MethodNodeTraits.createMethodNodeTraits( 
														ctx.name.getText(),  
														returnType) , 
												this.m_root.getLastChild() )
											);
		LOG.log(Level.FINE, "method " + ctx.name.getText() + " with return type " + ( returnType != null ? returnType.toString() : "null " ) + " created" );

	}

	@Override
	public void exitMethodDecl(MethodDeclContext ctx) {
		// check last node is an interface or controller node
		this.checkLastNodeType( new SyntaxNodeType[] { SyntaxNodeType.ViewInterfaceDecl, 
														SyntaxNodeType.ContollerDecl } );
		
	}

	@Override
	public void enterInterfaceDecl(InterfaceDeclContext ctx) 
	{
		this.m_root.addChild(SyntaxNode.createSyntaxNode( ctx.name.getLine(), ActionModelNodeTraits.createInterfaceNodeTraits( ctx.name.getText() ), this.m_root ) );
		LOG.log(Level.FINE, "interface " + ctx.name.getText() + " created" );
	}

	@Override
	public void exitInterfaceDecl(InterfaceDeclContext ctx) {
		//do nothing, just check that the last node is interface decl
		this.checkLastNodeType( new SyntaxNodeType[] { SyntaxNodeType.ViewInterfaceDecl } );
	}
	
	protected void checkLastNodeType( SyntaxNodeType types[] )
	{
		ISyntaxNode lastNode = this.m_root.getLastChild();
		
		if ( lastNode == null )
			throw new RuntimeException( "no childs" ); //TODO: make it better
		
		boolean isNeededType = false;
		for ( SyntaxNodeType type : types )
			if ( lastNode.getType() == type )
			{
				isNeededType = true;
				break;
			}
		
		if ( !isNeededType )
			throw new RuntimeException( "last node has invalid type " + this.m_root.getLastChild().getType().toString() );
	}

}
