package ro.ase.csie.g1092.dp.command;

public class TestCommand {

	
	public static void main(String[] args)
	{
		TaskManager manager = new TaskManager();
		
		manager.addAsyncTask(new AsyncCommand("Autosave", new BackupModule()));
		manager.addAsyncTask(new AsyncCommand("Update 3d models", new UpdateModule()));
		
		System.out.println("game is running");
		
		manager.execute();
		manager.execute();
		manager.execute();
		
		System.out.println("Game is running");
		
		}
}
