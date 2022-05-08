package sampleTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name="agni";
	
	@Test
	public void checkEqual()
	{
		Assert.assertNotEquals(name, "Agni");
	}
}
