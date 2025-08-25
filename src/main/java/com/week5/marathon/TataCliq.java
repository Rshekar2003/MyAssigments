package com.week5.marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		option.addArguments("--disable-notification-");		
		ChromeDriver driver = new ChromeDriver(option);
		//load the url
		driver.get("https://www.tatacliq.com/");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handle sweet alert by locating the element
		driver.findElement(By.id("moe-dontallow_button")).click();
		//locate the brand element
		WebElement brandhover = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		//create action class to handle hover action
		Actions action = new Actions(driver);
		action.moveToElement(brandhover).perform();
		//locate watch accessory hover
		WebElement watchhover = driver.findElement(By.xpath("//div[contains(text(),'Watches & Accessories')]"));
		action.moveToElement(watchhover).perform();
		//click casio
		driver.findElement(By.xpath("//div[contains(text(),'Casio')]")).click();
		//locate sortby dropdown
		WebElement sortbydrop = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		//create select class to handle dropdown
		Select dropdown = new Select(sortbydrop);
		//select value visible by text
		dropdown.selectByVisibleText("New Arrivals");
		//click the radio button
		driver.findElement(By.xpath("//div[contains(text(),'Men')]/preceding-sibling::div")).click();
		//fetch all the watch price and store it in list
		List<WebElement> watchprice = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		String price = null;
		//iterate the price and get the first product price
		for(int i=0;i<watchprice.size();i++) {
			WebElement allprice = watchprice.get(0);
			price = allprice.getText().replaceAll("\\D+", "");
			//get the price of product in parent window
			System.out.println("Casio price in parent window : " +price);
			break;
			}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//click on the first product
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Casio MTP-SN2KD-1A Enticer Analog Watch For Men"))).click();
		//handle the window and store it in set to get unique values
		Set<String> windows = driver.getWindowHandles();
		//store it in list to iterate using index
		List<String> allwindow = new ArrayList<>(windows);
		for(String windowhandle:allwindow) {
			//switch to child window
			driver.switchTo().window(allwindow.get(1));
		}
		//locate the price of the product
		WebElement pricetext = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		//get the price in child window
		String actualprice = pricetext.getText().replaceAll("\\D+", "");
		System.out.println("Casio price in child window : " + actualprice);
		//compare the prices
		if(actualprice.equals(price)) {
			System.out.println("Price is displayed as expected :" + actualprice);
			
		}
		//click on addtocart
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		//locate the cart icon and fetch cart value
		String cart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("No.of products added in cart:" +cart);
		//close the child window
		driver.close();
		//switch to parent window
		driver.switchTo().window(allwindow.get(0));
		//close the window
		driver.close();
	}

}
