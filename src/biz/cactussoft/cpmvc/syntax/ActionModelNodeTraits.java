package biz.cactussoft.cpmvc.syntax;

public class ActionModelNodeTraits extends AbstractSyntaxNodeTraits 
{
	public static ActionModelNodeTraits createControllerNodeTraits( String name ) 
	{
		return new ActionModelNodeTraits( name, SyntaxNodeType.ContollerDecl );
	}

	public static ActionModelNodeTraits createInterfaceNodeTraits( String name ) 
	{
		return new ActionModelNodeTraits( name, SyntaxNodeType.ViewInterfaceDecl );
	}

	
	private ActionModelNodeTraits( String name, SyntaxNodeType type ) 
	{
		this.m_name = name;
		this.m_nodeType = type;
	}
}
