package ro.ase.cts.g1092.dp.memento;

public class SuperHero {

	String name;
	private int lifePoints;
	String magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("is attacking...");
	}
	
	public void heal() {
		System.out.println("is healing...");
	}
	
	public void move() {
		System.out.println("is moving...");
	}
	
	public SuperHeroMemento save() {
		return new SuperHeroMemento(name, lifePoints, magic, null);
	}
	
	public void load(SuperHeroMemento memento)
	{
		this.name = memento.getName();
		this.lifePoints = memento.getLifePoints();
		this.magic = memento.getMagic();
	}

	
}






