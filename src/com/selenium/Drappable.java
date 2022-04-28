package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drappable {
	public static void main(String[] args) throws InterruptedException {
		
	

	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		Thread.sleep(3000);
	
		
		Actions a =new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.id("droppable"));
		a.clickAndHold(drag).moveToElement(drop).build().perform();
		//a.dragAndDrop(drag, drop).build().perform();
}
}