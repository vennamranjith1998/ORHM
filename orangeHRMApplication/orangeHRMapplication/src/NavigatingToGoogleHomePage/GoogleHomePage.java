package NavigatingToGoogleHomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage {
	public static void main(String[] args) {
		
	 // Automating  a Broswer(chrome)
     // webdriver.chrome.driver
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe" );
	   ChromeDriver chromeBroswer =new ChromeDriver();
	    //Automating FireFox Browser
	   // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\geckodriver.exe");
	    //FirefoxDriver chromeBrowser=new FirefoxDriver();
	   
	   // navigation to Google Application Home Page
	   // chromeBroswer.get("http://google.com");
	   
	  // chromeBroswer.navigate().to("http://livetech.in");
	   
	   chromeBroswer.navigate().to("http://bing.com");
	   
		
		//chromeBroswer.navigate().to("http://filpkart.in");
	   
	  // chromeBroswer.close();
	   chromeBroswer.quit();		
		
		
	}

	
}
