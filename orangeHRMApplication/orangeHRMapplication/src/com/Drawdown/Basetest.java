package com.Drawdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest
{

WebDriver driver;
String applicationUrlAddress="https://www.osmania.ac.in/oldsite//";

public void applicationLauch()
{

System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
driver = new ChromeDriver();

driver.get(applicationUrlAddress);

driver.manage().window().maximize();

//Thread.sleep(10000);



}


public void applicationClose()
{
driver.close();
}



}

