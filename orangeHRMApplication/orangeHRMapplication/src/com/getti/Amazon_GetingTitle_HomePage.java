
package com.getti;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_GetingTitle_HomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe");
		
		ChromeDriver chromeBroswer=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\EdgeBrowser\\msedgedriver.exe");
		EdgeDriver edge = new EdgeDriver();
		
		
		chromeBroswer.get("http://amazon.in");
		
		String amazonHomePageTitle=chromeBroswer.getTitle();
		
		System.out.println("The title of the Amazon Application Home Page is:"+amazonHomePageTitle);
		
		chromeBroswer.quit();		
	}


	}
