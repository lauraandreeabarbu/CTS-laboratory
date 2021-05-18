package ro.ase.cts.g1092.dp.memento;

import java.util.Date;

public class SuperHeroMemento {

	String name;
	private int lifePoints;
	String magic;
	
	Date timeStamp;

	public SuperHeroMemento(String name, int lifePoints, String magic, Date timeStamp) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timeStamp = new Date();
	}
	
	public String getName() {
		return name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public String getMagic() {
		return magic;
	}
}
