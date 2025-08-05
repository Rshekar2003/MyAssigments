package com.week2.day1;

public class EdgeBrowser {
	
	
	public String  launchbrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	
	public void  loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Browser browser = new Browser();
		String browname = browser.launchbrowser("Edge");
		System.out.println("browser name is " + browname);
		browser.loadUrl();
}
}
