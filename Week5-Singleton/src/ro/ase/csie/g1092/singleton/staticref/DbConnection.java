package ro.ase.csie.g1092.singleton.staticref;

public class DbConnection {

	String connString;
	String schema;
	
	//eager-instantiation
	public final static DbConnection connection = new DbConnection();
	
	//static class initializer
	static {
		//called only once before the class is loaded by the Java Virtual Machine
		System.out.println("Hello, DbConnection is loaded");
		connection.connString = "10.0.0.1:1443";
		connection.schema = "tempData";
	}
	
	//constructor initializer
	{
		//called everytime before any constructor call
		System.out.println("Building an object");
	}
	
	
	//if u don't define it, you get the free public version of the default constr
	private DbConnection()
	{
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration ");
		this.connString = "127.0.0.1:1443";
		this.schema = "cts";
	
	}
	
}
