package com.maven.Project_2_Cowin;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Cowin_Selenium_Script {
		
		public static void main(String[] args) throws Throwable {
			String url = "https://www.cowin.gov.in/";
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement todistrict = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[1]"));
			js.executeScript("arguments[0].scrollIntoView()", todistrict);
		    Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-400)");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//mat-select[@formcontrolname='state_id']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-option[@role='option'])[32]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//mat-select[@formcontrolname='district_id']")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("(//mat-option[@role='option'])[5]")).click();
			
			driver.findElement(By.xpath("//button[@tabindex='0']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//label[@tabindex='0'])[3]")).click();
			
			driver.findElement(By.xpath("(//label[@tabindex='0'])[5]")).click();
			
			driver.findElement(By.xpath("(//label[@tabindex='0'])[8]")).click();
			
			driver.findElement(By.xpath("(//label[@tabindex='0'])[10]")).click();
			Thread.sleep(2000);
			
			
			WebElement searchresults = driver.findElement(By.xpath(
					"//div[@class='search-with-walkin']//descendant::span[@class='center-count accessibility-plugin-ac']"));
			System.out.println(searchresults.getText());

			List<WebElement> showingresult = driver
					.findElements(By.xpath("//div[@class='show-result']//descendant::li[@class='ng-star-inserted']"));
			for (WebElement s : showingresult) {
				String showingresults = s.getText();
				System.out.println(showingresults);
			}
		}

	}
	
	

