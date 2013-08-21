package biz.cactussoft.cpmvc.syntax;

public abstract class AbstractSyntaxNodeTraits 
{
	protected SyntaxNodeType m_nodeType;
	
	protected String m_name;
	
	public String getName()
	{
		return this.m_name;
	}
	
	public SyntaxNodeType getNodeType()
	{
		return this.m_nodeType;
	}
	
}
