package biz.cactussoft.cpmvc.syntax;

import biz.cactussoft.cpmvc.types.SimpleType;

public class NameTypeNodeTraits extends AbstractSyntaxNodeTraits 
{
	public static NameTypeNodeTraits createNameTypeNodeTraits(String name, SimpleType type)
	{
		return new NameTypeNodeTraits(name, type, SyntaxNodeType.NameTypeDecl );
	}

	public static NameTypeNodeTraits createMethodNodeTraits(String name, SimpleType returnType)
	{
		return new NameTypeNodeTraits(name, returnType, SyntaxNodeType.MethodDecl );
	}
	
	protected SimpleType m_type;
	
	public SimpleType getType()
	{
		return this.m_type;
	}
	
	private NameTypeNodeTraits( String name, SimpleType type, SyntaxNodeType nodeType ) 
	{
		this.m_nodeType = nodeType;
		this.m_name = name;
		this.m_type = type;
	}
}
