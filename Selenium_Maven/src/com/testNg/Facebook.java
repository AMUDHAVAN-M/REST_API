package com.testNg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook{
	WebDriver driver = null;

	private static ChromeOptions desiredOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		return options;

	}

	@BeforeTest
	private void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(desiredOptions());
	}

	@BeforeClass
	private void launchURL() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	private void Get_Title() throws InterruptedException {
		String title_1 = driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title_1);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String check = "Facebook";

		if (title_1.contains(check)) {
			System.out.println("Page Verified");
		} else {
			driver.quit();
		}
	}

	@Test(priority = 2)
	private void Input_Username_Pass() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("Noah");
		driver.findElement(By.id("pass")).sendKeys("NoahFBpass");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(8000);

	}

	@Test(priority = 3)
	private void Get_Snap() throws IOException, InterruptedException {
		TakesScreenshot FB = (TakesScreenshot) driver;
		File source = FB.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\JESUS\\eclipse-workspace\\Selenium_Mini_Project\\screenshot_op\\FB_Error.png");
		FileHandler.copy(source, destination);
		Thread.sleep(6000);
		driver.navigate().back();
	}

	@Test(priority = 4)
	private void Enter_User_Details() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Jhon");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Noah");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("jhonnoah@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("jhonnoah@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("jhonnoah@FB");
		WebElement Day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select S1 = new Select(Day);
		S1.selectByVisibleText("15");
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select S2 = new Select(Month);
		S2.selectByVisibleText("Jun");
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select S3 = new Select(Year);
		S3.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(10000);
	}

	@AfterClass
	private void Get_Snap2() throws IOException, InterruptedException {
		TakesScreenshot FB1 = (TakesScreenshot) driver;
		File source1 = FB1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(
				"C:\\Users\\JESUS\\eclipse-workspace\\Selenium_Mini_Project\\screenshot_op\\FB_Error1.png");
		FileHandler.copy(source1, destination1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
	}

	@AfterTest
	private void Quit_Browser() {
		driver.quit();
	}


}
