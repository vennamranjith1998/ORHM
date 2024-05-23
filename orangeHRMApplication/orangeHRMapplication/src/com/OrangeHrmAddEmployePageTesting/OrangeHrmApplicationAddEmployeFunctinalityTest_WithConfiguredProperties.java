package com.OrangeHrmAddEmployePageTesting;

public class OrangeHrmApplicationAddEmployeFunctinalityTest_WithConfiguredProperties_UsingTestNG extends BaseTestOfAddEmployePageUsingTastNG 
{


	FileInputStream orangeHrmLoginTestDatafile;

	XSSFWorkbook oragneHrmLoginTestDataWorkBook;

	XSSFSheet  orangeHrmLoginTestDataSheet;

	 Row Row;

	 Cell rowOfcell;

	 String OrangeHRMApplicationLogInPageLogInPanelText;

	

	 FileInputStream  orangeHrmApplicationPropertiesFile;

	 Properties  properties;

	// properties.load(orangeHrmApplicationPropertiesFile);

	

	 @Test(priority=1,description="Validation Of login pannel text Of Login Page")

	public void OrangeHrmApplicationValidation_LoginPanelText() throws IOException, InterruptedException {

		 

		//For excel Operations 

		 orangeHrmLoginTestDatafile=new FileInputStream("./src/com/OrangeHrmAddEmployePageTesting/AddEmployeeWith MultipleUsersTestData_UsingUserDefindMe.xlsx");

		 oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);

		  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("Sheet1");

		

		//int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();

		  //Accessing The Extarnal Properties File

		     orangeHrmApplicationPropertiesFile=new FileInputStream("./src/com/Config/orangeHrmApplication.Properties"); 

		     

		     Properties  properties =new Properties();//Creating object for the properties class

		   

		     properties.load(orangeHrmApplicationPropertiesFile);//creating an Object for properties class

		   

		   

		

			

		

		    Row Row=orangeHrmLoginTestDataSheet.getRow(1);

		     Cell rowOfcell=Row.getCell(0);

		     String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();

		   

		     

		     

