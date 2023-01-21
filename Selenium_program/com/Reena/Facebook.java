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


   public class Facebook {

	
			
		public static void main(String[] args) throws Throwable {
		

			
				String url = "https://www.facebook.com/";
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				String title = driver.getTitle();
				String check="Facebook";
				if(title.contains(check)) {
					System.out.println("user launched in correct application");
					
				}else {
					driver.quit();
				}
				
				WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
				user.sendKeys("9966443322");
				WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("12345");
				WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
				login.click();
				Thread.sleep(3000);
				TakesScreenshot ss = (TakesScreenshot)driver;
				File f1= ss.getScreenshotAs(OutputType.FILE);
				File f=new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Screenshot\\facebookss.png");
				FileHandler.copy(f1, f);
				System.out.println("error page captured");
				driver.navigate().back();
				
				WebElement newacct = driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
				newacct.click();
				Thread.sleep(3000);
				WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
				fname.sendKeys("greens");
				WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
				lname.sendKeys("technology");
				WebElement ph = driver.findElement(By.xpath("//input[@name='reg_email__']"));
				ph.sendKeys("9988776655");
				WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
				pass.sendKeys("qwerty");
				WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
				Select s1=new Select(date);
				s1.selectByVisibleText("10");
				
				WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
				Select s2=new Select(month);
				s2.selectByVisibleText("Mar");
				Thread.sleep(3000);
				
				WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
				Select s3=new Select(year);
				s3.selectByVisibleText("2015");
				
				WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
				gender.click();
				
				Thread.sleep(3000);
				
				WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
				signup.click();
				
				Thread.sleep(3000);
				TakesScreenshot sss = (TakesScreenshot)driver;
				File f2= sss.getScreenshotAs(OutputType.FILE);
				File f3=new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Screenshot\\facebooksss.png");
				FileHandler.copy(f2, f3);
				System.out.println("sign in page captured");
				
				WebElement exit = driver.findElement(By.xpath("//img[@height='24']"));
				exit.click();
				Thread.sleep(3000);
				String title2 = driver.getTitle();
				if(title2.contains(check)) {
					System.out.println("user  in correct application");
					
				}
				
				Thread.sleep(3000);
		driver.quit();
				
		}}				
				
				
				
				
				
				
				
				
				
			


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

