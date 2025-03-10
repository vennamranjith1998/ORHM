package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;

import com.basetest.BaseTest;
import com.utility.log;

public class LogInPage  extends BaseTest{
	
	
	public LogInPage() // Constructor - when the Class Name is smilar to the Method Name
	{

	PageFactory.initElements(driver, this);
	}

	// This is an Object Repository Class

	// 1. Information of the WebElement - based on the Property - stored and assigned to a variable
	// id="logInPanelHeading"

	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;

	// 2. Business Logic(User Defined Method) - an operation that need to be performed on the WebElement

	public void orangeHRMApplicationLogInPage_logInPanelValidation()
	{
	String expected_OrangeHRMApplicationLogInPage_logInPanelText="LOGIN Panel";
	log.info(" The Expected OrangeHRM Application LogIn Page Text is :- "+expected_OrangeHRMApplicationLogInPage_logInPanelText);

	String actual_OrangeHRMApplicationLogInPage_logInPanelText=logInPanel.getText();
	log.info("The Actual OrangeHRM Application LogIN Page Text is :-"+actual_OrangeHRMApplicationLogInPage_logInPanelText);

	if(actual_OrangeHRMApplicationLogInPage_logInPanelText.equals(expected_OrangeHRMApplicationLogInPage_logInPanelText))
	{
	log.info(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	log.info(" Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
	}
	}




	// /html/body/div[1]/div/div[2]/div/img - LoGo Property
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	
	WebElement orangeHRMApplicationLogInPageLogo ;

	public void orangeHRMApplication_LogInPageLogoValidation()
	{
	boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();
	if(flag)
	{
	log.info("OrangeHRM Applicaiton LogIn Page Contains LOGO - PASS");
	}
	else
	{
	log.info("OrangeHRM Applicaiton LogIn Page DOEST NOT Contains LOGO - FAIL");
	}
	}


	//id="txtUsername"
	@FindBy(id="txtUsername")
	WebElement UserName;

	//name="txtPassword"
	@FindBy(name="txtPassword")
	WebElement Password;

	// name="Submit"
	@FindBy(name="Submit")
	WebElement logInButton;

	public void logInValidation(String userName,String password)
	{
	UserName.sendKeys(userName);
	Password.sendKeys(password);
	logInButton.click();
	}

	}


