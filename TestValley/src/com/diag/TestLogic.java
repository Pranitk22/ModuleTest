package com.diag;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Drivers\\chromedriver-win64.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);
	}
}

