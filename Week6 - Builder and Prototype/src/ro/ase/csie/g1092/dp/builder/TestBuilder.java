package ro.ase.csie.g1092.dp.builder;

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
		
	SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100).build();
	superman.superPower = "Fly";

	
	
	}
}
