package ro.ase.csie.g1092.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		GameServer gameServer = new GameServer();
		gameServer.connect("10.0.0.1");
		if(gameServer.isConnected())
		{
			UserAccount user = new UserAccount();
			user.login("player1", "1234");
			
			UserProfile profile = user.downloadUserProfile();
			profile.getUserProfile();
		}

		gameServer = new GameServer();
		gameServer.connect("10.0.0.1");
		if(gameServer.isConnected())
		{
			UserAccount user = new UserAccount();
			user.login("player1", "1234");
			
			UserProfile profile = user.downloadUserProfile();
			profile.getUserProfile();
		}
		
		UserProfile playerProfile = 
				UserAPIFacade.getUserProfile("10.0.0.1", "player1 ", "1234");
		if(playerProfile != null)
		{
			playerProfile.getUserProfile();
		}
	}

}
