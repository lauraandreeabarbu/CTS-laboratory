package ro.ase.csie.g1092.dp.simplefactory;

public abstract class AbstractWeapon {

	protected String description; //protected = any class that extends this have access to the attributes
	protected int powerLevel;
	
	
	public void setDescription(String description) {
		this.description = description;
	}




	public abstract void pewPew();
	
	
}
