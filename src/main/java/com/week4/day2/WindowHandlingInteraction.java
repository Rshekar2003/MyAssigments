package com.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingInteraction {

	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> windowfrom = driver.getWindowHandles();
		List<String> allwindow = new ArrayList<String>(windowfrom);
		System.out.println(allwindow);
		for(int i=0;i<allwindow.size();i++) {
			driver.switchTo().window(allwindow.get(1));
			String child = driver.getWindowHandle();
			System.out.println("child:" + child);
			driver.findElement(By.xpath("(//a[contains(text(),'FrenchCustomer')])[1]")).click();
			break;
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Set<String> windowto = driver.getWindowHandles();
		List<String> allwindowto = new ArrayList<String>(windowto);
		for(int i = 0;i<allwindowto.size();i++) {
		driver.switchTo().window(allwindowto.get(1));
		driver.findElement(By.xpath("(//a[contains(text(),'FrenchCustomer')])[1]")).click();
		break;
		}				
		driver.switchTo().window(allwindowto.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();		
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println("title :" + title);
		if(title.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Page Title is verified");
		}
		else {
			System.out.println("Page Title is not verified");
		}
	}

}
