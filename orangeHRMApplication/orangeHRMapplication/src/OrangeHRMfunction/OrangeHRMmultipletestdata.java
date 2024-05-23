package OrangeHRMfunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.log;

public class OrangeHRMmultipletestdata {


	public static void main(String[] args) throws IOException  
	{
		


			//1 Application Launch
			WebDriver driver;
			String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe");


			driver = new ChromeDriver();

			driver.get(applicationUrlAddress);


			//Reading DataFrom ExcelFile For LoginPage Title And LoginPage text Validation

			FileInputStream orangeHrmLoginTestDatafile=new FileInputStream("C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\src\\excelfile\\OrangeHRM_LogInTestDataFile.xlsx");
			XSSFWorkbook oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);
			XSSFSheet  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("LogInTestData");

			int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();
			for(int arrayIndex=1;arrayIndex<rowcount;arrayIndex++) {

			//Reading Data From Excel Sheet for login Panel Validation
			    Row Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);
			    Cell rowOfcell=Row.getCell(0);
			    String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();
			   
			   log.info(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);
			    //;System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);
			   
			   //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);
			   
			   
			   //Writing Actual Login Panel test To Excel file
			   By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");//Identifying  LoginPanel
			WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);
			String OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();
            log.info(" Actual Orangehrm Login Page text is - \"+OrangeHRMApplicationLogInPageLogInPanelText");
			//System.out.println(" Actual Orangehrm Login Page text is - "+OrangeHRMApplicationLogInPageLogInPanelText);

			//Row  orangeHrmLoginTestData_RowActual=orangeHrmLoginTestDataSheet.createRow(arrayIndex);//Created row
			Cell actual_OrangeHrmLoginPageTextActualCell=Row.createCell(2);//create cell
			  actual_OrangeHrmLoginPageTextActualCell.setCellValue(OrangeHRMApplicationLogInPageLogInPanelText);

			//validation of LoginPanel text

			if(OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHrmLoginPanelText))
			{
			System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
			Cell result_OfLoginPageText=Row.createCell(3);
			result_OfLoginPageText.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");

			}
			else
			{
			System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
			Cell result_OfLoginPageText=Row.createCell(3);
			result_OfLoginPageText.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");

			}


			//Validation Title of OrangeHrm Home Page
			Cell orangeHrmLoginPageTitle=Row.getCell(4);
			String expected_OrangeHrmLoginPageTitle=orangeHrmLoginPageTitle.getStringCellValue();
			//System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);

             log.info(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);
			   String orangeHrmLoginPagetitle=driver.getTitle();
			Cell actual_OrangeHrmLoginPageTitle=Row.createCell(5);
			actual_OrangeHrmLoginPageTitle.setCellValue(orangeHrmLoginPagetitle);
			log.info(" Actual OrangeHrm Login Page title is -"+orangeHrmLoginPagetitle);
		
			//System.out.println(" Actual OrangeHrm Login Page title is -"+orangeHrmLoginPagetitle);



			if(orangeHrmLoginPagetitle.equals(expected_OrangeHrmLoginPageTitle))
			{
				
				
				log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
				
			//System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
			Cell result_OfLoginPageTitle=Row.createCell(6);
			result_OfLoginPageTitle.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS");
			}
			else
			{
				
			log.info(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");	
			
			
			//System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
			Cell result_OfLoginPageTitle=Row.createCell(6);
			result_OfLoginPageTitle.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
			}

			//url Address
			String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
			log.info(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);
			//System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

			String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
			log.info(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);
			//System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

			if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress)){
			log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
				
				//System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
			
			}else{
			log.info(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
				
				//System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
			}

			
			
			System.out.println();
			



			//Validation of LoginFunction With UserName And password

			//Taking user Name
			Cell orangeHrmLogin_UserName=Row.getCell(7);
			String userNameTestData=orangeHrmLogin_UserName.getStringCellValue();


			Cell orangeHrmLogin_Password=Row.getCell(8);
			String passwordTestData=orangeHrmLogin_Password.getStringCellValue();




			   By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
			WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
			userName.sendKeys(userNameTestData);// Operation on the Identified WebElement

			// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

			By passwordProperty=By.name("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(passwordTestData);

			// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

			By logInButtonProperty=By.className("button");
			WebElement logInButton=driver.findElement(logInButtonProperty);
			logInButton.click();

			//System.out.println();

			try {

			By welComeAdminProperty=By.partialLinkText("Welcome");

			WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
			String actual_HomePageText=welComeAdmin.getText();
			
			log.info("Actual OrangeHrm Home Page Text - "+actual_HomePageText);
			//System.out.println("Actual OrangeHrm Home Page Text - "+actual_HomePageText);

			Cell actual_HomePageWelcomeText=Row.createCell(10);
			actual_HomePageWelcomeText.setCellValue(actual_HomePageText);



			Cell welcomeAdmin_HomePage=Row.getCell(9);
			String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();
			log.info("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);
			//System.out.println("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);

			if(actual_HomePageText.contains(expected_WelecomeAdmin_Text)){
				
				log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		//	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
			Cell result_OfHomePageTextValidation=Row.createCell(11);
			result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");

			}else{
				log.info(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
			//System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
			Cell result_OfHomePageTextValidation=Row.createCell(9);
			result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
			}

			welComeAdmin.click();


			//Logout Function
			Thread.sleep(5000);
			By logOutProperty=By.linkText("Logout");
			WebElement logOut= driver.findElement(logOutProperty);
			logOut.click();

			}catch (Exception e) {
			// TODO: handle exception
			}
			try {


			//If Not Navigated To Home Page
			rowOfcell=Row.getCell(1);
			  String  expected_OrangeHrmLoginPanelTextInvalid=rowOfcell.getStringCellValue();
			   log.info(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelTextInvalid);
			  //  System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelTextInvalid);
			   
			   
			   //identifying  Invalid Credentials
			   
			    //<span id="spanMessage">Invalid credentials</span>
			By orangeHrmLoginPageTextProperty=By.id("spanMessage");
			WebElement  orangeHrmLoginPageText=driver.findElement(orangeHrmLoginPageTextProperty);
			   String actual_orangehrmLoginPage=orangeHrmLoginPageText.getText();
			   log.info(" Actual Orangehrm Login Page text is - "+actual_orangehrmLoginPage);
			  // System.out.println(" Actual Orangehrm Login Page text is - "+actual_orangehrmLoginPage);

			if(expected_OrangeHrmLoginPanelTextInvalid.equals(actual_orangehrmLoginPage)) {
				log.info(" Failed to Navigate to the OrangeHRM Application Home Page - TEXT Not Found - FAIL ");
			   
			// System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - TEXT Not Found - FAIL ");
			 Cell result_OfHomePageTextValidation=Row.createCell(11);
			 result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application Home Page -TEXT Not Found - FAIL ");
			   
			 //Taking Screenshot of invalidates Login Page
			 File orangehrmApplicationInvalidCredianial_ScreenShort =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(orangehrmApplicationInvalidCredianial_ScreenShort,new File("./OrangeHrmInvalidCrediantialsScreenshorts/"+actual_orangehrmLoginPage+" "+arrayIndex+".png"));
			 }else {
				 
				 log.info(" Successfully Navigated to the OrangeHRM Application Home Page -TEXT  Found - PASS ");
			  //  System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page -TEXT  Found - PASS ");
			Cell result_OfHomePageTextValidation=Row.createCell(11);
			result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");
			   
			    }
			}
			    catch (Exception e) {
			// TODO: handle exception
			}
			   
			//System.out.println();

			FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\src\\excelfile\\OrangeHRM_LogInTestResultFile.xlsx");
			oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);

		
	}
			driver.close();
	}
}
		