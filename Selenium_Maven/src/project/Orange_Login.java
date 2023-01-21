package project;



	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Orange_Login {
		WebDriver driver = null;
		public static String finalUserId = "";
		public static String finalPassword = "";
		private static ChromeOptions desiredOptions() {

			List<String> listOfOptions = new ArrayList<String>();
			listOfOptions.add("start-maximized");
			ChromeOptions options = new ChromeOptions();
			options.addArguments(listOfOptions);
			return options;
		}

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(desiredOptions()); // Parameter pass
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			WebElement userId = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
			String userName = userId.getText();
			System.out.println(userName);
			
			WebElement pass = driver.findElement(By.xpath("//p[text()='Password : admin123']"));
			String password = pass.getText();
			System.out.println(password);
			
			String[] id = userName.split(" ");
			for (int i = 2; i < id.length; i++) {
			System.out.println(id[i]);
			
			finalUserId  = finalUserId +id[i];
			}
			System.out.println("Final UserName="+finalUserId);
			
			
			
			String[] pas = password.split(" ");
			for (int i = 2; i < pas.length; i++) {
			System.out.println(pas[i]);
			
			finalPassword = finalPassword + pas[i];
			
			}
			
			System.out.println("Final Password="+finalPassword);
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}
