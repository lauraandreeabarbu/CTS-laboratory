package ro.ase.cts.g1092.testing.main;

import ro.ase.cts.g1092.testing.models.MathOperations;

public class App {

	public static void main(String[] args) {
		System.out.println("app started");
	
		int a = 5;
		int b = 6;
		int expectedResult = 11;
		int actualResult = MathOperations.add(a, b);
		if(actualResult == expectedResult)
		{
			System.out.println("I know how to add");
		}
		else
		{
			System.out.println("Let's get some math classes");
		}
	
	}
	
}
