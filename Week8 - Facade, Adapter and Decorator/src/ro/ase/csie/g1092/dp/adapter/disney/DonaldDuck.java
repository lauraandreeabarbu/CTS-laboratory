package ro.ase.csie.g1092.dp.adapter.disney;

public class DonaldDuck implements DisneyActions{

	public final String name = "Donald Duck";
	int powerLevel;
	
	public DonaldDuck(int powerLevel) {
		super();
		this.powerLevel = powerLevel;
	}

	public void changeLocation(int x, int y) {
		System.out.println("Move to a new location");
		
	}

	public void isWounded(int power) {
		powerLevel -= power;
		System.out.println("Power decreased to" + powerLevel);
		
	}

	public void restorePower(int power) {
		powerLevel += power;
		System.out.println("Power increased to" + powerLevel);
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.powerLevel;
	}
	

}
