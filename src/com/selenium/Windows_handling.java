package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {

	public static void main(String[] args) throws InterruptedException, AWTException ,IOException{
		
		

		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			
			 Dimension d =new Dimension(100,1000);
	          driver.manage().window().setSize(d);
	          Thread.sleep(3000);
			
		
			Actions a=new Actions(driver);
			WebElement bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
			a.contextClick(bestseller).build().perform();
			
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
			a.contextClick(mobiles).build().perform();
			
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement today_deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
			a.contextClick(today_deal).build().perform();
			
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			int size = driver.getWindowHandles().size();
			System.out.println("Size :"+size);
			
			String parent_id = driver.getWindowHandle();
			System.out.println( "parent_id:"+ parent_id);
			
			Set<String> allwindow = driver.getWindowHandles();
		
			for (String i : allwindow) {
				
				String title = driver.switchTo().window(i).getTitle();
				System.out.println("Title:"+title);
			}
		    
		/*	String child="Amazon.in - Today's Deals";
			for (String i:allwindow) {
				
			
			if(driver.switchTo().window(i).getTitle().equalsIgnoreCase(child))
			{
			break;
			}
			
			}*/
			
			
		for (String close : allwindow) {
			if(!close.equals(parent_id)) {
				
				driver.switchTo().window(close).close();
			}
			
		}	
         
          
          driver.quit();

			
			
			

}}
