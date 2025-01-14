package com.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.log;

public class BaseTest

{
	public static WebDriver driver;
	public String applicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	@BeforeMethod
	public void applicationlaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();

	log.info("************Successfully Launched OrangeHRM Application ************");
	}

	@AfterMethod
	public void appplicationClose()
	{
	driver.close();
	log.info("********* OrangeHRM Applicatio Closed Successfully ************");
	}

	}
	
