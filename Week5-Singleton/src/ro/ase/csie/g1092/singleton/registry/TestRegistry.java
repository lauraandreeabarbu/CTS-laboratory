package ro.ase.csie.g1092.singleton.registry;

public class TestRegistry {
	public static void main(String[] args) {
		
		DbConnection con1 = DbConnection.getDbConnection("120.0.0.1", "devDB");
		DbConnection con2 = DbConnection.getDbConnection("120.0.0.1", "devDB");
	
	
		if(con1 == con2) {
			System.out.println("theu are the same");
		}
	
		DbConnection con3 = DbConnection.getDbConnection("10.0.0.1", "prodDB");
	

		if(con2 != con3) {
			System.out.println("they are different");
		}
		
		DbConnection con4 = DbConnection.getDbConnection("89.0.0.1", "prodDB");
	
	}
}
