package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {


public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\007\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='sc-chbbiW bQENkS']"));
		element.click();
		
		Thread.sleep(6000);
		
		
		WebElement findElement = driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		findElement.click();
		
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='sc-cMljjf ilbRNt'])[1]"));
		element2.click();
		
		Thread.sleep(5000);
		
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\007\\eclipse-workspace\\Selenium\\Screenshots\\bookmyshow.png");
		FileUtils.copyFile(screenshot, destination);
		

}
}
