package com.selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Window_handling {

	 public static void main(String[] args) throws AWTException {
		
	
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		  
	
		Actions abc = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[@title='MEN']"));
		abc.contextClick(men).build().perform();
		Robot re = new Robot();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
		
	WebElement women = driver.findElement(By.xpath("//a[text()='//a[text()='WOMEN']"));
	abc.contextClick(women).build().perform();
	re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
		WebElement kids = driver.findElement(By.xpath("//a[text()='//a[text()='KIDS']"));
		abc.contextClick(kids).build().perform();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
		WebElement indie = driver.findElement(By.xpath("//a[text()='//a[text() = 'INDIE']"));
		abc.contextClick(indie).build().perform();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		String ss = "online kids fashion shopping site in India - AJIO";
		 for (String ads : windowHandles) {
			 if (driver.switchTo().window(ads).getTitle().equalsIgnoreCase(ss)) {
				 break;
			 }
		 
		 System.out.println("Different Window ID's: " + ads);
		 
		 }
	 }
}
