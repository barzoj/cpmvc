package biz.cactussoft.cpmvc.emitters;

import java.io.IOException;

import biz.cactussoft.cpmvc.syntax.ISyntaxNode;

public interface IMvcEmitter 
{
	public void emit( ISyntaxNode root ) throws IOException;
}
