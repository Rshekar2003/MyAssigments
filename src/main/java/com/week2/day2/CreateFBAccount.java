package com.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAccount {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		
		//load the url
		driver.get("https://facebook.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter Firstname
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		//Enter surname
		driver.findElement(By.name("lastname")).sendKeys("doe");
		
		//Enter mobile or email		
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input")).sendKeys("abc@gmail.com");
		
		//Enter newpassword
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abc@123");
		
		//select day of DOB
		WebElement day = driver.findElement(By.id("day"));
		Select daydrop = new Select(day);
		daydrop.selectByValue("20");
		
		//select month of DOB
		WebElement month = driver.findElement(By.id("month"));
		Select monthdrop = new Select(month);
		monthdrop.selectByVisibleText("Mar");
		
		//select year of dob
		WebElement year = driver.findElement(By.id("year"));
		Select yeardrop = new Select(year);
		yeardrop.selectByValue("1990");
		
		//select radiobutton of gender
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();
		
		//click on signupbutton
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		
	}

}
