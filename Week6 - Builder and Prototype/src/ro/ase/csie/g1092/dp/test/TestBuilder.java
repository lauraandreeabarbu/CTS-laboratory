package ro.ase.csie.g1092.dp.test;

import ro.ase.csie.g1092.dp.builder.Pistol;
import ro.ase.csie.g1092.dp.builder.SuperHero;

public class TestBuilder {

	public static void main(String[] args)
	{
		//1. Create the object
		//SuperHero superHero = new SuperHero();
		//2. Init the object
		//DON'T FORGET
		//superHero.name="Superman";
		//superHero.lifePoints = 100;
		//superHero.superPower = "Can fly";
		//superHero.superPower = "Laser eyes";
		
		//SuperHero superHero = 
			//	new SuperHero("Superman", 100, false, false, null,
				//		new Pistol(), "Laser eyes", null);
		

		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("fly")
				.addLeftWeapon(new Pistol())
				.build();

		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addSuperPower("fly")
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	
	}
}
