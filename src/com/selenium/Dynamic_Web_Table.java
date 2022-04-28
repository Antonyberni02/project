package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]"));
		System.out.println(table.getText());


}
}