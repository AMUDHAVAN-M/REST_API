package com.Reena;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {
  public static WebDriver driver;
  
  public static void main(String[] args) throws InterruptedException, IOException {
  
  System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Selenium_program\\Driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://blazedemo.com/");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  WebElement dw1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
  Select sc = new Select(dw1);
  sc.selectByVisibleText("Boston");
  
  Thread.sleep(2000);
  
  WebElement dw2 = driver.findElement(By.xpath("//select[@name='toPort']"));
  Select sc1 = new Select(dw2);
  sc1.selectByVisibleText("New York");
  
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  
  
  WebElement price = driver.findElement(By.xpath("//table/tbody/tr[3]"));
  System.out.println(price.getText());
  driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
  
  Thread.sleep(1000);
  
  WebElement name = driver.findElement(By.id("inputName"));
  name.sendKeys("Leonardo Dicaprio");
  
  
  WebElement address = driver.findElement(By.id("address"));
  address.sendKeys("hollywood ave ");
  
  WebElement city = driver.findElement(By.id("city"));
  city.sendKeys(" san fransico ");
  
  WebElement state = driver.findElement(By.id("state"));
  state.sendKeys(" California ");
  
  WebElement zip = driver.findElement(By.id("zipCode"));
  zip.sendKeys(" 94016 ");
  
  
  
  WebElement card = driver.findElement(By.id("cardType"));
  Select xx = new Select(card);
  xx.selectByVisibleText("American Express");
  
  WebElement cardno = driver.findElement(By.id("creditCardNumber"));
  cardno.sendKeys(" 123456 123456 1234 ");
  
  
  WebElement month = driver.findElement(By.id("creditCardMonth"));
  month.sendKeys(" 12 ");
  
  WebElement year = driver.findElement(By.id("creditCardYear"));
  year.sendKeys(" 2030 ");
  
  WebElement name1 = driver.findElement(By.id("nameOnCard"));
  name1.sendKeys(" 2030 ");
  
  driver.findElement(By.id("rememberMe")).click();
  
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  System.out.println("Flight booked");
  
  Thread.sleep(1000);
  
  

 
  
  
  
}
  
}

