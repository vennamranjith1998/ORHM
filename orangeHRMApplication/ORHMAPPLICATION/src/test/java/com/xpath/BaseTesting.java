package com.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTesting
{
	WebDriver driver;
	String applicationUrlAddress="https://www.facebook.com";
    @Beforetest
	public void applicationLauch() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	//driver.manage().window().maximize();

	//
	Thread.sleep(10000);



	}

@Aftertest
	public void applicationClose()
	{
	driver.close();
	}



	}

