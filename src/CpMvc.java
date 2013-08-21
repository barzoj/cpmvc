
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import biz.cactussoft.cpmvc.*;
import biz.cactussoft.cpmvc.emitters.IMvcEmitter;
import biz.cactussoft.cpmvc.emitters.cpp.CppEmitter;
import biz.cactussoft.cpmvc.logic.CpMvcTranslator;

public class CpMvc {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		FileInputStream fis;
		String fileName =  "test/test.mvc";
		try
		{
			fis = new FileInputStream( fileName );
		}
		catch ( FileNotFoundException ex )
		{
			System.out.print( "file not found at path " ); 
			try {
				System.out.println( new java.io.File(".").getCanonicalPath() );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		ANTLRInputStream input;
		try
		{
			input = new ANTLRInputStream( fis );
		}
		catch ( IOException ex )
		{
			System.out.println( "ioexcp" );
			return;
		}
		cpmvcLexer lexer = new cpmvcLexer( input );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		cpmvcParser parser = new cpmvcParser( tokens );
		ParseTree tree = parser.mvc();
		ParseTreeWalker walker = new ParseTreeWalker();
		CpMvcTranslator translator = new CpMvcTranslator( fileName );
		walker.walk( translator, tree );
		
		IMvcEmitter emitter = new CppEmitter();
		
		try
		{
			emitter.emit( translator.getRootNode() );
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
