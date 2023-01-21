package com.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");
	
	
	  WebElement coffee = driver.findElement(By.name("coffee2"));
	//navigate
	
	Select s = new Select(coffee);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	
	s.selectByValue("skim");
	s.selectByValue("cream");
	s.selectByValue("whipped");
	
	List<WebElement> list = s.getAllSelectedOptions();
	for (WebElement web: list) {
		System.out.println(web.getText());
	}
	
	
	
	
	
	
	
	
	}
	}
