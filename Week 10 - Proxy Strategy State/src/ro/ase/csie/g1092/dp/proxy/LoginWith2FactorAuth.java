package ro.ase.csie.g1092.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface {

	LoginInterface loginModule = null;
	
	public LoginWith2FactorAuth(LoginInterface loginModule)
	{
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code)
	{
		if(code == 1245)
		{
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean login(String username, String pass) {
		if (loginModule.login(username, pass))
		{
			System.out.println("Please input the generated code that you have received via SMS/email");
			System.out.println("check received code");
			if(checkGeneratedCode(1245))
			{
				System.out.println("Hello"+ username);
				return true;
			}
			else
			{
				System.out.println("code not correct");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
	return this.loginModule.checkServerStatus();
	}

	
}
