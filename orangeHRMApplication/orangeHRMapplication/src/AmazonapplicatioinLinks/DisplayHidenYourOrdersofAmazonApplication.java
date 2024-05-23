package AmazonapplicatioinLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DisplayHidenYourOrdersofAmazonApplication
{
	WebDriver driver;
	String applicationUrlAddress="http://Amazon.in";
	public void applicationLaunch() {
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");


	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();

	}


	public void MouseHoverOperationOnAmazonHomePageLinks() {

	//<a href="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0" class="nav-a nav-a-2   nav-progressive-attribute" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav-link-accountList" data-csa-c-content-id="nav_ya_signin" data-csa-c-id="y84uxb-q3g4f-vrdyqe-upyqiq">
	//<div class="nav-line-1-container"><span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span></div>
	// <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span> </span></a>

	By amazonHomePageHelloSignInProperties=By.id("nav-link-accountList");
	WebElement amazonHomePageHelloSignIn=driver.findElement(amazonHomePageHelloSignInProperties);



	// Creating an Object for the Actions class to work with Mouse Operation
	Actions mouseHoverOperatoins=new Actions(driver);
	mouseHoverOperatoins.moveToElement(amazonHomePageHelloSignIn).build().perform();

	}
	public void amazonHomePage_DisplayHidenLinkYourOrder() {
	//<span class="nav-text">Your Orders</span>
	//<span class="nav-text">Create a Wish List</span>
	By amazonHomepage_DisplayHidenLinkyourorder=By.linkText("Your Orders");
	WebElement amazonHomepage_DisplayHidenLinkyourorderOperation=driver.findElement(amazonHomepage_DisplayHidenLinkyourorder);

	amazonHomepage_DisplayHidenLinkyourorderOperation.click();
	//String hidenLinkYourOrder=amazonHomepage_DisplayHidenLinkyourorderOperation.getText();
	//System.out.println(hidenLinkYourOrder);

	}
	public void applicationClose() {
	driver.close();
	}



	   public static void main(String[] args) {


	 DisplayHidenYourOrdersofAmazonApplication amazonHomePageLink=new  DisplayHidenYourOrdersofAmazonApplication();
	amazonHomePageLink.applicationLaunch();
	amazonHomePageLink.MouseHoverOperationOnAmazonHomePageLinks();
	amazonHomePageLink.amazonHomePage_DisplayHidenLinkYourOrder();
	amazonHomePageLink.applicationClose();
	//driver.getCurrentUrl();


	// TODO Auto-generated method stub

	 }

	}




