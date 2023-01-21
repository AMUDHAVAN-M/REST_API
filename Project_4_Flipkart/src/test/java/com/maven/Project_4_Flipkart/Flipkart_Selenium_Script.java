package com.maven.Project_4_Flipkart;

	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Flipkart_Selenium_Script {

		private static List<String> listOfChromeOptions() {

			List<String> listOfOptions = new ArrayList<String>();
			listOfOptions.add("start-maximized");

			return listOfOptions;
		}

		// Task 1
		public static void main(String[] args) throws Throwable {

			ChromeOptions options = new ChromeOptions();
			options.addArguments(listOfChromeOptions());
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver(options);

			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);

			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(3000);

			// Task2

			WebElement iphone1_Price = driver.findElement(By.xpath(
					"//div[@class='_1AtVbE col-12-12']//child::a[@class='_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class=\"col col-7-12\"]//div[text()='APPLE iPhone 12 mini (Black, 64 GB)']//ancestor::div[@class='_3pLy-c row']//descendant::div[@class='col col-5-12 nlI3QM']//descendant::div[@class='_3I9_wc _27UcVY']"));
			System.out.println("Product1 price****:" + iphone1_Price.getText());
			String replace = iphone1_Price.getText();
			String substring = replace.substring(1);
			String replaceAll = substring.replaceAll(",", "");
			System.out.println("*************" + replaceAll);
			int iphone12mini_Price = Integer.parseInt(replaceAll);
			System.out.println("Iphone 12 mini price:  " + iphone12mini_Price);
			// Task3

			WebElement iphone2_Price = driver.findElement(By.xpath(
					"//div[@class='_1AtVbE col-12-12']//child::a[@class='_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class=\"col col-7-12\"]//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']//ancestor::div[@class='_3pLy-c row']//descendant::div[@class='col col-5-12 nlI3QM']//descendant::div[@class='_3I9_wc _27UcVY']"));
//					System.out.println("APPLE iPhone 13 (Midnight, 128 GB) price: "+iphone2_Price.getText());
			String replace2 = iphone2_Price.getText();
			String substring2 = replace2.substring(1);
			String replaceAll2 = substring2.replaceAll(",", "");
			int iphone13_Price = Integer.parseInt(replaceAll2);
			System.out.println("Iphone 13 price: " + iphone13_Price);

			WebElement iphone1 = driver.findElement(By.xpath(
					"//div[@class='_1AtVbE col-12-12']//child::a[@class='_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class='col col-7-12']//div[text()=\"APPLE iPhone 12 mini (Black, 64 GB)\"]"));
			iphone1.click();

			List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
			for (String string2 : windowHandles) {

			}
			driver.switchTo().window(windowHandles.get(1));

			WebElement addtocart1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));

			addtocart1.click();

			Thread.sleep(5000);

			driver.switchTo().window(windowHandles.get(0));

			WebElement iphone2 = driver.findElement(By.xpath(
					"//div[@class='_1AtVbE col-12-12']//child::a[@class='_1fQZEK']//descendant::div[@class='_3pLy-c row']//descendant::div[@class=\"col col-7-12\"]//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
			iphone2.click();

			List<String> windowHandles1 = new ArrayList<>(driver.getWindowHandles());
			for (String string : windowHandles1) {

			}

			Thread.sleep(5000);
			driver.switchTo().window(windowHandles1.get(2));
			WebElement addtocart2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			addtocart2.click();

			driver.switchTo().window(windowHandles1.get(0));
			WebElement cart = driver.findElement(By.xpath("//a[@href='/viewcart?exploreMode=true&preference=FLIPKART']"));
			cart.click();

			Thread.sleep(5000);
			WebElement total_Price = driver.findElement(By.xpath(
					"//div[@class='_1YokD2 _3Mn1Gg col-4-12 _78xt5Y']//descendant::div[@class='_I_XQO']//descendant::div[@class='Ob17DV']//descendant::div[@class='_24KATy']//div[text()='Price (2 items)']//ancestor::div[@class='Ob17DV']//span"));

			String totalprice = total_Price.getText();
			String substring3 = totalprice.substring(1);
			String replaceAll3 = substring3.replaceAll(",", "");
			int total_price_of_two_items = Integer.parseInt(replaceAll3);
			System.out.println("Total price of two items Iphone 12 and 13: " + total_price_of_two_items);

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(
					"C:\\Users\\shara\\eclipse-workspace\\Selenium_Concepts\\driver\\screenshot\\flipkartproject.png");
			FileUtils.copyFile(source, des);

			if (total_price_of_two_items == iphone12mini_Price + iphone13_Price) {
				System.out.println("The price is equal:::::Project Success");
				driver.quit();
			}

		}

	}