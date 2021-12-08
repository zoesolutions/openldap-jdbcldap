package com.octetstring.jdbcLdap.sql;

public class Mappings extends Object
{
	public static java.util.HashMap intstonames=new java.util.HashMap();
	public static java.util.HashMap supported=new java.util.HashMap();
	public static java.util.HashMap namestoints=new java.util.HashMap();
	public static java.util.List typeswithlength=new java.util.LinkedList();
	public static java.util.List typeswithdecimals=new java.util.LinkedList();
	public static NameIDMapping[] mappings=null;
	public static java.util.Map<Integer, Class> sqljavamapping=new java.util.HashMap();
	static
	{
		sqljavamapping.put(Integer.valueOf(java.sql.Types.DOUBLE), Double.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.INTEGER), Integer.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.CHAR), String.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.FLOAT), Float.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.BIGINT),java.math.BigInteger.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.BINARY),byte[].class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.BIT), Boolean.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.BLOB),byte[].class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.BOOLEAN), Boolean.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.DATE),java.sql.Date.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.DECIMAL),java.math.BigDecimal.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.LONGVARBINARY),byte[].class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.NUMERIC),java.math.BigDecimal.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.SMALLINT), Short.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.TIME),java.sql.Time.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.TIMESTAMP),java.sql.Timestamp.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.TINYINT), Byte.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.VARBINARY),byte[].class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.VARCHAR), String.class);
		sqljavamapping.put(Integer.valueOf(java.sql.Types.CLOB),char[].class);
		typeswithdecimals.add(Integer.valueOf(java.sql.Types.DECIMAL));
		typeswithdecimals.add(Integer.valueOf(java.sql.Types.NUMERIC));
//		typeswithdecimals.add(java.lang.Integer.valueOf(java.sql.Types.FLOAT));
//		typeswithdecimals.add(java.lang.Integer.valueOf(java.sql.Types.DOUBLE));
		typeswithlength.add(Integer.valueOf(java.sql.Types.VARCHAR));
		typeswithlength.add(Integer.valueOf(java.sql.Types.DECIMAL));
		typeswithlength.add(Integer.valueOf(java.sql.Types.NUMERIC));
//		typeswithlength.add(java.lang.Integer.valueOf(java.sql.Types.INTEGER));
		typeswithlength.add(Integer.valueOf(java.sql.Types.CHAR));
