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

public class Adactin_Hotel {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\007\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		TakesScreenshot ts =(TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\007\\eclipse-workspace\\Selenium\\Screenshots\\adactin1.png");
		FileUtils.copyFile(screenshot, destination);
		
		
		/*WebElement newuser = driver.findElement(By.xpath("(//a[@href])[4]"));
		newuser.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pmargrat123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234@abc");
		
		WebElement repassword = driver.findElement(By.id("re_password"));
		repassword.sendKeys("1234@abc");
		
		WebElement fullname = driver.findElement(By.name("full_name"));
		fullname.sendKeys("margrat vinola");
		
		WebElement email = driver.findElement(By.name("email_add"));
		email.sendKeys("vinolia12@gmail.com");
		
		Thread.sleep(11000);
		

		WebElement checkbox = driver.findElement(By.name("tnc_box"));
		checkbox.click();
		
		WebElement register = driver.findElement(By.name("Submit"));
		register.click();
		
		WebElement login = driver.findElement(By.xpath("//a[@href='index.php']"));
		login.click();*/
		
		WebElement username1 = driver.findElement(By.name("username"));
		username1.sendKeys("pmargrat123");
		
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("1234@abc");
		
		WebElement login1 = driver.findElement(By.name("login"));
		login1.click();
		
		WebElement location = driver.findElement(By.name("location"));
		Select s =new Select(location);
		s.selectByValue("Paris");
		Thread.sleep(3000);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 =new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(3000);
		
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2 =new Select(roomtype);
		s2.selectByValue("Deluxe");
		Thread.sleep(3000);

		WebElement roomnumbers = driver.findElement(By.name("room_nos"));
		Select s3 =new Select(roomnumbers);
		s3.selectByValue("1");
		Thread.sleep(3000);
		
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select s4 =new Select(adults);
		s4.selectByValue("2");
		Thread.sleep(3000);
		
		WebElement children = driver.findElement(By.name("child_room"));
		Select s5 =new Select(children);
		s5.selectByValue("1");
		Thread.sleep(3000);
		
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		Thread.sleep(3000);
		
		 WebElement click = driver.findElement(By.name("radiobutton_0"));
		 click.click();
		 WebElement click1= driver.findElement(By.name("continue"));
		 click1.click();
		 WebElement firstname = driver.findElement(By.name("first_name"));
		 firstname.sendKeys("margrat");
		 WebElement lastname = driver.findElement(By.name("last_name"));
		 lastname.sendKeys("vinola");
		 WebElement address = driver.findElement(By.name("address"));
		 address.sendKeys("chennai");
		 WebElement card_no = driver.findElement(By.name("cc_num"));
		 card_no.sendKeys("1234567812345678");
		 
		 WebElement card = driver.findElement(By.name("cc_type"));
		 Select s6 =new Select(card);
		 s6.selectByValue("VISA");
		 Thread.sleep(3000);
		 
		 WebElement month = driver.findElement(By.name("cc_exp_month"));
		 Select s7 =new Select(month);
		 s7.selectByIndex(5);
		 Thread.sleep(3000);
		 
		 WebElement year = driver.findElement(By.name("cc_exp_year"));
		 Select s8 =new Select(year);
		 s8.selectByValue("2022");
		 Thread.sleep(3000);
		 
		 WebElement cvv = driver.findElement(By.name("cc_cvv"));
		 cvv.sendKeys("123");
		 
		 Thread.sleep(3000);
		 WebElement book = driver.findElement(By.name("book_now"));
		 book.click();
		 Thread.sleep(3000);
		    TakesScreenshot ts1 =(TakesScreenshot) driver;
			File screenshot1 = ts1.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\007\\eclipse-workspace\\Selenium\\Screenshots\\adactin2.png");
			FileUtils.copyFile(screenshot1, destination1);
		 
		 
		 
	}
	
	

}
