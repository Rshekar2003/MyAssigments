package com.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class LaunchBrowser {

	public static void main(String[] args) {		
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://testleaf.com");
//		driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Clcik on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

		// Step1: Find the dropdown element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Select-Create an Object
		Select dropdown = new Select(sourceElement);

		// Step3: Use the method to Select - 3 Methods
		// dropdown.selectByIndex(4);
		// dropdown.selectByVisibleText("Conference");
		dropdown.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));		
		Select dropdown1 = new Select(Industry);
		dropdown1.selectByValue("IND_HARDWARE");

		// Click on the Create lead button
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
}
	
}
