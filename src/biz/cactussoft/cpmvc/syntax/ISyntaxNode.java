package biz.cactussoft.cpmvc.syntax;

import java.util.List;

public interface ISyntaxNode 
{
	public int getId();
	public ISyntaxNode getParent();
	public List<ISyntaxNode> getChilds();
	public void setParent( ISyntaxNode parent );
	public void addChild( ISyntaxNode child );
	public void removeChild( ISyntaxNode child );
	public SyntaxNodeType getType();
	public AbstractSyntaxNodeTraits getTraits();
	public ISyntaxNode getLastChild();
	public int getLine();
}
