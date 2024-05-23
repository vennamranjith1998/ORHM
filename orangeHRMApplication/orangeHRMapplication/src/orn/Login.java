package orn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	ChromeDriver chromeBrowser = new ChromeDriver();

	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	chromeBrowser.get(applicationUrlAddress);
	

	// Expected Title should be - OrangeHRM
	// Expected Url Address shold have - orangehrm-4.2.0.1

	// Verification & Validation of UserName

	/*
	<input name="txtUsername" id="txtUsername" type="text">


	Element Properties
	Element Properties always contains Attributes and its Corresponding values

	 < - tag
	 input - tag name

	name - attribute / Locator
	txtUsername - value / selector

	id - attribute / locator
	txtUsername - value / selctor

	type - attribute
	text - value
	*/

	// Identification of the Element will done based on the Locator and its corresponding selector
	// Locator and selector of the Element should be found from the properties of the element by inspecting the element

	// 1. chromeBrowser.findElement(By.id("txtUsername")).sendKeys("ranjithreddy");

	 
	//WebElement userName=chromeBrowser.findElement(By.id("txtUsername")); // WebElement is identified with the Property and assigned to a variable
	//userName.sendKeys("Testing" ); // an operation is performed on the Identified WebElement
	

	/* 3.
	By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
	WebElement userName=chromeBrowser.findElement(userNameProperty); // Identify the element in the Current WebPage
	userName.sendKeys("WebDriver"); // Operation on the Identified WebElement
	*/


	String userNameTestData="ranjithreddy"; // TestData assigned to a Variable
	By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
	WebElement userName=chromeBrowser.findElement(userNameProperty); // Identify the element in the Current WebPage
	userName.sendKeys(userNameTestData);// Operation on the Identified WebElement

	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

	String passwordTestData="Ranjith@143";
	By passwordProperty=By.name("txtPassword");
	WebElement password=chromeBrowser.findElement(passwordProperty);
	password.sendKeys(passwordTestData);

	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	By logInButtonProperty=By.className("button");
	WebElement logInButton=chromeBrowser.findElement(logInButtonProperty);
	logInButton.click();

	// Validate the Home Page of OrangeHRM Application
	// Expected Title should be - OrangeHRM
	// Expected Url Address shold have - orangehrm-4.2.0.1


	// Automate WelCome Admin
	// Automate LogOut

	// Validate the LogIn Page of OrangeHRM Application
	// Expected Title should be - OrangeHRM
	// Expected Url Address shold have - orangehrm-4.2.0.1

	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</aby
	By welcomeproperty=By.className("panelTrigger");
	WebElement welcome=chromeBrowser.findElement(welcomeproperty);
    welcome.click();
    //Sychronization
    Thread.sleep(10000);//its waits of java language
    
    //Automate Logout
   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
    By logOutProperty=By.linkText("Logout");
    WebElement logout=chromeBrowser.findElement(logOutProperty);
    logout.click();
	}
}
    
  