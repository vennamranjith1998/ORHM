package com.OrangeHrmValidationExternalFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeOrangeHrm 
{
	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub


		//1 Application Launch
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");


		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);


		//Reading DataFrom ExcelFile For LoginPage Title And LoginPage text Validation

		FileInputStream orangeHrmLoginTestDatafile=new FileInputStream("./src/excelfile/AddEmployee excel.xlsx");
		XSSFWorkbook oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);
		XSSFSheet  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("Sheet1");

		int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();



		Row Row=orangeHrmLoginTestDataSheet.getRow(1);
		    Cell rowOfcell=Row.getCell(0);
		    String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();
		 
		   
		   
		    System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);
		   
		   //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);
		   
		   
		   //Writing Actual Login Panel test To Excel file
		   By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");//Identifying  LoginPanel
		WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);
		String OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

		System.out.println(" Actual Orangehrm Login Page text is - "+OrangeHRMApplicationLogInPageLogInPanelText);

		//Row  orangeHrmLoginTestData_RowActual=orangeHrmLoginTestDataSheet.createRow(arrayIndex);//Created row
		Row=orangeHrmLoginTestDataSheet.getRow(1);
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
		Row=orangeHrmLoginTestDataSheet.getRow(1);
		Cell orangeHrmLoginPageTitle=Row.getCell(4);


		String expected_OrangeHrmLoginPageTitle=orangeHrmLoginPageTitle.getStringCellValue();
		//Row=orangeHrmLoginTestDataSheet.getRow(1);
		//orangeHrmLoginPageTitle=Row.createCell(4);
		//orangeHrmLoginPageTitle.setCellValue(expected_OrangeHrmLoginPageTitle);
		System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);

		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);
		   String orangeHrmLoginPagetitle=driver.getTitle();
		Cell actual_OrangeHrmLoginPageTitle=Row.createCell(5);
		actual_OrangeHrmLoginPageTitle.setCellValue(orangeHrmLoginPagetitle);
		System.out.println(" Actual OrangeHrm Login Page title is -"+orangeHrmLoginPagetitle);



		if(orangeHrmLoginPagetitle.equals(expected_OrangeHrmLoginPageTitle))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		Cell result_OfLoginPageTitle=Row.createCell(6);
		result_OfLoginPageTitle.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		Cell result_OfLoginPageTitle=Row.createCell(6);
		result_OfLoginPageTitle.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
		}

		//url Address
		String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

		String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

		if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress)){
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		}else{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}

		System.out.println();



		//Validation of LoginFunction With UserName And password

		//Taking user Name
		//Row=orangeHrmLoginTestDataSheet.getRow(1);
		Row=orangeHrmLoginTestDataSheet.getRow(1);
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
		Row=orangeHrmLoginTestDataSheet.getRow(1);
		Cell welcomeAdmin_HomePage=Row.getCell(9);
		//String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();
		String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();


		By welComeAdminProperty=By.partialLinkText("Welcome");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		String actual_HomePageText=welComeAdmin.getText();
		System.out.println("Actual OrangeHrm Home Page Text - "+actual_HomePageText);

		Row=orangeHrmLoginTestDataSheet.getRow(1);
		Cell actual_HomePageWelcomeText=Row.createCell(10);
		actual_HomePageWelcomeText.setCellValue(actual_HomePageText);


		System.out.println("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);


		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);
		if(actual_HomePageText.contains(expected_WelecomeAdmin_Text)){
		System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page - PASS ");
		Cell result_OfHomePageTextValidation=Row.createCell(11);
		result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");

		}else{
		System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - FAIL ");
		Cell result_OfHomePageTextValidation=Row.createCell(11);
		result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}





		//Click operation on pin
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule"
		//class="firstLevelMenu"><b>PIM</b></a>
		By pinLinkProperties=By.partialLinkText("PIM");
		   WebElement pinLink=driver.findElement(pinLinkProperties);
		pinLink.click();


		//Click Operation on add employe
		for(int addAgentArrayIndex=1;addAgentArrayIndex<=3;addAgentArrayIndex++) {

		   By addEmployeLinkProperties =By.id("menu_pim_addEmployee");
		   WebElement addEmployeLink=driver.findElement(addEmployeLinkProperties);
		   addEmployeLink.click();
		   
		   //verification of Add Empolye Page With Full Name text
		   
		   
		   Row=orangeHrmLoginTestDataSheet.getRow(1);
		Cell orangeHrmAddEmployeText=Row.getCell(12);
		   String expected_OrangeHrmAddEmployeText=orangeHrmAddEmployeText.getStringCellValue();
		System.out.println(" Expected text of Add Employe page is - "+expected_OrangeHrmAddEmployeText);

		   
		   //<label class="hasTopFieldHelp">Full Name</label>
		   
		   By addEmployeTextProperties =By.className("hasTopFieldHelp");
		   WebElement addEmployeText=driver.findElement(addEmployeTextProperties);
		  String  actual_OrangeHrmAddEmployeText=addEmployeText.getText();
		 
		  System.out.println(" Actual text of Add Employe page is - "+actual_OrangeHrmAddEmployeText);
		 
		 
		    Row=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);
		Cell actual_AddEmployePageText=Row.createCell(13);
		actual_AddEmployePageText.setCellValue(actual_OrangeHrmAddEmployeText);

		//validation of text

		if(actual_OrangeHrmAddEmployeText.equals(expected_OrangeHrmAddEmployeText)) {
		   
		    System.out.println(" Successfully Navigated to the OrangeHRM Application ADD Employe Page -TEXT  Found - PASS ");
		    Cell result_OfAddEmployText=Row.createCell(14);
		    result_OfAddEmployText.setCellValue("Successfully Navigated to the OrangeHRM Application ADD Employe Page -TEXT  Found - PASS ");
		   

		    }else {
		    System.out.println(" Failed to Navigated to the OrangeHRM Application ADD Employe Page -TEXT Not Found -Fail ");
		Cell result_OfAddEmployeText=Row.createCell(14);
		result_OfAddEmployeText.setCellValue("Failed To  Navigate to the OrangeHRM Application ADD Employe Page - TEXT Not Found - Fail ");
		   
		}
		 

		   
		   
		   //Taking First Name Meddle Name And last Name from external file All Expected values
		   Row=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);//first Name
		Cell orangeHrmAddEmployeFirstName=Row.getCell(15);
		   String expected_OrangeHrmAddEmployeFirstName=orangeHrmAddEmployeFirstName.getStringCellValue();
		// System.out.println('' Expected First Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeFirstName);

		//Meddle Name
		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);//meddle Name
		Cell orangeHrmAddEmployeMeddleName=Row.getCell(16);
		   String expected_OrangeHrmAddEmployeMeddleName=orangeHrmAddEmployeMeddleName.getStringCellValue();
		//System.out.println(" Expected Meddle Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeMeddleName);

		//Last name
		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);//last Name
		Cell orangeHrmAddEmployeLastName=Row.getCell(17);
		   String expected_OrangeHrmAddEmployeLastName=orangeHrmAddEmployeLastName.getStringCellValue();
		// System.out.println(" Expected Last Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeLastName);


		//for(int addAgentArrayIndex=1;addAgentArrayIndex<=3;addAgentArrayIndex++) {
		///////////////*<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">*/first name
		//* <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">*/medial name
		  //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName"> last name
		By first_NameProperty=By.id("firstName");
		WebElement first_Name=driver.findElement(first_NameProperty);
		   first_Name.sendKeys(expected_OrangeHrmAddEmployeFirstName);
		   System.out.println("Expected orangeHRM Add Employe Page Employe First name - "+expected_OrangeHrmAddEmployeFirstName);
		 // String expected_FirstName="Vyshnavi";

		//medial name
		By meddle_NameProperty=By.id("middleName");
		WebElement meddle_Name=driver.findElement(meddle_NameProperty);
		meddle_Name.sendKeys(expected_OrangeHrmAddEmployeMeddleName);

		System.out.println("Expected orangeHRM Add Employe Page Employe Meddle name - "+expected_OrangeHrmAddEmployeMeddleName);


		//lastName

		By last_NameProperty=By.id("lastName");
		WebElement last_Name=driver.findElement(last_NameProperty);
		last_Name.sendKeys(expected_OrangeHrmAddEmployeLastName);

		System.out.println("Expected OrangeHrm Add Employe Page Employe Last name - "+expected_OrangeHrmAddEmployeLastName);
		 


		//<input class="formInputText valid" maxlength="10"
		//type="text" name="employeeId" value="0002" id="employeeId">employeId

		By employeIdProperty=By.id("employeeId");
		WebElement employeId=driver.findElement(employeIdProperty);
		  String expected_EmployeId=employeId.getAttribute("value");
		 
		  System.out.println("Expected OrangeHrm Add Employe Page Employe  id - "+expected_EmployeId);
		 
		   Row=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);//employe id
		   Cell expected_OrangHrmAEmployeId=Row.createCell(18);
		   expected_OrangHrmAEmployeId.setCellValue(expected_EmployeId);

		  //Saving The employe Details in Add Employe page
		 
		   By saveButtonProperty=By.id("btnSave");
		WebElement savebutton=driver.findElement(saveButtonProperty);
		savebutton.click();

		//Verification of personal details page by full name
		//expected
		 Row=orangeHrmLoginTestDataSheet.getRow(1);//employe id
		 Cell PersonalDetailsPageText=Row.getCell(19);
		String  expected_PersonalDetailsPageText =PersonalDetailsPageText.getStringCellValue();
		System.out.println("Expected Personal details page text is - "+expected_PersonalDetailsPageText);
		// Thread.sleep(5000);
		//actual
		//<label for="Full_Name" class="hasTopFieldHelp">Full Name</label>

		By personalDetails_PageTextProperty=By.className("hasTopFieldHelp");
		 WebElement  personalDetails_PageText=driver.findElement(personalDetails_PageTextProperty);
		 String actual_PersonalDetailsPageText= personalDetails_PageText.getText();
		// Thread.sleep(5000);
		 

		XSSFRow Row1=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);
		Cell Personal_DetailsPageText=Row1.createCell(20);
		Personal_DetailsPageText.setCellValue(expected_PersonalDetailsPageText);
		System.out.println("Actual Personal details page Text is - "+actual_PersonalDetailsPageText);

		Thread.sleep(5000);



		if(actual_PersonalDetailsPageText.equals(expected_PersonalDetailsPageText)) {
		System.out.println("The Actual personal details page Text is matched with Expected personal details page Text- PASS");
		Cell result_EmployeeFirstName=Row1.createCell(21);
		result_EmployeeFirstName.setCellValue("The Actual personal details page Text is matched with Expected personal details page Text- PASS");
		}else {
		System.out.println("The Actual personal details page Text is Not matched with Expected personal details page Text- FAIL");
		Cell result_EmployeeFirstName=Row1.createCell(21);
		result_EmployeeFirstName.setCellValue("The Actual personal details page Text is Not matched with Expected personal details page Text- FAIL");

		}

		//Actual employ details Getting From Personal details

		//<input value="Vyshnavi" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name"
		//id="personal_txtEmpFirstName" disabled="disabled">----------------firstName

		By firstNameValueProperty=By.id("personal_txtEmpFirstName");
		WebElement firstNameValue=driver.findElement(firstNameValueProperty);
		String actual_firstNameValue=firstNameValue.getAttribute("value");
		//System.out.println(actual_firstNameValue);
		Row1=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);
		Cell Frist_NameOfEmploye=Row1.createCell(22);
		Frist_NameOfEmploye.setCellValue(actual_firstNameValue);
		System.out.println("Actual OrangeHrm Add Employe First name is - "+actual_firstNameValue);




		//<input value="Reddy" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name"
		//id="personal_txtEmpMiddleName" disabled="disabled"> -----------meedlename

		By meddleNameValueProperty=By.id("personal_txtEmpMiddleName");
		WebElement meddelNameValue=driver.findElement(meddleNameValueProperty);
		String  actual_MeddleNameValue=meddelNameValue.getAttribute("value");
		System.out.println("Actua OrangeHrm Add Employe page employe Meddle name is"+actual_MeddleNameValue);


		Cell meddle_NameOfEmploye=Row1.createCell(24);//
		meddle_NameOfEmploye.setCellValue(actual_MeddleNameValue);


		   //<input value="Thokala" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name"
		//id="personal_txtEmpLastName" disabled="disabled"> ---------------last Name

		By lastNameValueProperty=By.id("personal_txtEmpLastName");
		WebElement lastNameValue=driver.findElement(lastNameValueProperty);
		 String  actual_LastNameValue=lastNameValue.getAttribute("value");
		   
		   
		   Cell last_NameOfEmploye=Row1.createCell(26);//
		last_NameOfEmploye.setCellValue(actual_LastNameValue);
		   System.out.println("Actua OrangeHrm Add Employe page employe last name is - "+actual_LastNameValue);

		//<input value="0002" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable"
		//id="personal_txtEmployeeId" disabled="disabled">------------------employeId
		   Thread.sleep(5000);

		By actual_EmployeIdProperty=By.id("personal_txtEmployeeId");
		WebElement actual_EmployeId=driver.findElement(actual_EmployeIdProperty);
		actual_EmployeId.getAttribute("value");
		   System.out.println("Actual OrangrHrm Add Employe page Employe Id is - "+actual_EmployeId.getAttribute("value"));
		 
		 Cell employe_idOfEmploye=Row1.createCell(28);//
		 employe_idOfEmploye.setCellValue(actual_EmployeId.getAttribute("value"));
		 
		 
		 
		 //Validation of Add employe Details By Actual And Expected
		 
		 
		 if(actual_firstNameValue.equals(expected_OrangeHrmAddEmployeFirstName)) {
		System.out.println("The Actual FirstName is matched with Expected FirstName- PASS");
		Cell result_EmployeeFirstName=Row1.createCell(23);
		result_EmployeeFirstName.setCellValue("The Actual FirstName is matched with Expected FirstName- PASS");
		}else {
		System.out.println("The Actual FirstName is Not  matched with Expected FirstName- FAIL");
		Cell result_EmployeeFirstName=Row1.createCell(23);
		result_EmployeeFirstName.setCellValue("The Actual FirstName is Not  matched with Expected FirstName- FAIL");

		}

		//validation of MeddleName

		if(actual_MeddleNameValue.equals(expected_OrangeHrmAddEmployeMeddleName)) {
		System.out.println("The Actual MeddleName is matched with Expected MeddleNameame - PASS");
		Cell result_EmployeeMeddleName=Row1.createCell(25);
		result_EmployeeMeddleName.setCellValue("The Actual MeddleName is matched with Expected MeddleNameame - PASS");
		}else {
		System.out.println("The Actual MeddleName isNot  matched with Expected MeddleName - FAIL");
		Cell result_EmployeeMeddleName=Row1.createCell(25);
		result_EmployeeMeddleName.setCellValue("The Actual MeddleName is Not matched with Expected MeddleNameame - FAIL");


		}

		//Validation of LastName

		if(actual_LastNameValue.equals(expected_OrangeHrmAddEmployeLastName)) {
		System.out.println("The Actual LastName is matched with Expected LastName - PASS");
		Cell result_EmployeeLastName=Row1.createCell(27);
		result_EmployeeLastName.setCellValue("The Actual LastName is matched with Expected LastName - PASS");
		}else {
		System.out.println("The Actual LastName isNot  matched with Expected LastName - FAIL");
		Cell result_EmployeeLastName=Row1.createCell(27);
		result_EmployeeLastName.setCellValue("The Actual LastName is Not matched with Expected LastName - FAIL");

		}

		//validation of  EmployeId

		if(actual_EmployeId.getAttribute("value").equals(expected_EmployeId)) {
		System.out.println("The Actual EmployeId is matched with Expected EmployeId - PASS");
		Cell result_EmployeeId=Row1.createCell(29);
		result_EmployeeId.setCellValue("The Actual EmployeId is matched with Expected EmployeId - PASS");
		}else {
		System.out.println("The Actual EmployeId is Not  matched with Expected EmployeId - FAIL");
		Cell result_EmployeeId=Row1.createCell(29);
		result_EmployeeId.setCellValue("The Actual EmployeId is Not  matched with Expected EmployeId - FAIL");

		}

		 
		System.out.println();
		}
		By welcomeAdminProperty=By.className("panelTrigger");
		  WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
		   welcomeAdmin.click();
		   
		   //performing click operation on logout
		   
		    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		Thread.sleep(5000);
		    By logOutProperty=By.linkText("Logout");
		WebElement logOut= driver.findElement(logOutProperty);
		logOut.click();



		  try {


		//If Not Navigated To Home Page
		Row=orangeHrmLoginTestDataSheet.getRow(1);
		rowOfcell=Row.getCell(1);
		  String  expected_OrangeHrmLoginPanelTextInvalid=rowOfcell.getStringCellValue();
		 




		   
		   
		   
		   //identifying  Invalid Credentials
		   
		    //<span id="spanMessage">Invalid credentials</span>
		By orangeHrmLoginPageTextProperty=By.id("spanMessage");
		WebElement  orangeHrmLoginPageText=driver.findElement(orangeHrmLoginPageTextProperty);
		   String actual_orangehrmLoginPage=orangeHrmLoginPageText.getText();
		   
		   System.out.println(" Actual Orangehrm Login Page text is - "+actual_orangehrmLoginPage);
		   
		  // Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);
		if(expected_OrangeHrmLoginPanelTextInvalid.equals(actual_orangehrmLoginPage)) {
		   
		 System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - TEXT Not Found - FAIL ");
		 Cell result_OfHomePageTextValidation=Row.createCell(11);
		 result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application Home Page -TEXT Not Found - FAIL ");
		   

		 }else {
		    System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page -TEXT  Found - PASS ");
		Cell result_OfHomePageTextValidation=Row.createCell(11);
		result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");
		   
		    }
		}
		    catch (Exception e) {
		// TODO: handle exception
		}
		 
		  //Login Page validation with login Panel text
		 
		//Reading Data From Excel Sheet for login Panel Validation
		   // Row Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);
		   Row=orangeHrmLoginTestDataSheet.getRow(1);
		     rowOfcell=Row.getCell(30);
		     expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();
		 
		   
		    System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);
		   
		   //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);
		   
		   
		   //Writing Actual Login Panel test To Excel file
		   orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");//Identifying  LoginPanel
		orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);
		String   actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

		System.out.println(" Actual Orangehrm Login Page text is - "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

		//Row  orangeHrmLoginTestData_RowActual=orangeHrmLoginTestDataSheet.createRow(arrayIndex);//Created row
		   Row=orangeHrmLoginTestDataSheet.getRow(1);
		actual_OrangeHrmLoginPageTextActualCell=Row.createCell(31);//create cell
		  actual_OrangeHrmLoginPageTextActualCell.setCellValue(actual_OrangeHRMApplicationLogInPageLogInPanelText);

		//validation of LoginPanel text
		  Row=orangeHrmLoginTestDataSheet.getRow(1);
		if(OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHrmLoginPanelText))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
		Cell result_OfLoginPageText=Row.createCell(32);
		result_OfLoginPageText.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");

		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
		Cell result_OfLoginPageText=Row.createCell(32);
		result_OfLoginPageText.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");


		}
		   
		//System.out.println();*/

		FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("./src/excelfile/AddEmployeeresult excel.xlsx");
		oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);


		  driver.close();

		}
		}


