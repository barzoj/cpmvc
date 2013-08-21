package biz.cactussoft.cpmvc.syntax;

import java.util.LinkedList;
import java.util.List;

public class SyntaxNode implements ISyntaxNode
{
	public static ISyntaxNode createSyntaxNode( int line, AbstractSyntaxNodeTraits traits, ISyntaxNode parent ) 
	{
		return new SyntaxNode( ++current_id, line, traits, parent );
	}
	

	private static int current_id = 0;
	
	protected int m_id;
	protected int m_line;
	protected ISyntaxNode m_parent;
	protected List<ISyntaxNode> m_childs;
	protected AbstractSyntaxNodeTraits m_traits;
	
	public int getId() 
	{
		return this.m_id;
	}
	
	public ISyntaxNode getParent()
	{
		return this.m_parent;
	}
	
	public List<ISyntaxNode> getChilds()
	{
		return this.m_childs;
	}
	
	public void setParent( ISyntaxNode parent )
	{
		this.m_parent = parent;
	}
	
	public void addChild( ISyntaxNode child )
	{
		this.m_childs.add( child );
	}
	
	public void removeChild( ISyntaxNode child )
	{
		this.m_childs.remove( child );
	}
	
	public SyntaxNodeType getType()
	{
		return this.m_traits.getNodeType();
	}
	
	public AbstractSyntaxNodeTraits getTraits()
	{
		return this.m_traits;
	}
	
	public ISyntaxNode getLastChild()
	{
		if ( this.m_childs.isEmpty() )
			return null;
		return (ISyntaxNode)this.m_childs.get( this.m_childs.size() - 1 );
	}
	
	private SyntaxNode( int id, int line, AbstractSyntaxNodeTraits traits, ISyntaxNode parent )
	{
		this.m_id = id;
		this.m_line = line;
		this.m_childs = new LinkedList<ISyntaxNode>();
		this.m_traits = traits;
		this.m_parent = parent;
	}

	public int getLine() 
	{
		return this.m_line;
	}
}
