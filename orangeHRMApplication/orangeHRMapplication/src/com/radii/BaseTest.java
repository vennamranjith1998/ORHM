package com.radii;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseTest 
{
	
	WebDriver driver;
	String applicationUrlAddress="https://www.rediff.com/";
	@BeforeTest
	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
//	WebDriver driver ;
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);


	}

	@AfterTest
	public void applicationClose()
	{
	driver.close();
	}



	}



