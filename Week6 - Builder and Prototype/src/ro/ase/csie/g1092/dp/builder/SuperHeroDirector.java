package ro.ase.csie.g1092.dp.builder;

public class SuperHeroDirector {

	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroDirector(SuperHero.SuperHeroBuilder builder)
	{
		this.builder = builder;
	}
	
	public SuperHero buildJoker()
	{
		return builder.isVillain()
				.addSuperPower("fly")
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}
	
	public SuperHero buildSuperman()
	{
		return builder.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	}
	
	
	
	
	
}
