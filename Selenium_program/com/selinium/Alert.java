package com.selinium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://demoqa.com/alerts");
	
	WebElement simple = driver.findElement(By.id("alertButton"));
	
	simple.click();
	
	driver.switchTo().alert().accept();
	
	WebElement confirm = driver.findElement(By.id("confirmButton"));
	
	confirm.click();
	
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
