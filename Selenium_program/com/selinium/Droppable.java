package com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://demoqa.com/buttons");
		
	Actions act =  new Actions(driver);
	driver.switchTo().frame(0);
	WebElement src = driver.findElement(By.id("draggable"));
	
	WebElement target = driver.findElement(By.id("droppable"));
    
	act.dragAndDrop(src,target).build().perform();


}
}
 