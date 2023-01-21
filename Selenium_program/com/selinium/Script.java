package com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

private static Object d;

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\selinium_concept\\src\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor s = (JavascriptExecutor) driver;

    s.executeScript("window.scrollBy(0,9000);");
	
	
    s.executeScript("window.scrollBy(0,-4500);");
	
	
	driver.findElement(By.xpath("//h2[text()=Revamp your home in style']"));
	
	s.executeScript("argumemts[0].scrollIntoView();",d);
	
}}

