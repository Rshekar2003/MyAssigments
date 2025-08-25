package com.week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	
	@DataProvider
	public String[][] sendData() throws IOException {
		
//		String data[][] = new String[2][3];
//		data[0][0] = "Qeagle";
//		data[0][1] = "Rajashekar";
//		data[0][2] = "Nagaraj";
//		
//		data[1][0] = "Testleaf";
//		data[1][1] = "Hari";
//		data[1][2] = "R";
//		
		return ReadData.readData();
		
		}
	
	
	
	@Test(dataProvider="sendData")
	public void createLead(String companyname, String firstname, String lastname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
	}
}
