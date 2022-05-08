package sampleTestCase;

import org.testng.annotations.Test;

public class Dependsonmethod {
	
	@Test (enabled=true)
	public void AppleMobile()
	{
		System.out.println("This is Iphone");
	}
	@Test (dependsOnMethods = "AppleMobile")
	public void VivoMobile()
	{
		System.out.println("This is Vivo Phone");
	}
	@Test (dependsOnMethods = "VivoMobile")
	public void MotoMobile()
	{
		System.out.println("This is Motorola Phone");
	}
}