		     System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);

		     

		     //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);

		    

		   

		   //Writing Actual Login Panel test To Excel file

		    By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id(properties.getProperty("logInPageLogInPanelProperty"));//Identifying  LoginPanel

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

	

		System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);

		

		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    String	orangeHrmLoginPagetitle=driver.getTitle();

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

		Thread.sleep(5000);

		

	}

		@Test(priority=2,description="Testing The OrangeHrm Application LoginFunctionality")

		public void OrangeHrmApplication_LoginFunctionTest() throws IOException {

        //Validation of LoginFunction With UserName And password

			

			//Taking user Name

			//Row=orangeHrmLoginTestDataSheet.getRow(1);

			Row=orangeHrmLoginTestDataSheet.getRow(1);

			Cell orangeHrmLogin_UserName=Row.getCell(7);

			String userNameTestData=orangeHrmLogin_UserName.getStringCellValue();

			

			

			Cell orangeHrmLogin_Password=Row.getCell(8);

			String passwordTestData=orangeHrmLogin_Password.getStringCellValue();

			

			

			

			 By	userNameProperty=By.id(properties.getProperty("logInPageUserNameProperty"));

			//logInPageUserNameProperty=txtUsername

		  //  By userNameProperty=By.id("txtUsername"); 

			WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage

			userName.sendKeys(userNameTestData);// Operation on the Identified WebElement



			// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

			

			By passwordProperty=By.id("txtPassword");

			WebElement password=driver.findElement(passwordProperty);

			password.sendKeys(passwordTestData);



			// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

			//logInPageLogInButtonProperty=button

			By logInButtonProperty=By.className(properties.getProperty("logInPageLogInButtonProperty"));



			WebElement logInButton=driver.findElement(logInButtonProperty);

			logInButton.click();

			

			



			

		}

		@Test(priority=4,description="Validation Og OrangeHrm HomePage using Welecome Admin text")

		

		public void  OrangeHrmValidation_HomePage() throws IOException {

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

				result_OfHomePageTextValidation.setCellValue(" Succusfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");

				

		}else{

				System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - FAIL ");

				Cell result_OfHomePageTextValidation=Row.createCell(11);

				result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

			}

			



		//}

		

		//FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("./src/com/OrangeHrmAddEmployePageTesting/AddEmployeeWith MultipleUsersTestresult_UsingUserDefindMe.xlsx");

		//oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);

		}

        @Test(priority=5,description="Testing the  functionality   of Add Employe page")

		public void EmployeDetailsValidation_AddEmployeeFunctionalityTest() throws InterruptedException, IOException{

			

			//Click operation on pin

			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule"

			//class="firstLevelMenu"><b>PIM</b></a>

			By pinLinkProperties=By.partialLinkText("PIM");

		    WebElement pinLink=driver.findElement(pinLinkProperties);

			pinLink.click();

			

			

			//Click Operation on add employe

			 for(int addAgentArrayIndex=1;addAgentArrayIndex<=3;addAgentArrayIndex++) {

			

		    By addEmployeLinkProperties =By.id("menu_pim_addEmployee");

		    WebElement	addEmployeLink=driver.findElement(addEmployeLinkProperties);

		    addEmployeLink.click();

		    

		    //verification of Add Empolye Page With AddEmploye text

		    

		    

		    Row=orangeHrmLoginTestDataSheet.getRow(1);

			Cell orangeHrmAddEmployeText=Row.getCell(12);

		    String	expected_OrangeHrmAddEmployeText=orangeHrmAddEmployeText.getStringCellValue();

			 System.out.println(" Expected text of Add Employe page is - "+expected_OrangeHrmAddEmployeText);



		    

		    //<h1>Add Employee</h1>

		    

		    By addEmployeTextProperties =By.linkText("Add Employee");

		    WebElement	addEmployeText=driver.findElement(addEmployeTextProperties);

		   String  actual_OrangeHrmAddEmployeText=addEmployeText.getText();

		   

		   System.out.println(" Actual text of Add Employe page is - "+actual_OrangeHrmAddEmployeText);

		   Thread.sleep(5000);

		   

		   

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

			 result_OfAddEmployeText.setCellValue("Failed To  Navigate to the OrangeHRM Application ADD Employe Page - TEXT Noy Found - Fail ");

				    	 

			}

		   

		 

		    

		    

		    //Taking First Name Meddle Name And last Name from external file All Expected values

		    Row=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);//first Name

			Cell orangeHrmAddEmployeFirstName=Row.getCell(15);

		    String	expected_OrangeHrmAddEmployeFirstName=orangeHrmAddEmployeFirstName.getStringCellValue();

		//	System.out.println(" Expected First Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeFirstName);

			

			//Meddle Name

			//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);//meddle Name

			Cell orangeHrmAddEmployeMeddleName=Row.getCell(16);

		    String	expected_OrangeHrmAddEmployeMeddleName=orangeHrmAddEmployeMeddleName.getStringCellValue();

			//System.out.println(" Expected Meddle Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeMeddleName);

			

			//Last name

			//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);//last Name

			Cell orangeHrmAddEmployeLastName=Row.getCell(17);

		    String	expected_OrangeHrmAddEmployeLastName=orangeHrmAddEmployeLastName.getStringCellValue();

		//	System.out.println(" Expected Last Name of Employe Add Employe page is - "+expected_OrangeHrmAddEmployeLastName);

			

			

			//for(int addAgentArrayIndex=1;addAgentArrayIndex<=3;addAgentArrayIndex++) {

			///////////////*<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">*/first name

			//* <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">*/medial name

			   //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName"> last name

			By	first_NameProperty=By.id("firstName");

			WebElement first_Name=driver.findElement(first_NameProperty);

		    first_Name.sendKeys(expected_OrangeHrmAddEmployeFirstName);

		    System.out.println("Expected orangeHRM Add Employe Page Employe First name - "+expected_OrangeHrmAddEmployeFirstName);

		  // String expected_FirstName="Vyshnavi";



			//medial name

			By	meddle_NameProperty=By.id("middleName");

			WebElement meddle_Name=driver.findElement(meddle_NameProperty);

			meddle_Name.sendKeys(expected_OrangeHrmAddEmployeMeddleName);

			

			System.out.println("Expected orangeHRM Add Employe Page Employe Meddle name - "+expected_OrangeHrmAddEmployeMeddleName);

			

			

			//lastName

			

			By	last_NameProperty=By.id("lastName");

			WebElement last_Name=driver.findElement(last_NameProperty);

			last_Name.sendKeys(expected_OrangeHrmAddEmployeLastName);

			

			System.out.println("Expected OrangeHrm Add Employe Page Employe Last name - "+expected_OrangeHrmAddEmployeLastName);

			   

			

		

			//<input class="formInputText valid" maxlength="10"

			//type="text" name="employeeId" value="0002" id="employeeId">employeId

			

			By	employeIdProperty=By.id("employeeId");

			WebElement employeId=driver.findElement(employeIdProperty);

		   String expected_EmployeId=employeId.getAttribute("value");

		   

		   System.out.println("Expected OrangeHrm Add Employe Page Employe  id - "+expected_EmployeId);

		   

		    Row=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);//employe id

		    Cell expected_OrangHrmAEmployeId=Row.createCell(18);

		    expected_OrangHrmAEmployeId.setCellValue(expected_EmployeId);

		

		   //Savining The employe Details in Add Employe page

		   

		    By	saveButtonProperty=By.id("btnSave");

			WebElement savebutton=driver.findElement(saveButtonProperty);

			savebutton.click();

		

			//Verification of personal details page by Personal Details text

			//expected

			  Row=orangeHrmLoginTestDataSheet.getRow(1);//employe id

			  Cell PersonalDetailsPageText=Row.getCell(19);

			 String  expected_PersonalDetailsPageText =PersonalDetailsPageText.getStringCellValue();

			 System.out.println("Expected Personal details page text is - "+expected_PersonalDetailsPageText);

			// Thread.sleep(5000);

			 //actual 

			////<h1>Personal Details</h1>

			

		 By personalDetails_PageTextProperty=By.linkText("Personal Details");

		  WebElement  personalDetails_PageText=driver.findElement(personalDetails_PageTextProperty);

		  String actual_PersonalDetailsPageText= personalDetails_PageText.getText();

		 // Thread.sleep(5000);

		  

		

		Row Row1=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);

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

			

			By	firstNameValueProperty=By.id("personal_txtEmpFirstName");

			WebElement firstNameValue=driver.findElement(firstNameValueProperty);

			String actual_firstNameValue=firstNameValue.getAttribute("value");

			//System.out.println(actual_firstNameValue);

			 Row1=orangeHrmLoginTestDataSheet.getRow(addAgentArrayIndex);

			Cell Frist_NameOfEmploye=Row1.createCell(22);

			Frist_NameOfEmploye.setCellValue(actual_firstNameValue);

			System.out.println("Actual OrangeHrm Add Employe Firt name is - "+actual_firstNameValue);

			

			

			

			

			//<input value="Reddy" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name"

			//id="personal_txtEmpMiddleName" disabled="disabled"> -----------meedlename

			

			By	meddleNameValueProperty=By.id("personal_txtEmpMiddleName");

			WebElement meddelNameValue=driver.findElement(meddleNameValueProperty);

			String  actual_MeddleNameValue=meddelNameValue.getAttribute("value");

			System.out.println("Actua OrangeHrm Add Employe page employe Meddle name is"+actual_MeddleNameValue);

			

			

			Cell meddle_NameOfEmploye=Row1.createCell(24);//

			meddle_NameOfEmploye.setCellValue(actual_MeddleNameValue);

			

			

		    //<input value="Thokala" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name"

			//id="personal_txtEmpLastName" disabled="disabled"> ---------------last Name

			

			By	lastNameValueProperty=By.id("personal_txtEmpLastName");

			WebElement lastNameValue=driver.findElement(lastNameValueProperty);

		  String  actual_LastNameValue=lastNameValue.getAttribute("value");

		    

		    

		    Cell last_NameOfEmploye=Row1.createCell(26);//

			last_NameOfEmploye.setCellValue(actual_LastNameValue);

		    System.out.println("Actua OrangeHrm Add Employe page employe last name is - "+actual_LastNameValue);

			

			//<input value="0002" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" 

			//id="personal_txtEmployeeId" disabled="disabled">------------------employeId

		    Thread.sleep(5000);

			

			By	actual_EmployeIdProperty=By.id("personal_txtEmployeeId");

			WebElement actual_EmployeId=driver.findElement(actual_EmployeIdProperty);

			actual_EmployeId.getAttribute("value");

		    System.out.println("Actual OrangrHrm Add Employe page Employe Id is - "+actual_EmployeId.getAttribute("value"));

		  

		  Cell employe_idOfEmploye=Row1.createCell(28);//

		  employe_idOfEmploye.setCellValue(actual_EmployeId.getAttribute("value"));

		  

		  

		  

		  //Validation of Add employ Details By Actual And Expected

		  

		  

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

			 

		}

        @Test(priority=6,description="validation of OrangeHrm Home page LogOut functionality")

		public void OrangeHrmApplicationHomePageLogOut_FunctionalityTest() throws InterruptedException {

			 By welcomeAdminProperty=By.className("panelTrigger");

	 		   WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);

	 		    welcomeAdmin.click();

	 		    

	 		    //performing click operation on logout

	 		    

	 		     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	 		 Thread.sleep(5000); 

	 	     By logOutProperty=By.linkText("Logout");

	 		 WebElement logOut= driver.findElement(logOutProperty);

	 		 logOut.click();

		}

        @Test(priority=7,description="Validation of OrangeHrm Application login page By using login pannel text After complition of LogOut Operation On Home Page")

	 		 public void OrangeHrmApplicationLoginPageValidation_AfterLogoutOfHomePage() throws IOException {

	 			  //Login Page validation with login Panel text

	 			   

	 			 //Reading Data From Excel Sheet for login Panel Validation

	 			    // Row Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	 			    Row=orangeHrmLoginTestDataSheet.getRow(1);

	 			      rowOfcell=Row.getCell(30);

	 			    String  expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();

	 			   

	 			     

	 			     System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);

	 			     

	 			    //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);

	 			    

	 			    

	 			    //Writing Actual Login Panel test To Excel file

	 			 By   orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");//Identifying  LoginPanel

	 			WebElement	orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

	 			String   actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

	 				

	 				System.out.println(" Actual Orangehrm Login Page text is - "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

	 				

	 				//Row  orangeHrmLoginTestData_RowActual=orangeHrmLoginTestDataSheet.createRow(arrayIndex);//Created row

	 			    Row=orangeHrmLoginTestDataSheet.getRow(1);

	 				Cell actual_OrangeHrmLoginPageTextActualCell=Row.createCell(31);//create cell

	 			   	 actual_OrangeHrmLoginPageTextActualCell.setCellValue(actual_OrangeHRMApplicationLogInPageLogInPanelText);

	 				

	 				//validation of LoginPanel text

	 			   	Row=orangeHrmLoginTestDataSheet.getRow(1);

	 				if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHrmLoginPanelText))

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

	 				FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("./src/com/OrangeHrmAddEmployePageTesting/AddEmployeeWith MultipleUsersTestresult_UsingTestNg.xlsx");

					oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);

	 			     

	 			 

	 		 }

			 

				 



	}





