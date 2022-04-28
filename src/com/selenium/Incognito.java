package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
	    WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
         TakesScreenshot ts = (TakesScreenshot) driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File des=new File("C:\\Users\\007\\eclipse-workspace\\Selenium\\Screenshots\\incongnito.png");
         FileUtils.copyFile(source, des);
                 
		
				
		
	}
}
