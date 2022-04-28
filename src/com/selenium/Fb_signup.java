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
import org.openqa.selenium.support.ui.Select;

public class Fb_signup {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	WebElement creat = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	creat.click();
	
	Thread.sleep(3000);
	WebElement firstname = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
	firstname.sendKeys("margrat");
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	lastname.sendKeys("vinola");
	
	WebElement number = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
	number.sendKeys("1234567890");
	
	WebElement renumber = driver.findElement(By.xpath("//input[@data-type='password']"));
	renumber.sendKeys("abc@123");
	
	WebElement day = driver.findElement(By.id("day"));
	Select s =new Select(day);
	s.selectByValue("12");
	WebElement month = driver.findElement(By.id("month"));
	Select s1 =new Select(month);
	s1.selectByValue("4");
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 =new Select(year);
	s2.selectByValue("1992");
	WebElement sex = driver.findElement(By.name("sex"));
	sex.click();
	
	Thread.sleep(3000);
	WebElement signup = driver.findElement(By.name("websubmit"));
	signup.click();
	Thread.sleep(3000);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\007\\eclipse-workspace\\Selenium\\Screenshots\\fbsignup.png");
	FileUtils.copyFile(screenshot, destination);

	
	driver.close();
	
	


}
	
}