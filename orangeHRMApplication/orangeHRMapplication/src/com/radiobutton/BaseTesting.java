package com.radiobutton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTesting
{
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	public void applicationLauch() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	//driver.manage().window().maximize();

	//
	Thread.sleep(10000);



	}


	public void applicationClose()
	{
	driver.close();
	}



	}

