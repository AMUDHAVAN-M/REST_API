package com.maven.Project_2_Cowin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	public static void User_Input(WebElement element, String value) {

		try {
			if (isDisplayed(element) && isEnabled(element)) {

				element.sendKeys(value);

			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) throws Exception {

		boolean displayed = element.isDisplayed();
		try {
			if (displayed == true) {
				element.click();
			} else {
				throw new Exception("Element Not Displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clearText(WebElement element) {
		element.clear();
	}

	public static void isSelected(WebElement element) throws Exception {
		boolean check = element.isSelected();
		try {
			if (check == true) {
				System.out.println("Check the Element is Selected or Not" + check);
			} else {
				throw new Exception("Element Not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isDisplayed(WebElement element) throws Exception {
		boolean check = element.isDisplayed();
		try {
			if (check == true) {
				System.out.println("Check the Element is Displayed or Not" + check);
			} else {
				throw new Exception("Element Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;

	}

	public static boolean isEnabled(WebElement element) throws Exception {
		boolean Check = element.isEnabled();
		try {
			if (Check == true) {
				System.out.println("Check the Element is Enabled" + Check);
			} else {
				throw new Exception("Element not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Check;

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void getting_Text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void get_Attribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}

	public static WebDriver browser_Launch(String browser) throws Exception {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("Start_maximized");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);

			} else if (browser.equalsIgnoreCase("edge")) {

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			} else {

				throw new Exception("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void fullscreen() {
		driver.manage().window().fullscreen();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static String getTitle() {

		String title = driver.getTitle();
		return title;

	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void launch_Url(String url) {

		driver.get(url);

	}

	public static String getWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public static Set<String> getMultiWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public static void keyDown() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void acceptSendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void alert(String option) throws Exception {

		Alert alert = driver.switchTo().alert();
		try {
			if (option.equalsIgnoreCase("ok")) {
				alert.accept();
			} else if (option.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			} else {
				throw new Exception("No Alert Present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void frameSwitch(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static int totalFrame(List<WebElement> element) {
		int size = element.size();
		return size;

	}

	public static void mouseBasedActions(String option, WebDriver driver, WebElement element) throws Exception {
		Actions a = new Actions(driver);
		try {
			if (option.equalsIgnoreCase("move")) {
				a.moveToElement(element).build().perform();
			} else if (option.equalsIgnoreCase("click")) {
				a.click(element).perform();
			} else {
				throw new Exception("No element presend");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void drpDownSelect(WebElement element, String option, String value) throws Exception {

		Select s = new Select(element);

		try {
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				int p = Integer.parseInt(value);
				s.selectByIndex(p);

			} else {
				throw new Exception("Invalid such element");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void snap(WebDriver driver) throws IOException {

		Date date = new Date(0);
		SimpleDateFormat d = new SimpleDateFormat("mm/dd/yyyy");
		d = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String format = d.format(date);
		String r = format.replaceAll("/", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Distination = new File("C:\\Users\\JESUS\\eclipse-workspace\\Project_1_Amazon\\Snap_OP" + r + ".png");
		FileUtils.copyFile(Source, Distination);
	}

}
	

