//package com.Reena;
//
//import java.util.ArrayList;
//	import java.util.Collections;
//	import java.util.List;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.testng.annotations.Test;
//
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class Practice {
//
//		public WebDriver driver;
//		public int minPrice;
//
//		@Test(priority = 0)
//		public void browserLaunch() {
//
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get(
//					"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
//			driver.manage().window().maximize();
//		}
//
//		@Test(priority = 1)
//		public void minimumPriceOfProduct() {
//
//			List<WebElement> allPrices = driver.findElements(By.xpath("\r\n"
//					+ "//li[@class=\"product-base\"]//descendant::div[@class=\"product-price\"]//descendant::span[(@class=\"product-discountedPrice\") or (text() and not(@class))]"));
//
//			// "//li[@class='product-base']//descendant::div[@class='product-price']
//			// //descendant::span[@class='product-discountedPrice']"
//			ArrayList<Integer> allPricesList = new ArrayList<Integer>();
//
//			for (int i = 0; i < allPrices.size(); i++) {
//				String priceText = allPrices.get(i).getText().replaceAll("Rs. ", "");
//				int price = Integer.parseInt(priceText);
//				allPricesList.add(price);
//			}
//
//			System.out.println("Total Number Of Prices/Products: " + allPricesList.size());
//			minPrice = Collections.min(allPricesList);
//			System.out.println("Minimum Price is: " + minPrice);
//		}
//
//		@Test(priority =2)
//		public void minimumPriceProductName() {
//			int count=0;
//			try {
//				List<WebElement> minimumPriceAllProductsNames = driver.findElements(By.xpath(
//				"//li[@class='product-base']//descendant::div[@class=\"product-price\"]//descendant::span[(@class=\"product-discountedPrice\" and text()='"+minPrice+"') or (text()='"+minPrice+"' and not(@class))]//ancestor::div[@class='product-productMetaInfo']/h3[@class='product-brand']"));
//
//				for (WebElement minimumPriceProductName : minimumPriceAllProductsNames) {
//					String productName = minimumPriceProductName.getText();
//					System.out.println("Product Name of Minimum Price: "+productName);
//					count++;
//				}
//				System.out.println("Totally "+count+" Products are in minimum price: "+minPrice);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}}
//		@Test(priority =3)
//		public void minimumsubProductName()
//		{
//			
//			  String subBrandName="Boys Graphic";
//
//			  try {
//			   WebElement brandName = driver.findElement(By.xpath(
//			     "//li[@class='product-base']//div[@class='product-productMetaInfo']/h4[contains(text(),'"+subBrandName+"')]//preceding-sibling::h3"));  
//
//			    String broductNameText = brandName.getText();
//			    System.out.println("Minium price subproduct Name  : " + broductNameText);
//
//			//   System.out.println("Totally"+" " + count + ""+"SubProducts are in minium Price: " + minPrice);
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
//			
//			
//			
//			}
//				
//				
//			
//			
//			
//		}
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
