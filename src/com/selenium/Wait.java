package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			//implicit wait - for loading entire page
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			
			//explicit wait -loading for particular web element
			
			WebElement amazon_cares = driver.findElement(By.xpath("(//a[@class='nav_a'])[4]"));
			System.out.println(amazon_cares.getText());
			WebDriverWait wait =new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(amazon_cares));
			System.out.println("******condition ok*******");
			driver.close();
			
			

	}

}
