package biz.cactussoft.cpmvc.emitters.cpp;

import java.io.FileWriter;
import java.io.IOException;

import biz.cactussoft.cpmvc.emitters.AbstractDataEmitter;
import biz.cactussoft.cpmvc.syntax.DataModelNodeTraits;
import biz.cactussoft.cpmvc.syntax.ISyntaxNode;

public class CppDataModelEmitter extends AbstractDataEmitter {

	DataModelNodeTraits getDataModelNodeTraits( ISyntaxNode node )
	{
		DataModelNodeTraits traits;
		if (node.getTraits() instanceof DataModelNodeTraits)
			traits = (DataModelNodeTraits) node.getTraits();
		else
			throw new RuntimeException( "illegal node" );
		return traits;
	}
	
	@Override
	protected void init(ISyntaxNode node) throws IOException 
	{
		DataModelNodeTraits traits = this.getDataModelNodeTraits( node );
		this.m_fileWriter = new FileWriter( traits.getName() + ".h" );
	}

	@Override
	protected void emitFileHeader(ISyntaxNode node) throws IOException 
	{
		DataModelNodeTraits traits = this.getDataModelNodeTraits( node );
		this.m_fileWriter.write( "#ifndef " + traits.getName().toUpperCase()  + "_H_\n");
		this.m_fileWriter.write( "#define " + traits.getName().toUpperCase()  + "_H_\n" );
	}

	@Override
	protected void emitFileFooter(ISyntaxNode node) throws IOException 
	{
		this.m_fileWriter.write( "#endif\n");
	}

	@Override
	protected void emitDataHeader(ISyntaxNode node) throws IOException 
	{
		this.m_fileWriter.write( "typedef struct \n{");
	}

	@Override
	protected void emitDataBody(ISyntaxNode node) throws IOException 
	{
		//TODO
		DataModelNodeTraits traits = this.getDataModelNodeTraits( node );
		this.m_fileWriter.write( "\t\n" );
	}

	@Override
	protected void emitDataFooter(ISyntaxNode node) throws IOException 
	{
		DataModelNodeTraits traits = this.getDataModelNodeTraits( node );
		this.m_fileWriter.write( "} " + traits.getName() + "\n" );
	}

}
