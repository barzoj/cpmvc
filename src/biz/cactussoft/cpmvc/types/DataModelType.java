package biz.cactussoft.cpmvc.types;

import java.util.HashMap;

public class DataModelType extends SimpleType 
{
	public static DataModelType createDataModelType(String name,
			HashMap<String, SimpleType> attributes) {
		return new DataModelType(name, attributes);
	}

	protected HashMap<String, SimpleType> m_attributes;
	
	public String getTypeName()
	{
		return this.m_name;
	}
	
	public HashMap<String, SimpleType> getAttributes()
	{
		return this.m_attributes;
	}
	
	private DataModelType( String name, HashMap<String, SimpleType> attributes )
	{
		super( BuiltInType.DataModelType, name );
		this.m_attributes = attributes;
	}
	
	public boolean equals( Object obj )
	{
		if ( this == obj )
			return true;
		if ( this.getClass() != obj.getClass() )
			return false;
		return this.m_name == ((DataModelType)obj).getTypeName();
	}
	
	public int hashCode()
	{
		return this.m_name.hashCode();
	}
}
