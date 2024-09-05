package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	//WebDriverManager.chromedriver().setup();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.youtube.com");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Fantasy Cousel");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
	}
		
}