package com.selinium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.util.Set;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcepts {


public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.amazon.in/");
		
	Actions act =  new Actions(driver);
	

	WebElement s = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	act.contextClick(s).build().perform();
	
 
	Robot rob = new Robot();

	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	    
	rob.keyPress(KeyEvent.VK_ENTER);
    rob.keyRelease(KeyEvent.VK_ENTER);
	
	
	 WebElement ec = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	act.contextClick(ec).build().perform();
	

	rob.keyPress(KeyEvent.VK_DOWN);
    rob.keyRelease(KeyEvent.VK_DOWN);
	 
	 
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement hk = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
	  
	act.contextClick(hk).build().perform();
	
	rob.keyPress(KeyEvent.VK_DOWN);
    rob.keyRelease(KeyEvent.VK_DOWN);
	 
	 
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
		
	
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
   
    Set<String> win = driver.getWindowHandles();
	for (String string : win) {   //multiple windows we use foreach
    String title = driver.switchTo().window(string).getTitle();
	System.out.println(title);
	}
	String s1= ("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in");
	for (String string : win) {
	if (driver.switchTo().window(string).getTitle().equals(s1)) {
    System.out.println("Done");
    break;
	
	
}
	}}}



//ROBOT 
		//	Robot rob = new Robot();

		//	rob.keyPress(KeyEvent.VK_DOWN);
		   // rob.keyRelease(KeyEvent.VK_DOWN);
		    
		    //rob.keyPress(KeyEvent.VK_ENTER);
			//rob.keyRelease(KeyEvent.VK_ENTER);
		//WebElement ps = driver.findElement(By.xpath("//a[text()='Pet Supplies']"));
//		act.contextClick(ps).build().perform();
		
		//rob.keyPress(KeyEvent.VK_DOWN);
	 //   rob.keyRelease(KeyEvent.VK_DOWN);
		 
		 
		//rob.keyPress(KeyEvent.VK_ENTER);
		//rob.keyRelease(KeyEvent.VK_ENTER);
		



	
