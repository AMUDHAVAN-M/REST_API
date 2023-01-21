package com.Reena;
import java.io.File;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;


public class Psyc {
	
		public static void main(String[] args) throws Throwable {
			
			
			String url = "https://psyarxiv.com/";
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
		Thread.sleep(2000);	
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search input box']"));
		search.sendKeys("psychology");
		
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
			click.click();
			
			Thread.sleep(2000);
			
			WebElement sort= driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	                sort.click();
			Thread.sleep(2000);
			WebElement newest_to_oldests = driver.findElement(By.xpath("//button[text()='Modified Date (newest to oldest)']"));
			newest_to_oldests.click();
			
			WebElement ca = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]"));
			ca.click();
		
			Thread.sleep(3000);
			
			WebElement product = driver.findElement(By.xpath("//a[text()='Affordances From Outer Space: Forms of Life, Material Engagement, and Meaning within Space Exploration and SETI']"));
			String title = product.getText();
			System.out.println(title);
			product.click();
			
			Thread.sleep(3000);
			WebElement product1 = driver.findElement(By.id("preprintTitle"));
			String title1 = product1.getText();
			System.out.println(title1);
		
			TakesScreenshot ss = (TakesScreenshot)driver;
			File f= ss.getScreenshotAs(OutputType.FILE);
			File f2=new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Screenshot\\psychologyss.png");
			FileHandler.copy(f, f2);
			
			
		    if(title.equals(title1))
		    {
		     System.out.println("Title is equal");
		     driver.quit();
		    }
		    
		}
			
					
	}


