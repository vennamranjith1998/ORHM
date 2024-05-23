package dbs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dbs_homepage
{
	
	
	WebDriver driver;
	String applicationUrlAddress="https://www.dbs.com/in/index/default.page#wm";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);


	}


	public void applicationClose()
	{
	driver.close();
	}

	public void dbs_HomePage_displayLinksNames()
	{

	By linksProperty=By.tagName("a");
	List<WebElement>homePageLinks=driver.findElements(linksProperty);

	System.out.println(" The number of links on the DBS Bank HomePage are:- "+homePageLinks.size());

	for(int arrayIndex=0;arrayIndex<homePageLinks.size();arrayIndex++)
	{
	if(homePageLinks.get(arrayIndex).isDisplayed())
	{
	String homePageLinkName=homePageLinks.get(arrayIndex).getText();
	System.out.println(homePageLinkName);
	}
	}

	}

  public static void main(String[] args)
	{

	  dbs_homepage homePage = new dbs_homepage();
	homePage.applicationLaunch();
	homePage.dbs_HomePage_displayLinksNames();
	homePage.applicationClose();

	}


	}