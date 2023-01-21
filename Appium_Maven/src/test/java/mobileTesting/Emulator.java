package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;

public class Emulator {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		 
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("udid", "emulator-5554");//udid=unique device id
		 capabilities.setCapability("app", "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Appium_Maven\\src\\test\\resources\\apk\\calcularor.apk.apk");
		 
		 
		 URL url = new URL ("http://0.0.0.0:4723/wd/hub");
		  driver = new AndroidDriver(url, capabilities);
		 
		  driver.makeGsmCall("7708649203", GsmCallActions.CALL);
		  System.out.println("*******done********");
		  driver.sendSMS("8778551346", "Hi Aero");
		  driver.openNotifications();
		  
		 
		  
		  
		  
		  
		  
		  
//		  WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
//		  
//		  WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//		  
//		 WebElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
//		  
//		  WebElement value = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"));
//		  
//		  seven.click();
//		  plus.click();
//		  three.click();
//		  value.click();
//		  
		  
	}	  
	}
	

