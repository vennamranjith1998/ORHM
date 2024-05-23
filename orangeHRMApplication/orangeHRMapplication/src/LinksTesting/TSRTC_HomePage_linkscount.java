package LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_linkscount
{

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();


	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	driver.get(applicationUrlAddress);

	// <a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	// <a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
	// <a href="#" onclick="populateSearch('15881', 'Vijayawada', '5231', 'Hyderabad');">Vijayawada - Hyderabad</a>
	// <a href="/oprs-web/home/terms.do" title="Terms &amp; Conditions">Terms &amp; Conditions</a>

	// <input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
	// <input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

	// anchor tag 'a' is only a common property of the links in the Current Webpage

	By linksProperty=By.tagName("a");
	List<WebElement>tsrtcHomePageLinks=driver.findElements(linksProperty); // srini is called as ArrayList


	int tsrtcHomePageLinksCount=tsrtcHomePageLinks.size();

	System.out.println(" The number of links on the TSRTC Application Home Page are :- "+tsrtcHomePageLinksCount);

	//driver.quit();
	}
	}



