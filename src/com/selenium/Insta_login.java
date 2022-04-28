package com.selenium;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Insta_login {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\007\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("abcd@gmail.com");
			
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("123445354");
			
			Thread.sleep(5000);
			
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
		//	WebElement text = driver.findElement(By.id("reg_pages_msg"));
		//	String text2 = text.getText();
		//	System.out.println(text2);
			
			Thread.sleep(3000);
			
			driver.close();
}}
