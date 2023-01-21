package com.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
	
		
	
	private static void first() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		WebElement tec = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1\r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "	"));
		System.out.println(tec.getText());
	}
	private static void second() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	List<WebElement> simple = driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
	for (WebElement web: simple) {
		System.out.println(web.getText());	
	}	
	}
	public static void main(String[] args) {
		first();
		second();
		
	}
}
