package sampleMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookXpath {
public static void main(String[]args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	
	System.out.println(driver.findElement(By.xpath("//input[contains(@name,'email')]")));
	
	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("ramanv9626");
	
	System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")));
	
	driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("123456789");
	
	System.out.println(driver.findElement(By.xpath("//button[@name='login'and@type='submit']")));
	
	
	 driver.findElement(By.xpath("//button[@name='login'and@type='submit']")).click();
	 
	System.out.println(driver.findElement(By.xpath("//h2[normalize-space(text()='Facebook helps you connect and share with the people in your life.')]")));
	
}
}
