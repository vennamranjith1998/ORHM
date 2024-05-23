package googlehomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_signin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		//<a class="gb_J" aria-label="Gmail (opens a new tab)" data-pid="23" href="https://mail.google.com/mail/&amp;ogbl" target="_top">Gmail</a>
     By gmailloginproperty = By.linkText("Gmail");
    WebElement gmail= driver.findElement(gmailloginproperty);
    gmail.click();
    
   // <a class="button
            
  //  button--medium
           //   button--mobile-before-hero-only
  // " href="https://accounts.google.com/AccountChooser/signinchooser?service=mail&amp;continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=AccountChooser&amp;ec=asw-gmail-globalnav-signin" data-action="sign in" data-category="cta" data-label="header">Sign in</a>
    //<a class="button
            
    // button--medium button--mobile-before-hero-only " href="https://accounts.google.com/AccountChooser/signinchooser?service=mail&amp;continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=AccountChooser&amp;ec=asw-gmail-globalnav-signin" data-action="sign in" data-category="cta" data-label="header">Sign in</a>  
 By signinproperty= By.linkText("Sign in");
       WebElement signin = driver.findElement(signinproperty);
       signin.click();
       //<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" aria-disabled="false" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
  By gmailproperty= By.name("identifier");
  WebElement gmail1=driver.findElement(gmailproperty);
        gmail1.sendKeys("vennamranjith1998@gmail.com");
        
        
  
    
	}

}
