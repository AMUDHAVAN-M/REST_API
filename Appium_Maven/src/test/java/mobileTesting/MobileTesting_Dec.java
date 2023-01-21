package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MobileTesting_Dec {
     
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		 
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("platformVersion", "12"); 
		 capabilities.setCapability("udid", "192.168.29.21:5555");
		 capabilities.setCapability("deviceName", "vivo Y21T");
		 
		  capabilities.setCapability("appPackage", "com.google.android.calculator");
		 capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		 
		 URL url = new URL ("http://0.0.0.0:4723/wd/hub");
		  driver = new AndroidDriver(url, capabilities);
		  WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		  
		  WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		  
		 WebElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		  
		  WebElement value = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"));
		  
		  seven.click();
		  plus.click();
		  three.click();
		  value.click();
		  
		  
	}	  
	}
	


		  //		   
//		   String currentPackage = driver.getCurrentPackage();
//            System.out.println(currentPackage);
//            
//           System.out.println(driver.currentActivity());	  
