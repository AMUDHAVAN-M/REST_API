package mobileTesting;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Longpress {
	public static AndroidDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		UiAutomator2Options options = new UiAutomator2Options()

				.setPlatformName("Android").setPlatformVersion("12").setUdid("192.168.29.66:5555")
				.setDeviceName("vivo Y21T").setAppPackage("io.appium.android.apis")
				.setAppActivity("io.appium.android.apis.ApiDemos");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, options);// from this process app launch

		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]"))
				.click();
		WebElement longpress = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[8]"));

		// driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		Actions a = new Actions(driver); // long press //action object create for process & used for mouse actions
		a.clickAndHold(longpress).build().perform();

	}
}
