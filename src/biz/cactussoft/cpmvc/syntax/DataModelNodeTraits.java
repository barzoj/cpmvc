package biz.cactussoft.cpmvc.syntax;

public class DataModelNodeTraits extends AbstractSyntaxNodeTraits 
{
	public static DataModelNodeTraits createDataModelNodeTraits(String name) 
	{
		return new DataModelNodeTraits(name);
	}

	private DataModelNodeTraits( String name )
	{
		this.m_name = name;
		this.m_nodeType = SyntaxNodeType.DataModelDecl;
	}
	
}
