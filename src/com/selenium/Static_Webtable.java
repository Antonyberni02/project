package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/");
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.xpath("//img[@src='images/table.png']"));
		table.click();
		
		System.out.println("**** ALL DATAS*****");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for (WebElement all : alldata)
		{
			System.out.println(all.getText());
			
		}
		
        System.out.println("**** HEADER*****");
		
		List<WebElement> header = driver.findElements(By.xpath("//table//tbody/tr/th"));
		for (WebElement head :header)
		{
			System.out.println(head.getText());
			
		}
		
        System.out.println("**** SPECIFIC ROWS*****");
		
		List<WebElement> specific_row = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement sr : specific_row)
		{
			System.out.println(sr.getText());
			
		}

        System.out.println("**** SPECIFIC COLUMNS*****");
		
		List<WebElement> specific_columns = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement sc : specific_columns)
		{
			System.out.println(sc.getText());
			
		}
		
		List<WebElement> row_size = driver.findElements(By.tagName("tr"));
		int size = row_size.size();
		System.out.println("ROW SIZE :"+size);
		
		List<WebElement> column_size = driver.findElements(By.tagName("td"));
		int size1 = column_size.size();
		System.out.println("COLUMN SIZE :"+size1);
		
		WebElement follow = driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[4]"));
		System.out.println(follow.getText());
		
		driver.close();
}
}
