package biz.cactussoft.cpmvc.logic;

import java.util.HashMap;
import biz.cactussoft.cpmvc.types.SimpleType;

public class TypeTable 
{
	protected HashMap<String, SimpleType> m_table;
	
	public void addType( SimpleType type )
	{
		if  ( this.m_table.containsKey( type.getTypeName() ) )
			return;
		this.m_table.put( type.getTypeName(), type );
	}
	
	public SimpleType getType( String typeName )
	{
		if ( !this.m_table.containsKey(typeName) )
			return null;
		return this.m_table.get( typeName );
	}
	
	
	public boolean containsType( String typeName )
	{
		return this.m_table.containsKey( typeName );
	}
	
	public TypeTable()
	{
		this.m_table = new HashMap<String, SimpleType>();
		SimpleType floatType = SimpleType.createFloatType();
		this.m_table.put( floatType.getTypeName(), floatType );
		SimpleType integerType = SimpleType.createIntegerType();
		this.m_table.put( integerType.getTypeName(), integerType );
		SimpleType stringType  = SimpleType.createStringType();
		this.m_table.put( stringType.getTypeName(), stringType );
	}
	
}
