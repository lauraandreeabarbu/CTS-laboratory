package ro.ase.csie.g1092.dp.adapter.disney;

public interface DisneyActions {

	public String getName();
	public int getPower();
	
	
	//by default all abstract
	public void changeLocation(int x, int y);
	public void isWounded(int power);
	public void restorePower(int power);
}
