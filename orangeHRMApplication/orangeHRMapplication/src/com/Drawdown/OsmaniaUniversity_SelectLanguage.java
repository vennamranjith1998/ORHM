package com.Drawdown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversity_SelectLanguage extends  Basetest
{
	//WebDriver driver;
	
   public void dropDownTesting() throws IOException, InterruptedException 
   {
		//select Language Drop Down Property
	   //<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000; padding:3px"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
	
   By selectLanguagesProperty=By.id("gtranslate_selector");
   WebElement selectLanguagesDropDown =driver.findElement(selectLanguagesProperty);
   //finding the number of Optional values in the DropDown
  // <option value="en|hi">Hindi</option>
  // <option value="en|fr">French</option>
 //  <option value="en|de">German</option>
 //  <option value="en|es">Spanish</option>
   //<option value="en|el">Greek</option>
  // <option value="en|te">Telugu</option>
   
   
   By languageProperty=By.tagName("option");
   List<WebElement>selectLanguages=selectLanguagesDropDown.findElements(languageProperty);

int selectLanguagesCount=selectLanguages.size();
System.out.println(" The Number of Languages in the Select Language DropDow are :- "+selectLanguagesCount);

// getting the Names of the DropDown

for(int arrayIndex=0;arrayIndex<selectLanguagesCount;arrayIndex++)
{
String language=selectLanguages.get(arrayIndex).getText();
System.out.println(language);




// * Selecting an Optional Value from the DropDown

Select languageSelection = new Select(selectLanguagesDropDown);
languageSelection.selectByIndex(arrayIndex);

Thread.sleep(5000);
File selectlanguageScreenShoot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(selectlanguageScreenShoot, new File("./OrangeHrm/ScreenShort"+language+".png"));
}
}


   
   public static void main(String[] args)  {

	    OsmaniaUniversity_SelectLanguage languages = new OsmaniaUniversity_SelectLanguage();
	       languages.applicationLauch();
	     
			try {
				languages.dropDownTesting();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	//languages.applicationClose();
	}

	}