//		typeswithlength.add(java.lang.Integer.valueOf(java.sql.Types.FLOAT));
//		typeswithlength.add(java.lang.Integer.valueOf(java.sql.Types.DOUBLE));
//		typeswithlength.add(java.lang.Integer.valueOf(java.sql.Types.TIMESTAMP));
		intstonames.put(Integer.valueOf(java.sql.Types.ARRAY),"ARRAY");
		intstonames.put(Integer.valueOf(java.sql.Types.BIGINT),"BIGINT");
		intstonames.put(Integer.valueOf(java.sql.Types.BINARY),"BINARY");
		intstonames.put(Integer.valueOf(java.sql.Types.BIT),"BIT");
		intstonames.put(Integer.valueOf(java.sql.Types.BLOB),"BLOB");
		intstonames.put(Integer.valueOf(java.sql.Types.BOOLEAN),"BOOL");
		intstonames.put(Integer.valueOf(java.sql.Types.CHAR),"CHAR");
		intstonames.put(Integer.valueOf(java.sql.Types.CLOB),"CLOB");
		intstonames.put(Integer.valueOf(java.sql.Types.DATALINK),"DATALINK");
		intstonames.put(Integer.valueOf(java.sql.Types.DATE),"DATE");
		intstonames.put(Integer.valueOf(java.sql.Types.DECIMAL),"DECIMAL");
		intstonames.put(Integer.valueOf(java.sql.Types.DISTINCT),"DISTINCT");
		intstonames.put(Integer.valueOf(java.sql.Types.DOUBLE),"NUMERIC");
		intstonames.put(Integer.valueOf(java.sql.Types.FLOAT),"FLOAT");
		intstonames.put(Integer.valueOf(java.sql.Types.INTEGER),"INTEGER");
		intstonames.put(Integer.valueOf(java.sql.Types.JAVA_OBJECT),"JAVA_OBJECT");
		intstonames.put(Integer.valueOf(java.sql.Types.LONGVARBINARY),"LONGVARBINARY");
		intstonames.put(Integer.valueOf(java.sql.Types.LONGVARCHAR),"LONGVARCHAR");
		intstonames.put(Integer.valueOf(java.sql.Types.NULL),"NULL");
		intstonames.put(Integer.valueOf(java.sql.Types.NUMERIC),"NUMERIC");
		intstonames.put(Integer.valueOf(java.sql.Types.OTHER),"OTHER");
		intstonames.put(Integer.valueOf(java.sql.Types.REAL),"REAL");
		intstonames.put(Integer.valueOf(java.sql.Types.REF),"REF");
		intstonames.put(Integer.valueOf(java.sql.Types.SMALLINT),"SMALLINT");
		intstonames.put(Integer.valueOf(java.sql.Types.STRUCT),"STRUCT");
		intstonames.put(Integer.valueOf(java.sql.Types.TIME),"TIME");
		intstonames.put(Integer.valueOf(java.sql.Types.TIMESTAMP),"TIMESTAMP");
		intstonames.put(Integer.valueOf(java.sql.Types.TINYINT),"TINYINT");
		intstonames.put(Integer.valueOf(java.sql.Types.VARBINARY),"VARBINARY");
		intstonames.put(Integer.valueOf(java.sql.Types.VARCHAR),"VARCHAR");
		namestoints.put("VARCHAR", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("varchar", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("string", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("xs:string", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put(".String", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("Edm.String", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put(".Guid", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("Edm.Guid", Integer.valueOf(java.sql.Types.VARCHAR));
		namestoints.put("INTEGER", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("integer", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("INT", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("int", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put(".Int32", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("Edm.Int32", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("BYTE", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put("byte", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put(".Byte", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put("Edm.Byte", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put("tinyint", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put("xs:byte", Integer.valueOf(java.sql.Types.TINYINT));
		namestoints.put("xs:int", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("xs:integer", Integer.valueOf(java.sql.Types.INTEGER));
		namestoints.put("FLOAT", Integer.valueOf(java.sql.Types.FLOAT));
		namestoints.put("float", Integer.valueOf(java.sql.Types.FLOAT));
		namestoints.put("xs:float", Integer.valueOf(java.sql.Types.FLOAT));
		namestoints.put("DOUBLE", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put("double", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put("xs:double", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put(".Double", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put("Edm.Double", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put(".Single", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put("Edm.Single", Integer.valueOf(java.sql.Types.DOUBLE));
		namestoints.put("DATE", Integer.valueOf(java.sql.Types.DATE));
		namestoints.put("DATETIME", Integer.valueOf(java.sql.Types.DATE));
		namestoints.put("datetime", Integer.valueOf(java.sql.Types.DATE));
		namestoints.put("date", Integer.valueOf(java.sql.Types.DATE));
		namestoints.put("xs:date", Integer.valueOf(java.sql.Types.DATE));
		namestoints.put("TIMESTAMP", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("timestamp", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("dateTime", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("xs:dateTime", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put(".DateTime", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("Edm.DateTime", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put(".DateTimeOffset", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("Edm.DateTimeOffset", Integer.valueOf(java.sql.Types.TIMESTAMP));
		namestoints.put("TIME", Integer.valueOf(java.sql.Types.TIME));
		namestoints.put("time", Integer.valueOf(java.sql.Types.TIME));
		namestoints.put("xs:time", Integer.valueOf(java.sql.Types.TIME));
		namestoints.put(".Time", Integer.valueOf(java.sql.Types.TIME));
		namestoints.put("Edm.Time", Integer.valueOf(java.sql.Types.TIME));
		namestoints.put("DECIMAL", Integer.valueOf(java.sql.Types.DECIMAL));
		namestoints.put("decimal", Integer.valueOf(java.sql.Types.DECIMAL));
		namestoints.put("xs:decimal", Integer.valueOf(java.sql.Types.DECIMAL));
		namestoints.put(".Decimal", Integer.valueOf(java.sql.Types.DECIMAL));
		namestoints.put("Edm.Decimal", Integer.valueOf(java.sql.Types.DECIMAL));
		namestoints.put("NUMERIC", Integer.valueOf(java.sql.Types.NUMERIC));
		namestoints.put("numeric", Integer.valueOf(java.sql.Types.NUMERIC));
		namestoints.put("xs:numeric", Integer.valueOf(java.sql.Types.NUMERIC));
		namestoints.put(".Int64", Integer.valueOf(java.sql.Types.NUMERIC));
		namestoints.put("Edm.Int64", Integer.valueOf(java.sql.Types.NUMERIC));
		namestoints.put("BIT", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("BOOL", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("bool", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("BOOLEAN", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("boolean", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("xs:boolean", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put(".Boolean", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("Edm.Boolean", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("SHORT", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put("short", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put("xs:short", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put(".Int16", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put("Edm.Int16", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put(".SByte", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put("Edm.SByte", Integer.valueOf(java.sql.Types.SMALLINT));
		namestoints.put("BOOLEAN", Integer.valueOf(java.sql.Types.BOOLEAN));
		namestoints.put("BLOB", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put("base64Binary", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put("xs:base64Binary", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put(".Binary", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put("Edm.Binary", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put(".Stream", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put("Edm.Stream", Integer.valueOf(java.sql.Types.BLOB));
		namestoints.put("VARBINARY", Integer.valueOf(java.sql.Types.VARBINARY));
		namestoints.put("varbinary", Integer.valueOf(java.sql.Types.VARBINARY));
		namestoints.put("xs:long", Integer.valueOf(java.sql.Types.BIGINT));
		namestoints.put("long", Integer.valueOf(java.sql.Types.BIGINT));
		namestoints.put("CLOB", Integer.valueOf(java.sql.Types.CLOB));
		namestoints.put("LONGVARCHAR", Integer.valueOf(java.sql.Types.LONGVARCHAR));
		namestoints.put(".GeographyPoint", Integer.valueOf(java.sql.Types.OTHER));
		namestoints.put("Edm.GeographyPoint", Integer.valueOf(java.sql.Types.OTHER));
		supported.put(Integer.valueOf(java.sql.Types.BIT),"BIT");
		supported.put(Integer.valueOf(java.sql.Types.BLOB),"BLOB");
		supported.put(Integer.valueOf(java.sql.Types.BOOLEAN),"BOOL");
		supported.put(Integer.valueOf(java.sql.Types.CHAR),"CHAR");
		supported.put(Integer.valueOf(java.sql.Types.DATE),"DATE");
		supported.put(Integer.valueOf(java.sql.Types.DECIMAL),"DECIMAL");
		supported.put(Integer.valueOf(java.sql.Types.INTEGER),"INTEGER");
		supported.put(Integer.valueOf(java.sql.Types.NUMERIC),"NUMERIC");
		supported.put(Integer.valueOf(java.sql.Types.SMALLINT),"SMALLINT");
		supported.put(Integer.valueOf(java.sql.Types.TIME),"TIME");
		supported.put(Integer.valueOf(java.sql.Types.TIMESTAMP),"TIMESTAMP");
		supported.put(Integer.valueOf(java.sql.Types.TINYINT),"TINYINT");
		supported.put(Integer.valueOf(java.sql.Types.VARCHAR),"VARCHAR");
		supported.put(Integer.valueOf(java.sql.Types.CLOB),"CLOB");
		mappings=new NameIDMapping[supported.size()];
		int index=0;
		for(java.util.Iterator i=supported.entrySet().iterator();i.hasNext();++index)
		{
			java.util.Map.Entry t=(java.util.Map.Entry)i.next();
			mappings[index]=new TypeInformation(((Integer)t.getKey()).intValue(),t.getValue().toString());
		}
	}
	private Mappings()
	{
		super();
	}
	public static NameIDMapping createNameIDMapping(int id, String name)
	{
		return new TypeInformation(id,name);
	}
	public interface NameIDMapping
	{
		public int getId();
		public String getName();
	}
	static class TypeInformation extends Object implements NameIDMapping
	, Comparable
	{
		private int id=0;
		private String name="";

		TypeInformation(int i, String n)
		{
			super();
			id=i;
			name=n;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public String toString()
		{
			return name;
		}
		public int hashCode()
		{
			return name.hashCode();
		}
		public boolean equals(Object other)
		{
			boolean rv=((other!=null)&&(NameIDMapping.class.isAssignableFrom(other.getClass())));
			if(rv)
				rv=name.equals(((NameIDMapping)other).getName());
			return rv;
		}
		//Implementation of interface java.lang.Comparable
		public int compareTo(Object object0)
		{
			return name.compareTo(((NameIDMapping)object0).getName());
		}
	}
}
