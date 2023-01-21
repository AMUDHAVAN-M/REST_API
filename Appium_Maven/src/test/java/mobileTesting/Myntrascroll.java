package mobileTesting;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import javax.sound.midi.Sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Myntrascroll {
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	public static String Appiumlocation = "C:\\Users\\AMUDHAVAN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	public static String IPAddress = "0.0.0.0"; // (or) "127.0.0.1"
	public static String Basepath = "/wd/hub/";
	public static int port = 4723;
	public static String LogfileLocation = "C:\\Users\\AMUDHAVAN\\OneDrive\\Desktop\\Appium.txt";

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

//		 DesiredCapabilities capabilities = new DesiredCapabilities();
//		 capabilities.setCapability("platformName", "Android");
//		    capabilities.setCapability("platformVersion", "12"); 
//	   	    capabilities.setCapability("udid", "342725440200137");
//		    capabilities.setCapability("deviceName", "vivo Y21T");
//		    capabilities.setCapability("appPackage", "com.myntra.android");
//			capabilities.setCapability("appActivity",".SplashActivity");
		

		service = new AppiumServiceBuilder().withAppiumJS(new File(Appiumlocation)).withIPAddress(IPAddress)
				.withArgument(GeneralServerFlag.BASEPATH, Basepath).usingPort(port)
				.withLogFile(new File(LogfileLocation)).build();
		service.start();
		System.out.println("Appium Started");
		

		UiAutomator2Options options = new UiAutomator2Options()

				.setPlatformName("Android")
				.setPlatformVersion("12")
				.setUdid("192.168.29.66:5555")
				.setDeviceName("vivo Y21T")
				.setAppPackage("com.myntra.android")
				.setAppActivity(".SplashActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, options);

		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height is " + height);
		System.out.println("Width is " + width);

		Thread.sleep(5000);
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		System.out.println("swipe started");
		org.openqa.selenium.interactions.Sequence swipel = new org.openqa.selenium.interactions.Sequence(finger, 1);

		swipel.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), 365, 1200));

		swipel.addAction(finger.createPointerDown(0));
		swipel.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 365, 360));

		swipel.addAction(finger.createPointerUp(0));

		driver.perform(Arrays.asList(swipel));
		
		WebElement Search = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"search\"]"));
		Search.click();

		Actions action = new Actions(driver);
		action.sendKeys("Mens Shirt").sendKeys(Keys.ENTER).build().perform();
	}

}