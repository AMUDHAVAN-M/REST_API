package com.selinium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys ("AmudhavanVra");
		
		
		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("55555");
		
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		 

			
		// TakesScreenshot ts = (TakesScreenshot) driver;

		//	File src = ts.getScreenshotAs(OutputType.FILE);
			
			//File dest = new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selinium\\Pic\\snap.png");
			
			//FileUtils.copyFile(src, dest);

				
	}

}

	
			
		