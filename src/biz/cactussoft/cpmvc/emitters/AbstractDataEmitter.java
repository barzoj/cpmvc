package biz.cactussoft.cpmvc.emitters;

import java.io.FileWriter;
import java.io.IOException;

import biz.cactussoft.cpmvc.syntax.ISyntaxNode;

public abstract class AbstractDataEmitter implements IMvcEmitter 
{

	protected FileWriter m_fileWriter;
	
	protected abstract void init( ISyntaxNode node ) throws IOException;
	
	protected void close() throws IOException
	{
		this.m_fileWriter.close();
	}
	
	@Override
	public void emit( ISyntaxNode node ) throws IOException 
	{
		init( node );
		emitAnnotations();
		emitFileHeader( node );
		emitDataHeader( node );
		emitDataBody( node );
		emitDataFooter( node );
		emitFileFooter( node );
		close();
	}
	
	protected void emitAnnotations() throws IOException
	{
		this.m_fileWriter.write( "//automaticly generated, do not change\n" );
	}
	
	
	protected abstract void emitFileHeader( ISyntaxNode node ) throws IOException;
		
	protected abstract void emitFileFooter( ISyntaxNode node ) throws IOException;
	
	protected abstract void emitDataHeader( ISyntaxNode node ) throws IOException;
	
	protected abstract void emitDataBody( ISyntaxNode node ) throws IOException;
	
	protected abstract void emitDataFooter( ISyntaxNode node ) throws IOException;
	
}
