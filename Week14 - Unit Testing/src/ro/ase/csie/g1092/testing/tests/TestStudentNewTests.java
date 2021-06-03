package ro.ase.csie.g1092.testing.tests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.g1092.testing.exceptions.WrongGradesException;
import ro.ase.csie.g1092.testing.models.Student;

public class TestStudentNewTests {

	//text fixture
	static Student student;
	static String initialName;
	static ArrayList<Integer> grades;
	static int initialAge;
	static int initialNoGrades;
	
	
	static ArrayList<Integer> performanceGrades;
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		initialName = "John Doe";
		initialAge = Student.MIN_AGE + 1;
		initialNoGrades = 3;
		grades = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < initialNoGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE));
		}
	
		
	    performanceGrades = new ArrayList<>();
		int noGrades = (int) 1e6;
		for (int i = 0; i < noGrades; i++)
		{
			performanceGrades.add(random.nextInt(Student.MAX_AGE)+1);
		}
		
		
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeMaxValue() throws WrongAgeException
	{
		int newAge = Integer.MAX_VALUE;
		student.setAge(newAge);
	}
	
	
	@Test (expected = WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException
	{
		int newAge = 200;
		student.setAge(newAge);
	}
	
	
	@Test 
	public void testSetAgeBoundaryLowLimit() throws WrongAgeException
	{
		int newAge = Student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age lower limit", newAge, student.getAge());
	}
	
	@Test
	public void testSetBoundaryUpperLimit() throws WrongAgeException
	{
		int newAge = Student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age upper limit", newAge, student.getAge());
		
	}
	
	
	@Test
	public void testSetGradesReferenceDeepCopy() throws WrongGradesException
	{
		int[] grades = new int[] {9,9,10};
		ArrayList<Integer> refGrades = new ArrayList<>();
		for (int grade : grades)
		{
			refGrades.add(grade);
		}
		
		
		
		
		student.setGrades(refGrades);
		
		refGrades.set(0, 5);
		
		int[] studentGrades = new int[student.getNoGrades()];
		for (int i = 0; i < student.getNoGrades(); i++)
		{
			studentGrades[i] = student.getGrade(i);
		}
		
		assertEquals("we do shallow copy", grades, studentGrades);
	}
	
	
	@Test
	public void testGetGradesAveragePerformance() throws WrongGradesException {
		ArrayList<Integer> grades = new ArrayList<>();
		int noGrades = (int) 1e6;
		Random random = new Random();
		for (int i = 0; i < noGrades; i++)
		{
			grades.add(random.nextInt(Student.MAX_AGE)+1);
		}
		student.setGrades(grades);
		
		long tStart = System.currentTimeMillis();
		student.getGradesAverage();
		long tFinal = System.currentTimeMillis();
		
		long delta = tFinal - tStart;
		long performanceLimit = 12;
		if (delta <= performanceLimit)
		{
			assertTrue(true);
		}
		else
		{
			fail("Takes too long");
		}
		
	}
	
	
	
	@Test(timeout = 22) //measuring the time for the entire unit test
	public void testGetGradesAVeragePerformance2() throws WrongGradesException
	{
		student.setGrades(performanceGrades);
		student.getGradesAverage();
	}
	
	@Test
	public void testSetAgeInverse() throws WrongAgeException
	{
		//we will check if the value has been changed
		int newAge = initialAge + 1;
		student.setAge(newAge);
		assertNotEquals("setAge is not changing the age value", initialAge, student.getAge());

	}
	
	@Test
	public void testGetMinGradeInverse() throws WrongGradesException
	{
		student.setGrades(performanceGrades);
		
		int minGrade = student.getMinGrade();
		for (int grade : performanceGrades)
		{
			if (minGrade > grade)
			{
				fail("the value is not minimum");
			}
		}
		assertTrue(true);
	}
	
	@Test
	public void testGetMinCrossCheck() throws WrongGradesException
	{
		student.setGrades(performanceGrades);
		
		int expectedMin = Collections.min(performanceGrades);
		int computedMin = student.getMinGrade();
		
		assertEquals("Min is not correct", expectedMin, computedMin);
	}
	
	
	
	
	
	
	
}













