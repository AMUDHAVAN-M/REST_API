package Guru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr[15]/td"));
		
		for (int i=0; i < table.size();i++) {
			System.out.println(table.get(i).getText());
	}
	
	
}}