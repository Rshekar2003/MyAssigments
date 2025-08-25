package com.week5.marathon;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws Exception {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev355356.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("u-pN7/dGjKC4");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		Thread.sleep(3000);
		shadow.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(3000);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		shadow.findElementByXPath("//a/h2[contains(text(),'Mobiles')]").click();
		Thread.sleep(2000);		
		shadow.findElementByXPath("//h2/strong[contains(text(),'Apple iPhone 13 pro')]").click();
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("99");
		WebElement monthlydrop = driver.findElement(By.xpath("//select[@name='IO:ff1f478e9747011021983d1e6253af68']"));
		Select dropdown = new Select(monthlydrop);
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[5]/div/span/label")).click();
		driver.findElement(By.xpath("(//div[2]/div/span[@class='input-group-radio']/label)[3]")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String orderstatus = driver.findElement(By.xpath("//div[@class='notification notification-success']/span/following-sibling::span")).getText();
		if(orderstatus.equals("Thank you, your request has been submitted")) {
			System.out.println("order is submitted successfully");
		}
		else {
			System.out.println("order is not submitted successfully");
		}
		String ordernumber = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("ordernumber :" +ordernumber);
		try {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		//get the screenshot as file
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String filepath = "C:\\Users\\sheka\\Downloads\\file1.jpeg";
		//define the dest file
		File destfile = new File(filepath);
		FileUtils.copyFile(srcfile, destfile);
		System.out.println("screenshot captured and stored to :"+filepath);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
