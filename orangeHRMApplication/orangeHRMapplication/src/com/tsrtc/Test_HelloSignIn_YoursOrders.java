package com.tsrtc;

import org.apache.poi.hpbf.model.MainContents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_HelloSignIn_YoursOrders 
{
	WebDriver driver;
	String applicationUrlAddress="https://www.amazon.in//";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "/browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);


	}


	public void applicationClose()
	{

	}

}
