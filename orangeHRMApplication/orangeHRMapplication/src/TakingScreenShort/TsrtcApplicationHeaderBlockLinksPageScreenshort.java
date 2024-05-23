package TakingScreenShort;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcApplicationHeaderBlockLinksPageScreenshort 
{
	 WebDriver driver;

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web";

		By tsrtcHomePageHeaderBlockProperty;

		By tsrtcHomePageHeaderBlockLinksProperties ;

		WebElement tsrtcHomePageHeaderBlock;

		

		List<WebElement> tsrtcHomePageHeaderBlockLinks;

		

		int	tsrtcHeaderBlockLinksCount;

		String tsrtcHomePageHeaderBlockLinksName;

			

			public void applicationLaunch() {

				System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");





				driver = new ChromeDriver();



				driver.get(applicationUrlAddress);

				driver.manage().window().maximize();

				

			}

			public void TsrtcHomePage_HeaderBlock() throws IOException {//Finding Header Block

				// class="menu-wrap" - property of header Block

				//<div class="menu">

				



				By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");

				WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

			//}

			//public void HederBlockLinksOfTsrtcHomePage() {//Finding header Block Links

				// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>

				// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

				//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>

				

				

				By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");

				// going the the Header Block and identifying the elements of the Header Block

				List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);



				int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();

				System.out.println(tsrtcHeaderBlockLinksCount);

			

		 //  }

		//	public void HederBlockLinksOfTsrtcHomePageNames() throws IOException {//Finding HeaderBlock Links Names And Its Screenhorts

			

		    //tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.getSize();

		   

				for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++)

				{

				String tsrtcHomePageHeaderBlockLinkName=tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();

				System.out.println(arrayIndex+" - "+tsrtcHomePageHeaderBlockLinkName);



				// Performing an Operation on the Header Block Links



				tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();



				// once click operation is done the webPage will be moved to the corresponding Next Page



				String actual_WebPageTitle=driver.getTitle();

				System.out.println(" The Title of the Navigated WebPage is:-  "+actual_WebPageTitle);



				String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();

				System.out.println(" The Current Url Address of the Navigated WebPage is:-  "+actual_WebPageCurrentUrlAddress);

			try {

			  File tsrtcHomePageHeaderLinksScreenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			  FileUtils.copyFile(tsrtcHomePageHeaderLinksScreenshort, new File("./ApplicationScreenshorts/TsrtcHomePageHeaderBlockLinksPages "+tsrtcHomePageHeaderBlockLinkName +".png"));

			}catch (IOException e) {

				//syso

				// TODO: handle exception

			}

					driver.navigate().back();



			

					tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");

					tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);



				// finding all the WelElements of the Header Block and storing back to the

				//   arrayList for another Time



				// Header Block ELement Common property is a- tag

					tsrtcHomePageHeaderBlockLinksProperties=By.tagName("a");

				// going the the Header Block and identifying the elements of the Header Block

					tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperties);



					System.out.println();
				}
					





				}



			  

		public void application()  
		{
			driver.close();
			

			  



		   }

			public static void main(String[] args) throws IOException {

				TsrtcApplicationHeaderBlockLinksPageScreenshort   screenshortsOfTSRTCHomePageHeaderBlocksLink=new TsrtcApplicationHeaderBlockLinksPageScreenshort();

				screenshortsOfTSRTCHomePageHeaderBlocksLink.applicationLaunch();

				screenshortsOfTSRTCHomePageHeaderBlocksLink.TsrtcHomePage_HeaderBlock();

				//screenshortsOfTSRTCHomePageHeaderBlocksLink.HederBlockLinksOfTsrtcHomePage();

				//screenshortsOfTSRTCHomePageHeaderBlocksLink.HederBlockLinksOfTsrtcHomePageNames();

				screenshortsOfTSRTCHomePageHeaderBlocksLink.application();

				

			}

			}

	





	//Software AmazonHomePage=new Software();


