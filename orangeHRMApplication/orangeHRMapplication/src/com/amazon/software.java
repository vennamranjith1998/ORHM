package com.amazon;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class software 
{
	WebDriver driver;
	String applicationUrlAddress="https://www.amazon.in/";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	}


	public void MouseHoverOperationOnAmazonHomePageLinks()
	
	{
		//<a href="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0" class="nav-a nav-a-2   nav-progressive-attribute" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav-link-accountList" data-csa-c-content-id="nav_ya_signin" data-csa-c-id="lp5m5c-2vbvph-keu1nn-3b352n">
		//  <div class="nav-line-1-container"><span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span></div>
		 // <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		//  </span>
		//</a>
		By amazonHomePageHelloSignInProperties=By.id("nav-link-accountList");
		WebElement amazonHomePageHelloSignIn=driver.findElement(amazonHomePageHelloSignInProperties);
		//creating an Object for the Action class to work with mouse operation;
	 Actions mouseHoverOperation=new Actions(driver);
		
	 mouseHoverOperation.moveToElement(amazonHomePageHelloSignIn).build().perform();

	}
	public void amazonHomePage_DisplayHidenLinkYourOrder() 
	{
	//	<span class="nav-text">Your Orders</span>
		By amazonHomepage_DisplayHidenLinkyourorder=By.linkText("Your Orders");
		WebElement amazonHomepage_DisplayHidenLinkyourorderOperation=driver.findElement(amazonHomepage_DisplayHidenLinkyourorder);

		amazonHomepage_DisplayHidenLinkyourorderOperation.click();
		//string hidenlinkYourOrder=amazonHomePage_DisplayHidenLinkyourorderoperation.getText();
		//system.out.println(hidenLinkYourOrder);
		
	}
	public void applicationClose() {
		driver.close();
	}
			public static void main(String[] args) {
				software  amazonHomePageLink=new software ();
				amazonHomePageLink.applicationLaunch();
				amazonHomePageLink.MouseHoverOperationOnAmazonHomePageLinks();
				amazonHomePageLink.amazonHomePage_DisplayHidenLinkYourOrder();
				amazonHomePageLink.applicationClose();
				//driver.getCurrentUrl();

				
			}
			private static void YourOrdersOfAmazonApplication() {
				// TODO Auto-generated method stub
				
			}
			{
				
				
			}
				
}
	



