package com.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrainTicket {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//click on flights
		driver.findElement(By.xpath(" //a[contains(text(),'FLIGHTS')]")).click();
		//get the windows
		Set<String> address = driver.getWindowHandles();
		List<String> alladdress = new ArrayList<String>(address);
		driver.switchTo().window(alladdress.get(1));
		String pagetitle = driver.getTitle();
		System.out.println("Current page title is : " + pagetitle);
		driver.switchTo().window(alladdress.get(0));
		driver.close();

}
}