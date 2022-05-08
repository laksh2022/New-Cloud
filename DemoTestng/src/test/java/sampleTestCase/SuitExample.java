package sampleTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuitExample {

	WebDriver driver;
	@BeforeSuite
	public void suitdemo()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
	}
	@Test
	public void GetUrl()
	{
		driver.get("https://www.google.com/");
		WebElement ClickGoogle = driver.findElement(By.name("q"));
	}
	@Test
	public void ClickUrl()
	{
		WebElement ClickGoogle = driver.findElement(By.name("q"));
		ClickGoogle.sendKeys("Google"+ Keys.ENTER);

	}
	@AfterSuite
	public void CloseBrowser()
	{
		driver.quit();
	}
}
