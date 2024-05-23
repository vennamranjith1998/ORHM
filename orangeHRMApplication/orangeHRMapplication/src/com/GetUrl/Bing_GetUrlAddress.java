package com.GetUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_GetUrlAddress{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBroswer =new ChromeDriver();
		
		chromeBroswer.get("http://bing.com");
		
		//string applicationUrlAddress="http://bing.com";
		String applicationUrlAddress="http://bing.com";
		chromeBroswer.get(applicationUrlAddress);
		
		String bingHomePageTitle =chromeBroswer.getTitle();
		
		System.out.println("The Title of the BingHomepage is:"+bingHomePageTitle);
		
		//Get the Url  address of the webPage
		
		System.out.println("The User/TestEngineer Given Url Address is:-"+applicationUrlAddress);
		String bingHomePageCurrentUrlAddress=chromeBroswer.getCurrentUrl();
		
		System.out.println("The Current Url Address of the Bing Home Page after the application is launched is :-"+bingHomePageCurrentUrlAddress);
		chromeBroswer.quit();
		
		
		
	}

}
