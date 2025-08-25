package com.week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod{
	
	@Test
	public void salesforce() throws Exception {
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
	driver.findElement(By.xpath("(//span/p[@class='slds-truncate'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("(//div/textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
	List<WebElement> dropdownvalues = driver.findElements(By.xpath("//button[@id='combobox-button-470']"));
	for(WebElement dropdown : dropdownvalues) {
		if(dropdown.getText().equals("Active")){
			dropdown.click();
		}
	}
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String message =driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).getText();
	if(message.equals("Legal Entity Name")) {		
		System.out.println(message);
	}
}
}