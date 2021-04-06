package ro.ase.csie.g1092.dp.simplefactory;

public class SuperHero {

	String name;
	
	AbstractWeapon weapon;

	public SuperHero(String name, AbstractWeapon weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}

	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
	
}
