package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon_GetTitleHomepage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe");
		
		ChromeDriver chromeBroswer=new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\EdgeBrowser\\msedgedriver.exe");
		//EdgeDriver edge = new EdgeDriver();
		
		
		chromeBroswer.get("http://amazon.in");
		
		String amazonHomePageTitle=chromeBroswer.getTitle();
		
		System.out.println("The title of the Amazon Application Home Page is:"+amazonHomePageTitle);
		
		chromeBroswer.quit();		
	}

}
