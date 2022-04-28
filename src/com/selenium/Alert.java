package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		WebElement simple_alert = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		simple_alert.click();
		Thread.sleep(3000);
		WebElement alert = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		alert.click();
		org.openqa.selenium.Alert alert1= driver.switchTo().alert();
		alert1.accept();
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		confirm_alert.click();
		Thread.sleep(3000);
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		alert2.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		Thread.sleep(3000);
		
		WebElement prompt_alert = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		prompt_alert.click();
		Thread.sleep(3000);
		WebElement alert4 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alert4.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert5 = driver.switchTo().alert();
		alert5.sendKeys("hello everyone");
		alert5.accept();
		
		WebElement print = driver.findElement(By.id("demo1"));
		System.out.println(print.getText());
		driver.close();
		

		
	}

}
