package com.week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesAndAlerts {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		driver.switchTo().alert().accept();
		String message = driver.findElement(By.xpath("//button[contains(text(),'Try it')]/following-sibling::p")).getText();
		if(message.equals("You pressed OK!")) {
			System.out.println("User clicked on try it button");
		}
		else {
			System.out.println("User not clicked  try it button");
		}
	
	}

}
