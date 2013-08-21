package biz.cactussoft.cpmvc.logic.exceptions;

public class RedeclarationException extends TranslatorException 
{
	
	protected String m_elementName;

	public String getName()
	{
		return this.m_elementName;
	}
	
	public RedeclarationException( String fileName, int line, String name ) 
	{
		super( fileName, line );
		this.m_elementName = name;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2115164618003950464L;

}
