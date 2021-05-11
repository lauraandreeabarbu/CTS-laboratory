package ro.ase.csie.g1092.dp.command;

public class BackupModule implements GameModuleInterface {

	@Override
	public void doTask(String taskName) {
		System.out.println("Backing up..." + taskName);
		
	}

	
}
