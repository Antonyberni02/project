package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_dragdrop {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			//implicit wait - for loading entire page
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://www.dhtmlgoodies.com/scripts/arrange-nodes-2/arrange-nodes-2-demo2.html");
			
			Actions a=new Actions(driver);
			
			WebElement drag = driver.findElement(By.id("article1"));
			WebDriverWait w =new WebDriverWait(driver, 50);
			w.until(ExpectedConditions.visibilityOf(drag));
			
			WebElement drop = driver.findElement(By.id("article4"));
			WebDriverWait w1=new WebDriverWait(driver, 50);
			w1.until(ExpectedConditions.visibilityOf(drop));
			
		//	a.dragAndDrop(drag, drop).build().perform();
			a.clickAndHold(drag).moveToElement(drop).build().perform();
			
			
			
			
			
			
		
	}
	
	
}
