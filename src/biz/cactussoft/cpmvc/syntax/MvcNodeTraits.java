package biz.cactussoft.cpmvc.syntax;

public class MvcNodeTraits extends AbstractSyntaxNodeTraits 
{
	public static MvcNodeTraits createMvcNodeTraits(String fileName) 
	{
		return new MvcNodeTraits(fileName);
	}
	
	private MvcNodeTraits( String fileName )
	{
		this.m_name = fileName;
		this.m_nodeType = SyntaxNodeType.RootDecl;
	}
}