package com.OrangeHrmAddEmployePageTesting;



import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

//import java.util.Properties;

import java.util.Properties;





import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



public class OrangeHrmApplicationAddEmployeFunctinalityTest_WithConfiguredProperties_UsingTestNG extends BaseTestOfAddEmployePageUsingTastNG {

	





	FileInputStream orangeHrmLoginTestDatafile;

	XSSFWorkbook oragneHrmLoginTestDataWorkBook;

	XSSFSheet  orangeHrmLoginTestDataSheet;

	 Row Row;

	 Cell rowOfcell;

	 String OrangeHRMApplicationLogInPageLogInPanelText;

	

	 FileInputStream  orangeHrmApplicationPropertiesFile;

	 Properties  properties;

	// properties.load(orangeHrmApplicationPropertiesFile);

	

	 @Test(priority=1,description="Validation Of login pannel text Of Login Page")

	public void OrangeHrmApplicationValidation_LoginPanelText() throws IOException, InterruptedException {

		 

		//For excel Operations 

		 orangeHrmLoginTestDatafile=new FileInputStream("./src/com/OrangeHrmAddEmployePageTesting/AddEmployeeWith MultipleUsersTestData_UsingUserDefindMe.xlsx");

		 oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);

		  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("Sheet1");

		

		//int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();

