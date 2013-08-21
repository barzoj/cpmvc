package biz.cactussoft.cpmvc.tests;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import biz.cactussoft.cpmvc.cpmvcLexer;
import biz.cactussoft.cpmvc.cpmvcParser;
import biz.cactussoft.cpmvc.logic.CpMvcTranslator;
import biz.cactussoft.cpmvc.logic.exceptions.RedeclarationException;
import biz.cactussoft.cpmvc.logic.exceptions.TypeNotFoundException;
import biz.cactussoft.cpmvc.syntax.DataModelNodeTraits;
import biz.cactussoft.cpmvc.syntax.ISyntaxNode;
import biz.cactussoft.cpmvc.syntax.NameTypeNodeTraits;
import biz.cactussoft.cpmvc.syntax.SyntaxNodeType;
import biz.cactussoft.cpmvc.types.BuiltInType;

public class CpMvcTranslatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimpleDataModel()
	{
		ISyntaxNode root = getResults( "datamodel TestModel { attr1 : string; attr2 : int; attr3 : float;}" );
		assertTrue( root.getType()== SyntaxNodeType.RootDecl  );
		assertTrue( root.getChilds().size() == 1 );
		assertTrue( root.getChilds().get( 0 ).getType() == SyntaxNodeType.DataModelDecl  );
		assertTrue( root.getChilds().get( 0 ).getChilds().size() == 3 );
		assertTrue( root.getChilds().get( 0 ).getChilds().get( 0 ).getType() == SyntaxNodeType.NameTypeDecl );
		
		assertTrue( root.getChilds().get( 0 ).getChilds().get( 0 ).getTraits() instanceof NameTypeNodeTraits );
		NameTypeNodeTraits attr1Traits  = (NameTypeNodeTraits) root.getChilds().get( 0 ).getChilds().get( 0 ).getTraits();
		assertTrue( attr1Traits.getType().getType() == BuiltInType.StringType );
		assertTrue( attr1Traits.getName().equals( "attr1" ) );
		
		assertTrue( root.getChilds().get( 0 ).getChilds().get( 1 ).getTraits() instanceof NameTypeNodeTraits );
		NameTypeNodeTraits attr2Traits  = (NameTypeNodeTraits) root.getChilds().get( 0 ).getChilds().get( 1 ).getTraits();
		assertTrue( attr2Traits.getType().getType() == BuiltInType.IntegerType );
		assertTrue( attr2Traits.getName().equals( "attr2" ) );
		
		assertTrue( root.getChilds().get( 0 ).getChilds().get( 2 ).getTraits() instanceof NameTypeNodeTraits );
		NameTypeNodeTraits attr3Traits  = (NameTypeNodeTraits) root.getChilds().get( 0 ).getChilds().get( 2 ).getTraits();
		assertTrue( attr3Traits.getType().getType() == BuiltInType.FloatType );
		assertTrue( attr3Traits.getName().equals( "attr3" ) );
			
	} 
	
	@Test( expected=RedeclarationException.class )
	public void testCannotDeclareSameAttributes()
	{
		getResults( "datamodel TestModel { attr1 : string; attr1 : int; attr3 : float;}" );
	}
	
	
	@Test( expected=RedeclarationException.class )
	public void testCannotDeclareSameModels()
	{
		getResults( "datamodel TestModel { attr1 : string;} " +
				"datamodel TestModel { attr2 : TestModel; attr1 : string; } " );
	}
	
	@Test( expected=RedeclarationException.class )
	public void testCannotDeclareSameDatamodelAndController()
	{
		getResults( "datamodel TestModel { attr1 : string;} " +
				"datamodel TestModel { attr2 : string;} " );

	}
	
	@Test( expected=TypeNotFoundException.class )
	public void testTypeNotDeclared()
	{
		getResults( "datamodel TestModel { attr1 : bar;} " +
				"datamodel TestModel { attr2 : Foo;} " );

	}
	
	@Test
	public void testDeclaredModelAsAttributeType()
	{
		ISyntaxNode root = getResults( "datamodel foo { attr1 : string; } datamodel bar { baz : foo; }" );
		assertTrue( root.getChilds().get( 1 ).getTraits() instanceof DataModelNodeTraits  );
		assertTrue( root.getChilds().get( 1 ).getChilds().get( 0 ).getTraits() instanceof NameTypeNodeTraits );
		assertTrue(  ( (NameTypeNodeTraits)( root.getChilds().get( 1 ).getChilds().get( 0 ).getTraits() ) ).getType().getTypeName() == ((DataModelNodeTraits)root.getChilds().get( 0 ).getTraits()).getName() );
	} 
	
	protected ISyntaxNode getResults( String input )
	{
		ANTLRInputStream inputStream = new ANTLRInputStream( input );
		cpmvcLexer lexer = new cpmvcLexer( inputStream );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		cpmvcParser parser = new cpmvcParser( tokens );
		ParseTree tree = parser.mvc();
		ParseTreeWalker walker = new ParseTreeWalker();
		CpMvcTranslator translator = new CpMvcTranslator( "" );
		walker.walk( translator, tree );
		return translator.getRootNode();
	}

}
