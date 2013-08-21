package biz.cactussoft.cpmvc.logic.exceptions;

public class TypeNotFoundException extends TranslatorException {

	
	protected String m_typeName;
	
	public String getTypeName()
	{
		return this.m_typeName;
	}
	
	public TypeNotFoundException(String fileName, int line, String typeName) 
	{
		super(fileName, line);
		this.m_typeName = typeName;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -3874138403429774465L;

}
