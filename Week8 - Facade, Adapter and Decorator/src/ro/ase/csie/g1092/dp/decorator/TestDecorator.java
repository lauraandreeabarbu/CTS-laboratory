package ro.ase.csie.g1092.dp.decorator;

import ro.ase.csie.g1092.dp.adapter.ACMESuperHero;
import ro.ase.csie.g1092.dp.adapter.FantasyHero;

public class TestDecorator {

	public static void main(String[] args)
	{
		ACMESuperHero blueDragon = new FantasyHero("Blue Dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		//blueDragon.heal(250);
		
		//ACMESuperHerp blueDragonwithShield = 
		blueDragon = new ShieldDecorator(blueDragon, 300);
		blueDragon.takeAHit(500);
		
		blueDragon = new WoundedDecorator(blueDragon);
		blueDragon.takeAHit(500);
		blueDragon.move();
		
	}
}
