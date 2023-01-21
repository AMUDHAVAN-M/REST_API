package com.selinium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic { //MYNTRA PRODUCT
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium3\\driver\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.myntra.com/men-casual-shirts");
		
    List<WebElement> product = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	List<Integer> sub = new ArrayList<>();
	for (WebElement web : product) {
		String replace = web.getText().replace("Rs. ", "");
		int parseInt = Integer.parseInt(replace);
		sub.add(parseInt);
	}
	//Collections.sort(sub); //asendin order
//	Collections.sort(sub,Collections.reverseOrder());//reverse order
	System.out.println(sub);
	System.out.println("Maximum Amount :"+Collections.max(sub));
	System.out.println("Minimum Amount :"+Collections.min(sub));
	System.out.println("Product Count :"+sub.size());
		// web.getText().repeat("Rs. ","")
		
		//System.out.println(web.getText());

}
}
