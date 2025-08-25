package com.week5.day1;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableInteraction {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();		
		option.addArguments("guest");	
		option.addArguments("--disable-notifications");	
		ChromeDriver driver = new ChromeDriver(option);
		//load the url
		driver.get("https://erail.in");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//locate the from field
		WebElement from  =driver.findElement(By.id("txtStationFrom"));
		//clear the existing val
		from.clear();
		//provide input
		from.sendKeys("MAS");	
		//locate the to field
		WebElement to = driver.findElement(By.id("txtStationTo"));
		//clear the existing val
		to.clear();
		//provide input
		to.sendKeys("MDU");
		//click on sort checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//locate table element
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		//fetch all the train name in list
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		//create an empty set
		Set<String>	uniqtrainset = new HashSet<>();
		//declare and initialize variable
		boolean duplicate=false;
		//use for loop to iterate list of train name and store it in webelement
		for(WebElement train :trainnames) {
			//get the text of trainname and store it in string variable
			String trainname = train.getText();
			System.out.println(trainname);	
			//if duplicate train name found,store it in set and mark it as true
			if(!uniqtrainset.add(trainname)) {
			System.out.println("Duplicate train name is found :" + trainname );
			duplicate=true;
			}
		}
		//print all the unique train set
			System.out.println("Duplicate train name is not found :" + uniqtrainset);
		
	
		if(duplicate) {
			System.out.println("There is duplicate train name in the list");
		}
		else {
			System.out.println("There is no duplicate train name in the list");
		}
		}
}	


