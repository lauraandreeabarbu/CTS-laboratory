package ro.ase.csie.g1092.dp.strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += points;
		
	}

}
