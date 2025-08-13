package com.week3.day2;

public class LoginPage extends BasePage {
	
	
	public void performCommonTask() {
		super.performCommonTask();
		System.out.println("PerformCommontask override");
		
	}

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage();
		loginPage.performCommonTask();
		BasePage basepage = new BasePage();
		basepage.clickElement();
		basepage.enterText();
		basepage.performCommonTask();
		

	}

}
