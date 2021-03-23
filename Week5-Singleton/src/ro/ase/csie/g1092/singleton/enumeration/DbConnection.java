package ro.ase.csie.g1092.singleton.enumeration;

public enum DbConnection {

	DEV_DB;
	
	String connString;
	String schema;


	private DbConnection()
	{
		System.out.println("Loading settings from the config file");
	
	}



}
