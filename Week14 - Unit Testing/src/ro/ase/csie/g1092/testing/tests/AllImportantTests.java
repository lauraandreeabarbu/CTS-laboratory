package ro.ase.csie.g1092.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.g1092.testing.tests.categories.ImportantTest;
import ro.ase.csie.g1092.testing.tests.categories.PerformanceTest;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class, PerformanceTest.class})
@SuiteClasses({ TestStudentNewTests.class, TestStudentt.class })
public class AllImportantTests {

}
