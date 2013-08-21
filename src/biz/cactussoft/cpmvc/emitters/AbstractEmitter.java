package biz.cactussoft.cpmvc.emitters;

import java.io.IOException;
import java.util.Iterator;

import biz.cactussoft.cpmvc.syntax.ISyntaxNode;

public abstract class AbstractEmitter implements IMvcEmitter {

	
	protected IMvcEmitter m_dataModelEmitter;
	protected IMvcEmitter m_controllerEmitter;
	protected IMvcEmitter m_interfaceEmitter;
	
	public IMvcEmitter getDataModelEmitter()
	{
		return this.m_dataModelEmitter;
	}
	
	public IMvcEmitter getControllerEmitter()
	{
		return this.m_controllerEmitter;
	}
	
	public IMvcEmitter getInterfaceEmitter()
	{
		return this.m_interfaceEmitter;
	}
	
	public void setDataModelEmitter( IMvcEmitter emitter )
	{
		this.m_dataModelEmitter = emitter;
	}
	
	public void setControllerEmitter( IMvcEmitter emitter )
	{
		this.m_controllerEmitter = emitter;
	}
	
	public void setInterfaceEmitter( IMvcEmitter emitter )
	{
		this.m_interfaceEmitter = emitter;
	}
	
	@Override
	public void emit(ISyntaxNode root) throws IOException 
	{
		for ( Iterator<ISyntaxNode> iter = root.getChilds().iterator(); iter.hasNext(); )
		{
			ISyntaxNode node = (ISyntaxNode)iter.next();
			switch ( node.getType() )
			{
				case ContollerDecl:
				{
					throw new RuntimeException( "not implementd ");
//					break;
				}
				case DataModelDecl:
				{
					this.emitDataModel( node );
					break;
				}
				case NameTypeDecl:
				{
					throw new RuntimeException( "not implementd ");
//					break;
				}
				case ViewInterfaceDecl:
				{
					throw new RuntimeException( "not implementd ");
//					break;
				}
				case MethodDecl:
				{
					throw new RuntimeException( "not implemented" );
				}
			}
		}
	}
	
	protected void emitDataModel( ISyntaxNode node ) throws IOException
	{
		this.m_dataModelEmitter.emit( node );
	}
	
	protected void emitController( ISyntaxNode node ) throws IOException
	{
		this.m_controllerEmitter.emit( node );
	}
	
	protected void emitInterface( ISyntaxNode node ) throws IOException
	{
		this.m_interfaceEmitter.emit( node );
	}
}
