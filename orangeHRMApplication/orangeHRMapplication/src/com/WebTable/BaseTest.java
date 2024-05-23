package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest
{


WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

@BeforeTest
public void applicationLauch()
{

System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
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

