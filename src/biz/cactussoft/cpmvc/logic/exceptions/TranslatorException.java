package biz.cactussoft.cpmvc.logic.exceptions;

public class TranslatorException extends RuntimeException
{
	
	protected String m_fileName;
	protected int m_line;
	
	public String getFileName()
	{
		return this.m_fileName;
	}
	
	public int getLine()
	{
		return this.m_line;
	}
	
	public TranslatorException( String fileName, int line )
	{
		this.m_fileName = fileName;
		this.m_line = line;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2916331951001636088L;

}
