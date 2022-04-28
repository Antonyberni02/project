package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait - for loading entire page
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;  //narrowing
	     js.executeScript("window.scroll(0,500)", "");
	     Thread.sleep(6000);
	     
	   //  js.executeScript("window.scroll(0,-5000)", "");
	   //  Thread.sleep(6000);
	    WebElement amazon_cares = driver.findElement(By.xpath("(//a[@class='nav_a'])[4]"));
	    

	   //  js.executeScript("arguments[0].srollIntoView(true)",amazon_cares);
	     
	  //   js.executeScript("arguments[0].click",amazon_cares);
	     
	     js.executeScript("arguments[0].scrollIntoView(true)", amazon_cares);
	     
	     js.executeScript("arguments[0].click()", amazon_cares);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
