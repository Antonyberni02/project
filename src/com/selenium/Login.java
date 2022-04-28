package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\007\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("My title is:"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("current url is :"+url);
		
		String source = driver.getPageSource();
		System.out.println("page source is:"+source);
		
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		driver.close();
		
		
	}

}
