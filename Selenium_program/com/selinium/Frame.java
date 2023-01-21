package com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://demo.automationtesting.in/Frames.html");
	
     int size = driver.findElements(By.tagName("iframe")).size();
	
	 System.out.println(size);
	
	WebElement s1 = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(s1);
	
	 WebElement s = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	 s.sendKeys("success");
	
	}
	
	
	
	

}
