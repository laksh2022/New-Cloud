package sampleMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import groovyjarjarantlr.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPractice {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		TakeScreenShot("Flipkart_HomePage");
		Thread.sleep(3000);
		driver.close();

	}

	private static void TakeScreenShot(String filename) throws IOException {
		
		File f =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\CANDIDPIC\\eclipse-workspace\\"
				+ "DemoSlenium\\ScreenShots\\"+ filename+".jpg"));
	}

}
