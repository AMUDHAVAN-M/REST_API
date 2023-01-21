package mobileTesting;


	import java.net.MalformedURLException;
	import java.net.URL;
	import java.time.Duration;
	import java.util.Arrays;

	import javax.sound.midi.Sequence;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.PointerInput;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

		public class Amazon {

		public static AndroidDriver driver;

		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			UiAutomator2Options options = new UiAutomator2Options()

					.setPlatformName("Android").setPlatformVersion("12").setUdid("192.168.29.119:5555")
					.setDeviceName("vivo Y21T").setAppPackage("in.amazon.mShop.android.shopping")
					.setAppActivity("com.amazon.mShop.home.HomeActivity");

			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver(url, options);

			Thread.sleep(4000);
			WebElement cont = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sso_continue"));
			cont.click();
			Thread.sleep(3000);
			WebElement Search = driver.findElement(By.xpath(
					"(//android.widget.LinearLayout[@content-desc=\"Search\"])[1]/android.widget.LinearLayout[1]/android.widget.TextView"));
			Search.click();
			WebElement Search_Pro = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
			Search_Pro.sendKeys("Boys Shirts");
			Thread.sleep(3000);
			WebElement Pro_Sel = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
			Pro_Sel.click();
			Thread.sleep(5000);
			WebElement Selected_Pro = driver.findElement(By.xpath(
					"//android.view.View[@content-desc=\"Sponsored Ad - T2F Boy's Regular Fit T-Shirt\"]/android.view.View/android.view.View/android.widget.Image"));
			Selected_Pro.click();
			Thread.sleep(5000);
			System.out.println("" + "Swipe_Start");
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			org.openqa.selenium.interactions.Sequence swipe_1 = new org.openqa.selenium.interactions.Sequence(finger, 1);

			swipe_1.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), 365, 1200));

			swipe_1.addAction(finger.createPointerDown(0));

			swipe_1.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 365, 360));

			swipe_1.addAction(finger.createPointerUp(0));
			driver.perform(Arrays.asList(swipe_1));

			org.openqa.selenium.interactions.Sequence swipe_2 = new org.openqa.selenium.interactions.Sequence(finger, 1);

			swipe_2.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), 365, 1200));

			swipe_2.addAction(finger.createPointerDown(0));

			swipe_2.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 365, 360));

			swipe_2.addAction(finger.createPointerUp(0));
			driver.perform(Arrays.asList(swipe_2));
			Thread.sleep(3000);

			WebElement Add_Cart = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Add_Cart.click();

		}
	}
	
	
	