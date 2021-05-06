package ro.ase.csie.g1092.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		LoginInterface loginModule = new LoginModule("10.0.0.1", "users");
		
		if(loginModule.login("admin", "1234admin"))
		{
			System.out.println("Hello admin!");
		}
		else
		{
			System.out.println("Wrong credentials");
		}

		String[] passwords = new String[] {"1234", "12345", "admin", "root", "1234admin"};
		for(String pass : passwords)
		{
			if(loginModule.login("admin", pass))
			{
				System.out.println("Found it | is " + pass);
				break;
			}
		}
		
	}

}
