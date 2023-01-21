//package mobileTesting;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.security.Timestamp;
//import java.time.Duration;
//import java.util.Arrays;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.builder.ToStringBuilder;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.PointerInput;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.screenrecording.CanRecordScreen;
//
//public class SampleScreen {
//	public static AndroidDriver driver;
//	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//		
//	
//	UiAutomator2Options options = new UiAutomator2Options()
//
//			.setPlatformName("Android")
//			.setPlatformVersion("12")
//			.setUdid("192.168.29.66:5555")
//			.setDeviceName("vivo Y21T")
//			.setAppPackage("com.google.android.calculator")
//			.setAppActivity("com.android.calculator2.Calculator");
//
//	 URL url = new URL ("http://0.0.0.0:4723/wd/hub");
//	  Capabilities capabilities;
//	
//	  driver = new AndroidDriver(url, capabilities);
//	  
////	 ((CanRecordScreen) driver).startrecordingScreen();
//	  
//	// Timestamp timestamp = new Timestamp(System.currentTimeMillis());
////	 String string time0stamp.toString();
//	 String replaceall = string.replaceAll("[^0-9]","_");
//	 System.out.println(replaceall);
//	System.out.println(timestamp);
//	 
//	  
//	  
//	 WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
//	  
//	 WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//	  
//	 WebElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
//	  
//	 WebElement value = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"));
//	  
//	  seven.click();
//	  plus.click();
//	  three.click();
//	  value.click();
//	  
//
//	  string 
//	  
//	  Timestamp timeStamp = new Timestamp((System.currentTimeMillis());
//	  .toString().replaceAll("[^0-9]","_");
//	  
//	  TakesScreenshot screenshot = (TakesScreenshot) driver;
//	  
//	  File source = screenshot.getScreenshotAs(OutputType.FILE);
//	  File destination = new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Appium_Maven\\target\\Screenshot\\"+timeStamp+".png");
//	  
//	  FileUtils.copyFile(source, destination);
//	  
//	}
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//} 
//
//
//}