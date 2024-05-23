package com.radii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class createaccount extends BaseTest
{
	@Test
	public void logInTest()
	{
	
	/*
	 <p id="signin_info"> 
	 <a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in"
	  class="signin">Sign in</a><br><a href="http://register.rediff.com/register/register.
	 php?FormName=user_details" title="Create Rediffmail Account">Create Account</a></p>
	 */
		
		//By createaccountproperty1=By.id("signin_info");

		// WebElement createaccount1=driver.findElement(createaccountproperty1);
		// System.out.println(createaccount1.getText());
	
  By createaccountproperty=By.xpath("//a[@title='Create Rediffmail Account']");

  

  WebElement createaccount=driver.findElement(createaccountproperty);
  createaccount.click();
 
 // <input type="text" onblur="fieldTrack(this);" name="name3cf89c6c" value="" style="width:185px;" maxlength="61">
  

      By fullnameproperty= By.xpath("//input[@name='name3cf89c6c']");
    WebElement fullname =driver.findElement(fullnameproperty);
    fullname.sendKeys("Vennam ranjithreddy");
    
  
}


}
