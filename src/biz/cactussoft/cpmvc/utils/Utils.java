package biz.cactussoft.cpmvc.utils;

import java.util.HashMap;
import java.util.Iterator;
import biz.cactussoft.cpmvc.cpmvcParser.TypeDeclContext;
import biz.cactussoft.cpmvc.logic.TypeTable;
import biz.cactussoft.cpmvc.logic.exceptions.RedeclarationException;
import biz.cactussoft.cpmvc.logic.exceptions.TypeNotFoundException;
import biz.cactussoft.cpmvc.syntax.DataModelNodeTraits;
import biz.cactussoft.cpmvc.syntax.ISyntaxNode;
import biz.cactussoft.cpmvc.syntax.MvcNodeTraits;
import biz.cactussoft.cpmvc.syntax.NameTypeNodeTraits;
import biz.cactussoft.cpmvc.syntax.SyntaxNode;
import biz.cactussoft.cpmvc.syntax.SyntaxNodeType;
import biz.cactussoft.cpmvc.types.AggregationType;
import biz.cactussoft.cpmvc.types.DataModelType;
import biz.cactussoft.cpmvc.types.SimpleType;


public class Utils 
{
	public static DataModelType createDataModelFromSyntaxNode( ISyntaxNode node,TypeTable table )
	{
		if ( node.getType() != SyntaxNodeType.DataModelDecl )
			throw new RuntimeException( "syntax node is not a datamodel" );
		DataModelNodeTraits dataTraits = (DataModelNodeTraits)node.getTraits();
		HashMap<String, SimpleType> attributes = new HashMap<String, SimpleType>();
		
		for ( Iterator<ISyntaxNode> iter = node.getChilds().iterator(); iter.hasNext(); )
		{
			SyntaxNode current = (SyntaxNode)iter.next();
			if ( current.getType() != SyntaxNodeType.NameTypeDecl )
				throw new RuntimeException( "datamodel node has not a nametypedecl node" );
			NameTypeNodeTraits traits = (NameTypeNodeTraits)current.getTraits();
			if ( attributes.containsKey( traits.getName() ) )
				throw new RedeclarationException( getFileName( node ), node.getLine(), traits.getName() );
			SimpleType attributeType;
			if ( traits.getType() instanceof AggregationType ) 
				attributeType = (AggregationType)traits.getType();
			else
				attributeType = table.getType( traits.getType().getTypeName() );
			if ( attributeType == null )
				throw new TypeNotFoundException( Utils.getFileName( node ), node.getLine(), traits.getType().getTypeName() );
			attributes.put( traits.getName(),  attributeType );
		}
		
		return DataModelType.createDataModelType( dataTraits.getName(), attributes );
	}
	
	public static SimpleType createSimpleTypeFromTypeDeclContext( TypeDeclContext context, TypeTable table )
	{
		SimpleType type;
		if ( context.simpleDataType() != null )
			type = table.getType( context.simpleDataType().getText() );
		else
			if ( context.simpleObject() != null )
				type = table.getType( context.simpleObject().getText() );
			else
				if ( context.arrayObject() != null )
					type = AggregationType.createAggregationType( 
							createSimpleTypeFromTypeDeclContext(context.arrayObject().type, table)
							);
				else
					throw new RuntimeException( "illegal type in attribute declaration " + context.getText() );
		if ( type == null )
			throw new TypeNotFoundException( "", 0, "" ); //FIXME
		return type;
	}
	
	public static String getFileName( ISyntaxNode node )
	{
		ISyntaxNode root = node;
		while ( root.getParent() != null )
			root = root.getParent();
		if ( root.getTraits() instanceof MvcNodeTraits )
		{
			MvcNodeTraits traits = (MvcNodeTraits)root.getTraits();
			return traits.getName();
		}
		else
			throw new RuntimeException( "root node is not mvc node" );

	}
	
}
