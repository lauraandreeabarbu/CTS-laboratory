package ro.ase.csie.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable {

	String colour;
	int height;

	ArrayList<Integer> points;
	
	public Tree3DModel(String colour, int height)
	{
		this.colour = colour;
		this.height = height;
		
		System.out.println("Loading the 3D Model ...");
		try{
			Thread.sleep(2000);
			Random random = new Random(1000);
			this.points = new ArrayList<>();
			for (int i = 0; i<20; i++)
			{
				this.points.add(random.nextInt(100));
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Model loaded");
		
	}
	
	private Tree3DModel()
	{
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		//return super.clone();
		
		Tree3DModel copy = new Tree3DModel();
		copy.colour=this.colour;
		copy.height=this.height;
		copy.points = (ArrayList<Integer>) this.points.clone();
		
		return copy;
		
	}
	
	
	


}