		  //Accessing The Extarnal Properties File

		     orangeHrmApplicationPropertiesFile=new FileInputStream("./src/com/Config/orangeHrmApplication.Properties"); 

		     

		     Properties  properties =new Properties();//Creating object for the properties class

		   

		     properties.load(orangeHrmApplicationPropertiesFile);//creating an Object for properties class

		   

		   

		

			

		

		    Row Row=orangeHrmLoginTestDataSheet.getRow(1);

		     Cell rowOfcell=Row.getCell(0);

		     String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();

		   

		     

		     

		     System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);

		     

		     //Cell Actual_OrangeHrmLoginPageText=orangeHrmLoginTestData_Row.createCell(2);

		    

		   

		   //Writing Actual Login Panel test To Excel file

		    By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id(properties.getProperty("logInPageLogInPanelProperty"));//Identifying  LoginPanel

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

	

		System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);

		

		//Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    String	orangeHrmLoginPagetitle=driver.getTitle();

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

		Thread.sleep(5000);

		

	}

		@Test(priority=2,description="Testing The OrangeHrm Application LoginFunctionality")

		public void OrangeHrmApplication_LoginFunctionTest() throws IOException {

        //Validation of LoginFunction With UserName And password

			

			//Taking user Name

			//Row=orangeHrmLoginTestDataSheet.getRow(1);

			Row=orangeHrmLoginTestDataSheet.getRow(1);

			Cell orangeHrmLogin_UserName=Row.getCell(7);

			String userNameTestData=orangeHrmLogin_UserName.getStringCellValue();

			

			

			Cell orangeHrmLogin_Password=Row.getCell(8);

			String passwordTestData=orangeHrmLogin_Password.getStringCellValue();

			

			

			

			 By	userNameProperty=By.id(properties.getProperty("logInPageUserNameProperty"));

			//logInPageUserNameProperty=txtUsername

		  //  By userNameProperty=By.id("txtUsername"); 

			WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage

			userName.sendKeys(userNameTestData);// Operation on the Identified WebElement



			// <input name="txtPassword" id="txtPassword"

}
