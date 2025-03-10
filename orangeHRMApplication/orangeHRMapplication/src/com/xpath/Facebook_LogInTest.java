package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webtablecity.basetest;

public class Facebook_LogInTest extends BaseTesting
{
	@Test
	public void logInTest()
	{

	/*
	 
	<input type="text"   data-testid="royal_email"
	 placeholder="Email address or
	 phone number" autofocus="1" aria-label="Email address or phone number">


	 Xpath Expression - Relative Xpath

	locator - xpath
	Selector(Xpath Expression is created by the Test Engineer based on the
	         available Properties(attibutes and their corresponding valies))

	Syntax for creating Xpath Expression - Based on Single Property
	    //tagname[@attribute='attributeValue']
	    //input[@data-testid='royal_email'] - Selector/xpath expression
	*/

	// By emailIdProperty=By.xpath("//input[@data-testid='royal_email']");
	               // OR
	By emailIdProperty=By.xpath("//*[@data-testid='royal_email']");

	// "//"- indicates search on the Complete WebPage
	// tagname - only search for the given tagName
	// "*" - search on the Complete WebPage for all the Tags


	WebElement emailId=driver.findElement(emailIdProperty);
	emailId.clear();
	emailId.sendKeys("srini.livetech@gmail.com");



	// Automating Password WebElement
	// Syntax for creating Xpath Expression - Based on Multiple Properties
	// //tagname[@attributename1='attributevalue1'][@attributename2='attributevalue2']......

	/* Password WebElement Properties
	<input type="password" class="inputtext _55r1 _6luy _9npi"
	 name="pass" id="pass" data-testid="royal_pass" placeholder="Password"
	  aria-label="Password">
	*/
	// Syntax
	//input[@type='password'][@id='pass']
//	      OR
	//*[@type='password'][@id='pass']

	//By passwordIdProperty=By.xpath("//input[@type='password'][@id='pass']");
//	                       OR
	By passwordIdProperty=By.xpath("//*[@type='password'][@id='pass']");

	// "//"- indicates search on the Complete WebPage
	// tagname - only search for the given tagName
	// "*" - search on the Complete WebPage for all the Tags


	WebElement password=driver.findElement(passwordIdProperty);
	password.clear();
	password.sendKeys("laddu");

	/*

	<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
	 name="login" data-testid="royal_login_button" type="submit"
	  id="u_0_5_g2">Log in</button>
	*/

	By logInButtonProperty=By.xpath("//button[@name='login']");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();


	}




	}




