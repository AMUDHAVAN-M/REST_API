package mobileTesting;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {
	
	
	
	private static AndroidDriver driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		

	DesiredCapabilities capabilities =new DesiredCapabilities();
	
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "12"); 
   	    capabilities.setCapability("udid", "192.168.29.21:5555");
	    capabilities.setCapability("deviceName", "vivo Y21T");
	    capabilities.setCapability("appPackage","com.myntra.android");
		capabilities.setCapability("appActivity",".SplashActivity");
		capabilities.setCapability("noReset","true");
		capabilities.setCapability("fullReset","false"); 
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,capabilities);
		
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height is:"+height);
		System.out.println("Width is : "+width);
		Thread.sleep(5000);
	
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		System.out.println("Swipe Started");
		org.openqa.selenium.interactions.Sequence s = new  org.openqa.selenium.interactions.Sequence(finger, 1);
		s.addAction(finger.createPointerMove
		(Duration.ofSeconds(0),PointerInput.Origin.viewport(),720,1475));    // slelect starting point
		s.addAction(finger.createPointerDown(0));   // touch and drag
		s.addAction(finger.createPointerMove
				(Duration.ofMillis(500),PointerInput.Origin.viewport(),540,340));   // releasing point
		s.addAction(finger.createPointerUp(0));  // release finger
		driver.perform(Arrays.asList(s));
		System.out.println("ended");
	}
					
}