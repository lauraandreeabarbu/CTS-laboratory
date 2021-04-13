package ro.ase.csie.g1092.dp.facade;

public class UserAPIFacade {

	public static UserProfile getUserProfile(String serverIP, String username, String pass)
	{
		GameServer gameServer = new GameServer();
		gameServer.connect(serverIP);
		if(gameServer.isConnected())
		{
			UserAccount user = new UserAccount();
			user.login(username, pass);
			
			UserProfile profile = user.downloadUserProfile();
			return profile;
		}
		else
		{
			return null;
		}
	}
}
