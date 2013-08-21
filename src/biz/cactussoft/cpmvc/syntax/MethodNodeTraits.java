package biz.cactussoft.cpmvc.syntax;

import biz.cactussoft.cpmvc.types.SimpleType;

public class MethodNodeTraits extends AbstractSyntaxNodeTraits 
{
	public static MethodNodeTraits createMethodNodeTraits(String name,
			SimpleType returnType) {
		return new MethodNodeTraits(name, returnType);
	}

	protected SimpleType m_returnType;
	
	public SimpleType getReturnType()
	{
		return this.m_returnType;
	}
	
	protected MethodNodeTraits( String name, SimpleType returnType )
	{
		this.m_name = name;
		this.m_nodeType = SyntaxNodeType.MethodDecl;
		this.m_returnType  = returnType;
	}
}
