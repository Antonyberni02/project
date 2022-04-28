package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select se =new Select(dropdown);
		
		// select by index ,value, visible text
		
		se.selectByIndex(1);
		Thread.sleep(4000);
		
		se.selectByValue("4");
		Thread.sleep(3000);
		
		se.selectByVisibleText("UFT/QTP");
		Thread.sleep(3000);
		
		//Multiple drop down
		
		WebElement findElement = driver.findElement(By.xpath("(//select)[6]"));
		Select select = new Select(findElement);
		
		boolean multiple = select.isMultiple();
		System.out.println("multiple dropdown :"+multiple);
		
		System.out.println("********MULTIPLE DROPDOWN**********");
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("size of drop down :"+size);
		for (WebElement i : options) {
			System.out.println(i.getText());
			
		}
		
	}

}