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
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Psyarxiv_TestNg {

		WebDriver driver = null;

		private ChromeOptions desireChromeOptions() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			return options;
		}

		@BeforeTest
		private void browser_launch() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(desireChromeOptions());

		}

		@BeforeClass
		private void launchURL() throws InterruptedException {
			driver.get("https://psyarxiv.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

		}

		@Test(priority = 1)
		private void Search() throws InterruptedException {
			driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("searchBox")).sendKeys("Psychology");
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("sortBy")).click();
			Thread.sleep(3000);

		}

		@Test(priority = 2)
		
		private void Select_Most_Popular() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-link listOption'])[3]")).click();
			Thread.sleep(3000);
			WebElement Most_Review = driver.findElement(By.xpath("//a[@href='https://psyarxiv.com/9frzj/']"));
			Most_Review.click();
			Thread.sleep(3000);

		}

		@Test(priority = 3)
		private void ScreenShot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(
					"C:\\Users\\JESUS\\eclipse-workspace\\Second_Section\\Most_Preferance\\Output_Shot.png");
			FileHandler.copy(source, destination);

		}
	}
