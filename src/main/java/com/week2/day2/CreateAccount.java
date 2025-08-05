package com.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

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
				
				// Click on the Accounts link
				driver.findElement(By.linkText("Accounts")).click();

				// Click on the Create Account link
				driver.findElement(By.linkText("Create Account")).click();

				// Enter Account name
				driver.findElement(By.id("accountName")).sendKeys("Automation002");

				// Enter description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

				// Step1: Find the dropdown element
				WebElement industry = driver.findElement(By.name("industryEnumId"));

				// Step2: Select-industry
				Select dropdown = new Select(industry);
				dropdown.selectByValue("IND_SOFTWARE");
				
				//Select-ownership
				WebElement ownership = driver.findElement(By.name("ownershipEnumId"));		
				Select dropdown1 = new Select(ownership);
				dropdown1.selectByVisibleText("S-Corporation");
				
				//Select-source
				WebElement source = driver.findElement(By.id("dataSourceId"));		
				Select dropdown2 = new Select(source);
				dropdown2.selectByValue("LEAD_EMPLOYEE");
				
				//Select-campaign
				WebElement campaign = driver.findElement(By.id("marketingCampaignId"));		
				Select dropdown3 = new Select(campaign);
				dropdown3.selectByIndex(6);

				//Select-state
				WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));		
				Select dropdown4 = new Select(state);
				dropdown4.selectByValue("TX");			
				
				// Click on the Create account button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//click on find account
				driver.findElement(By.linkText("Find Accounts")).click();
				
				// Enter Account name
				driver.findElement(By.name("accountName")).sendKeys("Automation002");
				
				//click on find button
				driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
				
				//click on  account
				driver.findElement(By.linkText("Automation002")).click();
				//compare Expected vs actual 
				String ActualAccount = driver.findElement(By.xpath("//span[contains(text(),'Automation002')]")).getText();
				String ExpectedAccount = "Automation002";
				if(ActualAccount.equals(ExpectedAccount)) {
					System.out.println("Accountname is displayed correctly" + ActualAccount );
				}
				driver.close();
				
		}


	}


