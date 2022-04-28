package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Maximize {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		    
		    Thread.sleep(3000);
		    Dimension d=new Dimension(100,1000);
		    driver.manage().window().setSize(d);
		    Thread.sleep(3000);
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.close();
	}

}
