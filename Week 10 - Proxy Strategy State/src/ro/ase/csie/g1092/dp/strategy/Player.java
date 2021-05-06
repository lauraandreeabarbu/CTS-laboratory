package ro.ase.csie.g1092.dp.strategy;

public class Player {

	String username;
	int playTime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCampaign = null;
	
	public void setBonusCampaign(BonusStrategyInterface bonusCampaign)
	{
		this.bonusCampaign = bonusCampaign;
	}
	
	public Player(String username, int playTime, int experiencePoints) {
		super();
		this.username = username;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExpPoints(int pointsReceived)
	{
		if(this.bonusCampaign != null)
		{
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
		}
		
	}
	
	
}
