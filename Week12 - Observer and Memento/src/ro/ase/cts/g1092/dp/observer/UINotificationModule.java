package ro.ase.cts.g1092.dp.observer;

public class UINotificationModule implements NetworkStatusHandlerInterface{

	@Override
	public void connectionDown() {
		System.out.println("Alert: Connection lost");
	}

	@Override
	public void connectionUp() {
		System.out.println("Alert: Let's get back to the game");
		
	}

}
