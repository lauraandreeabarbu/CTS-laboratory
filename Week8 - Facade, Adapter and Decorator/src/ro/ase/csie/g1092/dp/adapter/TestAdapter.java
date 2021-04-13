package ro.ase.csie.g1092.dp.adapter;

public class TestAdapter {

	public static void main(String[] args) {

		
		FantasyHero blueDragon = new FantasyHero("Blue Dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);

	}

}
