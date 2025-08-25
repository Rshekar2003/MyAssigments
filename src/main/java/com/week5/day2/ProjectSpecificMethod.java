package com.week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	ChromeOptions options = new ChromeOptions();	
	public ChromeDriver driver; 
	
	@BeforeMethod
	public void preCondition() {
		
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
	
	}

	@AfterMethod
	public void postCondition() {
		
		driver.quit();
	}
	
}
