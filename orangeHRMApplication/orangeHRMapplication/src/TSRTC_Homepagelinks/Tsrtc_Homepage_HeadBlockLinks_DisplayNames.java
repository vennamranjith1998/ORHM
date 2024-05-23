package TSRTC_Homepagelinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class Tsrtc_Homepage_HeadBlockLinks_DisplayNames 
{
public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver", "./myBrowserDrivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		 driver.get(applicationUrlAddress);

		

		

		// Identifying the Header Block of the Webpage

		// class="menu-wrap" - property of header Block

		

	By	tsrtc_HomePage_HeaderBlocks_Propertes=By.className("menu-wrap");

	WebElement	tsrtc_HomePage_HeaderBlocks=((WebElement) driver).findElement(tsrtc_HomePage_HeaderBlocks_Propertes);

	

	

	// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>

	// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

	//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>



	// Header Block ELement Common property is a- tag

 By	tsrtc_HomePage_HeaderBlockes_LinksPropertes=By.tagName("a");

 List<WebElement> tsrtc_HomePage_headerBlockes_links=tsrtc_HomePage_HeaderBlocks.findElements(tsrtc_HomePage_HeaderBlockes_LinksPropertes);

 int tsrtc_HomePage_headerBlockes_links_count=tsrtc_HomePage_headerBlockes_links.size();

 

 //WebElement	tsrtc_HomePage_HeaderLink_Element=tsrtc_HomePage_headerBlockes_links.;//click();



 //tsrtc_HomePage_HeaderLink_Element.click();

 

 

 System.out.println("The Number of header Links In A TSRTC Home Page Header Blocks is- "+tsrtc_HomePage_headerBlockes_links_count);

 System.out.println();

 

 //Printing the WebElement Of a type Links In A tsrtc Home Page Header Block Links names

 for(int arrayIndex=0;arrayIndex<tsrtc_HomePage_headerBlockes_links_count;arrayIndex++) {

 

	 //WebElement	tsrtc_HomePage_HeaderLink_Element=tsrtc_HomePage_headerBlockes_links.get(arrayIndex);//click();



	// tsrtc_HomePage_HeaderLink_Element.click();

	 

	 String tsrtc_HomePage_headerBlockes_linksName=tsrtc_HomePage_headerBlockes_links.get(arrayIndex).getText();

	 System.out.println(arrayIndex+" -"+tsrtc_HomePage_headerBlockes_linksName);

	 

	// tsrtc_HomePage_headerBlockes_links.get(arrayIndex).click();

	 

	 String tsrtc_HomePage_headerBlockes_linkNameText=tsrtc_HomePage_headerBlockes_links.get(arrayIndex).getText();//text of link

	System.out.println("The Text of TSRTC Home Page Header  Block link is - "+tsrtc_HomePage_headerBlockes_linkNameText);

	 

	 System.out.println();

	 

	String tsrtcHomePageTitle=driver.getTitle();//title of Home page

	 System.out.println("The title of Tsrtc Home page Header Link Current page is -"+tsrtcHomePageTitle);

	 

	 System.out.println();

	 

	String tsrtcHomePageUrlAddress=driver.getCurrentUrl();

	System.out.println("The Current url Address Of TSRTC Home Page Header Link is"+tsrtcHomePageUrlAddress);

	 

 }



		driver.wait();

		

	

		// <input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		// <input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">



		// anchor tag 'a' is only a common property of the links in the Current Webpage

	}

//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">

	//Home</a>

	//<a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>

	//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

	//<a<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a> class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

}




