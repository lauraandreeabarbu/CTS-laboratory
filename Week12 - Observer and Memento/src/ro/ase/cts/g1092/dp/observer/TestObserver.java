package ro.ase.cts.g1092.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		NetworkMonitorModule monitor = new NetworkMonitorModule();
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		
		NetworkStatusHandlerInterface autosave = new AutoSaveModule();
		NetworkStatusHandlerInterface notifications = new UINotificationModule();
		
		monitor.register(autosave);
		monitor.register(notifications);

		monitor.networkStatusChanged(NetworkStatus.DOWN);
		
		monitor.unregister(notifications);
	
		monitor.networkStatusChanged(NetworkStatus.UP);
	}
	
}
