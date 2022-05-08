package frameworkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	String [][] data={
		{"Admin1","admin"},
		{"Admin1","dummy"},
		{"Admin","admin"},
		{"Admin","admin1"}	
		
	};

	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
		
	}
	
	@Test(dataProvider="loginData")
	public void loginwithBothCorrect(String uName, String pword)
	{
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  WebElement username = driver.findElement(By.id("txtUsername"));
	  username.sendKeys(uName);
	  WebElement password = driver.findElement(By.id("txtPassword"));
	  password.sendKeys(pword);
	  WebElement logInButton = driver.findElement(By.id("btnLogin"));
	  logInButton.click();
	  driver.quit();
	  
	}
}
