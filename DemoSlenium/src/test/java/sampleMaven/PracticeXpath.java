package sampleMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'email')]")));
		
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("Laxman@123");
		
		//System.out.println(driver.findElement(By.xpath("//input[starts-with(@name, 'pass')]")));
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'pass')]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@name= 'login' or @type= 'submit']")).click();
		
		//driver.findElement(By.xpath("//button[@name= 'login' and @type= 'submit']"));
		
		driver.findElement(By.xpath("//h2[normalize-space(text() = 'Facebook helps you connect and share with the people in your life.')]"));
		
		

	}

}
