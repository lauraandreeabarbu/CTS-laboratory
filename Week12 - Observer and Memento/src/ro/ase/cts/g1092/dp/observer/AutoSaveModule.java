package ro.ase.cts.g1092.dp.observer;

public class AutoSaveModule implements NetworkStatusHandlerInterface{

	@Override
	public void connectionDown() {
		System.out.println("Create a local copy of the data");
		
	}

	@Override
	public void connectionUp() {
		System.out.println("Reloading game level");
		
	}

}