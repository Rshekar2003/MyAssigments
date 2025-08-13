package com.week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TicketBoooking {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//Initiate the driver
		ChromeDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("https://www.pvrcinemas.com/");	
		//maximize the window
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select cinema under quickbook
		driver.findElement(By.xpath("(//span[contains(text(),'Cinema')])[1]")).click();	
		//select movie
		driver.findElement(By.xpath("(//span[contains(text(),'Cinema')])[2]")).click();	
		//select your cinema
		driver.findElement(By.xpath("//span[contains(text(),'INOX National,Virugambakkam Chennai')]")).click();
		//select date as tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//select movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		//select movie time
		driver.findElement(By.xpath("//span[contains(text(),'07:25 PM')]")).click();
		//click book
		driver.findElement(By.xpath("//button[@type='submit']/span[contains(text(),'Book')]")).click();	
		//click on accept
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		//select seats
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click();
		//click on proceed
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		//get the seat info
		String seatinfo = driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
		System.out.println("seatinfo is " + seatinfo);
		String seatno=driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("seatno is " + seatno);
		//get the grand total
		String grandtotal = driver.findElement(By.xpath("//span[contains(text(),'214.48')]")).getText();
		System.out.println("Grand total is :" + grandtotal);
		//click on continue
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		//close the popup
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2']/span/i)[2]")).click();
		//print page title
		String pagetitle = driver.getTitle();
		System.out.println("current page title is " + pagetitle);
		//close the browser
		driver.close();
		
	}}	
