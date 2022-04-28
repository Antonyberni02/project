package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.leafground.com/pages/frame.html");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement frame = driver.findElement(By.xpath("(//div [@id='wrapframe'])[1]"));
    frame.click();
}}
