package biz.cactussoft.cpmvc.types;

public class SimpleType 
{
	public static SimpleType createStringType() 
	{
		return new SimpleType( BuiltInType.StringType, "string" ); //TODO
	}
	
	public static SimpleType createFloatType() 
	{
		return new SimpleType( BuiltInType.FloatType, "float" );
	}
	
	public static SimpleType createIntegerType() 
	{
		return new SimpleType( BuiltInType.IntegerType, "int" );
	}
	
	protected  BuiltInType m_type;
	protected String m_name;
	
	public String getTypeName()
	{
		return this.m_name;
	}
	
	public BuiltInType getType()
	{
		return this.m_type;
	}
	
	 
	protected SimpleType(BuiltInType type, String name)
	{
		this.m_type = type;
		this.m_name = name;
	}
	
	public boolean equals( Object obj )
	{
		if ( this == obj )
			return true;
		if ( getClass() != obj.getClass() )
			return false;
	
		return this.m_type == ((SimpleType)(obj)).getType(); 
	}
	
	public int hashCode()
	{
		return this.m_type.toString().hashCode();
	}
	
}
