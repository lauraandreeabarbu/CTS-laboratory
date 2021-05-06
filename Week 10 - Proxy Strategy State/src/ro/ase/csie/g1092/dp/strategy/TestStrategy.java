package ro.ase.csie.g1092.dp.strategy;

public class TestStrategy {

	public static void main(String[] args)
	{
		Player player = new Player("John", 10, 100);
		
		player.setBonusCampaign(new NoCampaign());
		player.getExpPoints(150);
		
		System.out.println("points: " + player.experiencePoints);

		player.setBonusCampaign(new EasterCampaign());
		player.getExpPoints(150);
		
		System.out.println("points: " + player.experiencePoints);

		player.setBonusCampaign(new SummerCampaign());
		player.getExpPoints(150);
		
		System.out.println("Points: " + player.experiencePoints);
	
	}
}
