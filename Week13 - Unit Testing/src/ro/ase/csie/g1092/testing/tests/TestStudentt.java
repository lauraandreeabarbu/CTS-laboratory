package ro.ase.csie.g1092.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.g1092.testing.models.Student;

public class TestStudentt {

	Student student = null;
	static ArrayList<Integer> grades = null;
	static int initialAge = 19;
	static String initialName = "";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		grades = new ArrayList<>();
		grades.add(5);
		grades.add(9);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	grades.clear();
	grades = null;
	}

	@Before
	public void setUp() throws Exception {
	
		student = new Student(initialName, initialAge, grades);
		
	
	}

	@After
	public void tearDown() throws Exception {
		student = null;
		//even if we dont write that, it will still happen by default
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testSetNameRightValue() throws WrongNameException
	{
	
	String newName = "Alice";
	student.setName(newName);
	assertEquals("Testing with a right name", newName, student.getName());
	
	
	}

	@Test
	public void testSetAgeRightValue()
	{
		int newAge = initialAge + 1;
		try {
			student.setAge(newAge);
			assertEquals("Test for right value", newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("we got an exception for a right value");
		}
		
		
	}
	
	@Test
	public void testSetAgeErrorCondition()
	{
		int newAge = initialAge* -1;
		try {
			student.setAge(newAge);
			fail("we didn't get an exception");
		} catch (WrongAgeException e) {
			assertTrue(true); //the test has passed - opposite of fail();
		}
	}
	
	
	
	
	
	
	
	
}
