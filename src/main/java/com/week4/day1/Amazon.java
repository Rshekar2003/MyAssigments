package com.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		//initiate webdriver
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the url
		driver.get("https://Amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get the search field locator
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		//retreive all the phone price webelement
		List<WebElement> webElement = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//create an empty list
		List<Integer> pricelist = new ArrayList();
		int prizesize = webElement.size();
		//use for loop to iterate each webelement using index
		for(int i=0;i<prizesize;i++) {
			WebElement ele = webElement.get(i);
			String prices = ele.getText().replace(",", "");	
			pricelist.add(Integer.parseInt(prices));
		}
		//arrange the list in ascending 
		Collections.sort(pricelist);
		System.out.println("sorted pricelist :" +pricelist);
		//print the lowest price
		int lowestprice = pricelist.get(0);
		System.out.println("lowestprice :" + lowestprice);
		

	}

}
