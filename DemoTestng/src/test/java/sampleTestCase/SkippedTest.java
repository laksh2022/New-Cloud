package sampleTestCase;

import org.testng.annotations.Test;
import org.testng.SkipException;


public class SkippedTest {

	@Test (priority=0)
	public void firstTestCase() {
		System.out.println("This is the first test case");
	}
	@Test (priority=1)
	public void secondTestCase() {
		System.out.println("This is the second test case");
	}
	
	@Test (priority=2, enabled=true)
	public void thirdTestCase() {
		System.out.println("This is the third test case");
		throw new SkipException("Skipping Test 1 as flag is false.");
	}
	@Test (priority=3)
	public void fourthTestCase() {
		System.out.println("This is the fourth test case");
}
	}
