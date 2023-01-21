package com.maven.Maven;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_TestNG_Script {
  WebDriver driver = null; //null 
  String searchProduct = "Soft Toys";
  private static ChromeOptions desiredOptions() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    return options;

  }
  @BeforeTest
  private void browserLaunch() {
    WebDriverManager.chromedriver().setup(); //chrome
     driver = new ChromeDriver(desiredOptions()); //local - null - chrome 
  }
  @SuppressWarnings("deprecation")
@BeforeClass
  private void launchURL() {
    driver.get("https://www.amazon.in/"); //chrome - amazon  - chrome driver
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }
  
  @Test(enabled = false)
  private void dropDown() {
    String SelectValue = "babY";

    WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

    Select s = new Select(dropDown);

    List<WebElement> dropdownOptions = s.getOptions();

    for (int i = 0; i < dropdownOptions.size(); i++) {

      WebElement eachoption = dropdownOptions.get(i); // index- webelement

      String eachText = eachoption.getText();

      if (eachText.equalsIgnoreCase(SelectValue)) {
        s.selectByVisibleText(eachText);
      }
    }
  }
  
  @Test(priority = 0)
  private void UserInput() throws InterruptedException {

    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys(searchProduct);

    Thread.sleep(2000);
  }
  
  @Test(dependsOnMethods = "UserInput")
  private void UserClickProduct() throws InterruptedException {
    List<WebElement> relevant = driver
        .findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
    

    for (int i = 1; i <= relevant.size(); i++) {

      WebElement eachProduct = driver.findElement(By.xpath(
          "//div[@class='autocomplete-results-container']/child::div[" + i + "]/div/div[@role='button']"));

      String eachProductText = eachProduct.getText();

      if (eachProductText.equalsIgnoreCase(searchProduct)) {
        eachProduct.click();
        break;
      }

    }
    Thread.sleep(3000);
  }
  
  
  
  @AfterTest
  private void BrowserClose() {
    driver.close();
  }
  
  
}
//
//	import java.util.List;
//	import java.util.concurrent.TimeUnit;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.chrome.ChromeOptions;
//	import org.openqa.selenium.support.ui.Select;
//	import org.testng.annotations.AfterTest;
//	import org.testng.annotations.BeforeClass;
//	import org.testng.annotations.BeforeTest;
//	import org.testng.annotations.Ignore;
//	import org.testng.annotations.Test;
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class Amazon_TestNG_Script extends Base_Class1  {
//	  WebDriver driver = null; //null 																																																																																															
//	  String searchProduct = "Soft Toys";
//	  private static ChromeOptions desiredOptions() {
//	    ChromeOptions options = new ChromeOptions();
//	    options.addArguments("start-maximized");
//	    return options;
//
//	  }
//	  @BeforeTest
//	  private void browserLaunch() {
//	    WebDriverManager.chromedriver().setup(); //chrome
//	     driver = new ChromeDriver(desiredOptions()); //local - null - chrome 
//	  }
//	  @BeforeClass
//	  private void launchURL() {
//	    driver.get("https://www.amazon.in/"); //chrome - amazon  - chrome driver
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	  }
//	  
//	  @Test(enabled = false)
//	  private void dropDown() {
//	    String SelectValue = "babY";
//
//	    WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
//
//	    Select s = new Select(dropDown);
//
//	    List<WebElement> dropdownOptions = s.getOptions();
//
//	    for (int i = 0; i < dropdownOptions.size(); i++) {
//
//	      WebElement eachoption = dropdownOptions.get(i); // index- webelement
//
//	      String eachText = eachoption.getText();
//
//	      if (eachText.equalsIgnoreCase(SelectValue)) {
//	        s.selectByVisibleText(eachText);
//	      }
//	    }
//	  }
//	  
//	  @Test(priority = 0)
//	  private void UserInput() throws InterruptedException {
//
//	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//	    search.sendKeys(searchProduct);
//
//	    Thread.sleep(2000);
//	  }
//	  
//	  @Test(dependsOnMethods = "UserInput")
//	  private void UserClickProduct() throws InterruptedException {
//	    List<WebElement> relevant = driver
//	        .findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
//
//	    for (int i = 1; i <= relevant.size(); i++) {
//	      WebElement eachProduct = driver.findElement(By.xpath(
//	          "//div[@class='autocomplete-results-container']/child::div[" + i + "]/div/div[@role='button']"));
//	      String eachProductText = eachProduct.getText();
//
//	      if (eachProductText.equalsIgnoreCase(searchProduct)) {
//	        eachProduct.click();
//	        break;
//	      }
//
//	    }
//	    Thread.sleep(3000);
//	  }
//	  
//	  @AfterTest
//	  private void BrowserClose() {
//	    driver.close();
//	  }
//	  
//	  
//	}
//	
//
//
