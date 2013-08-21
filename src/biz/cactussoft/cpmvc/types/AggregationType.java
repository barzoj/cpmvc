package biz.cactussoft.cpmvc.types;

public class AggregationType extends SimpleType 
{
	
	public static AggregationType createAggregationType(SimpleType underlyingType) 
	{
		return new AggregationType(underlyingType);
	}

	protected SimpleType m_underlyingType;
	
	public SimpleType getUnderlyingType()
	{
		return this.m_underlyingType;
	}
	
	protected AggregationType( SimpleType underlyingType ) 
	{
		super( BuiltInType.AggregationType, BuiltInType.AggregationType.toString() );
		this.m_underlyingType = underlyingType;
	}
	
	public String getTypeName()
	{
		return this.m_type.toString() + "of" + this.m_underlyingType.getTypeName();
	}
	
	public boolean equals( Object obj )
	{
		if ( this == obj )
			return true;
		
		if ( this.getClass() != obj.getClass() )
			return false;
		
		return this.m_type == ((AggregationType)(obj)).getType() && this.m_underlyingType.equals( obj );
	}
	
	public int hashCode()
	{
		return (this.m_type.toString() + this.m_underlyingType.getTypeName().toString()).hashCode();
	}
}
