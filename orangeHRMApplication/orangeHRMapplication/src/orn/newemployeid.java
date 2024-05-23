package orn;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newemployeid 
{
	 

		WebDriver driver;

		String applicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		private CharSequence employeeLastName;

		public void applicationLaunch()

		{

			System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/broswerDriverFiles/chromedriver.exe");


			driver = new ChromeDriver();

			driver.get(applicationUrlAddress);

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		}
		public void OrangeHRMTitleValidation1()
		{
			String expectedTitle_OrangeHRMApplicationLoginPage = "OrangeHRM";
			System.out.println("the expected title of orangehrm application is:"+expectedTitle_OrangeHRMApplicationLoginPage);
			
			String actualTitle_OrangeHRMApplicationLoginPage = driver.getTitle();
			System.out.println("the actual title of orangehrm applicatgion is:"+actualTitle_OrangeHRMApplicationLoginPage);
			
			if(actualTitle_OrangeHRMApplicationLoginPage.equals(expectedTitle_OrangeHRMApplicationLoginPage))
			{
				System.out.println("Ttile matched-PASS");
			}
			else
			{
				System.out.println("Title Mismatched-FAIL");
			}
			
		}
		public void LoginPageUrlAddressValidation1()
		{
			String expected_OrangeHRMApplicationLoginInPageUrlAddress = "orangehrm-4.2.0.1";
			System.out.println("The expected Orangehrm Application Loginpage"+expected_OrangeHRMApplicationLoginInPageUrlAddress);
			
			String actual_OrangeHRMApplicationLoginInPageUrlAdress = driver.getCurrentUrl();
			System.out.println("The actual OrangehrmApplication Login page url address"+actual_OrangeHRMApplicationLoginInPageUrlAdress);
			
			if(actual_OrangeHRMApplicationLoginInPageUrlAdress.equals(expected_OrangeHRMApplicationLoginInPageUrlAddress))
			{
				System.out.println("Orangehrm login page url address is Matched-PASS");
			}
			else
			{
				System.out.println("Orangehrm login page url address is Mismatched-FAIL");
			}
			
		}
		public void LoginPageTextValidation()
		{
			String expected_OrangeHRM_LoginpageText  = "LOGIN Panel";
			System.out.println("The expected text of orangehrm application is"+expected_OrangeHRM_LoginpageText);
			By orangeHRM_LoginPageTextL=By.id("logInPanelHeading");
			WebElement orangeHRMLoginPagetext=driver.findElement(orangeHRM_LoginPageTextL);
			
			String actual_OrangeHRM_LoginpageText = orangeHRMLoginPagetext.getText();
			System.out.println("The actual text of orangehrm application is"+actual_OrangeHRM_LoginpageText);
			if(actual_OrangeHRM_LoginpageText.equals(expected_OrangeHRM_LoginpageText))
			{
				System.out.println("Login page Text if found -PASS");
			}
			else
			{
				System.out.println("Login page Text if not found-FAIL");
			}
	

		}

		public void OrangeHRMTitleValidation()

		{

			String expectedTitle_OrangeHRMApplicationLoginPage = "OrangeHRM";

			System.out.println("the expected title of orangehrm application is:"+expectedTitle_OrangeHRMApplicationLoginPage);

			

			String actualTitle_OrangeHRMApplicationLoginPage = driver.getTitle();

			System.out.println("the actual title of orangehrm applicatgion is:"+actualTitle_OrangeHRMApplicationLoginPage);

			

			if(actualTitle_OrangeHRMApplicationLoginPage.equals(expectedTitle_OrangeHRMApplicationLoginPage))

			{

				System.out.println("Ttile matched-PASS");

			}

			else

			{

				System.out.println("Title Mismatched-FAIL");

			}

			

		}

		public void LoginPageUrlAddressValidation()

		{

			String expected_OrangeHRMApplicationLoginInPageUrlAddress = "orangehrm-4.2.0.1";

			System.out.println("The expected Orangehrm Application Loginpage"+expected_OrangeHRMApplicationLoginInPageUrlAddress);

			

			String actual_OrangeHRMApplicationLoginInPageUrlAdress = driver.getCurrentUrl();

			System.out.println("The actual OrangehrmApplication Login page url address"+actual_OrangeHRMApplicationLoginInPageUrlAdress);

			

			if(actual_OrangeHRMApplicationLoginInPageUrlAdress.equals(expected_OrangeHRMApplicationLoginInPageUrlAddress))

			{

				System.out.println("Orangehrm login page url address is Matched-PASS");

			}

			else

			{

				System.out.println("Orangehrm login page url address is Mismatched-FAIL");

			}

			

		}

		public void LoginPageTextValidation1()

		{

			String expected_OrangeHRM_LoginpageText  = "LOGIN Panel";

			System.out.println("The expected text of orangehrm application is"+expected_OrangeHRM_LoginpageText);

			By orangeHRM_LoginPageTextL=By.id("logInPanelHeading");

			WebElement orangeHRMLoginPagetext=driver.findElement(orangeHRM_LoginPageTextL);

			

			String actual_OrangeHRM_LoginpageText = orangeHRMLoginPagetext.getText();

			System.out.println("The actual text of orangehrm application is"+actual_OrangeHRM_LoginpageText);

			if(actual_OrangeHRM_LoginpageText.equals(expected_OrangeHRM_LoginpageText))

			{

				System.out.println("Login page Text if found -PASS");

			}

			else

			{

				System.out.println("Login page Text if not found-FAIL");
				

			}
		}
			public void OrangehrmLoginFunction() {

			String UserNameTestData = "ranjithreddy";

			By userNamelocator=By.id("txtUsername");

			WebElement userName = driver.findElement(userNamelocator);

			userName.sendKeys (UserNameTestData );

			

			String passwordTestData="Ranjith@143";

			By passwordL=By.name("txtPassword");
			
			

			WebElement password=driver.findElement(passwordL);

			password.sendKeys(passwordTestData);

			By LoginButtonLocator=By.className("button");

			WebElement loginButton=driver.findElement(LoginButtonLocator);

			loginButton.click();
			}
		

		
		
		public void HomepageValidation()

		{

			By welcomeAdminL=By.linkText("Welcome Admin");

			WebElement welComeAdmin=driver.findElement(welcomeAdminL);

			

			String expectedHomepageText = "Admin";

			

			String actualHomepageWelComeAdminText = welComeAdmin.getText();

			if(actualHomepageWelComeAdminText.contains(expectedHomepageText))

			{

				System.out.println("Login Successfull-PASS");

			}

			else

			{

				System.out.println("Login failed-FAILED");

			}

		}


public void HomepageValidation1()
{
	By welcomeAdminL=By.linkText("Welcome Admin");
	WebElement welComeAdmin=driver.findElement(welcomeAdminL);
	
	String expectedHomepageText = "Admin";
	
	String actualHomepageWelComeAdminText = welComeAdmin.getText();
	if(actualHomepageWelComeAdminText.contains(expectedHomepageText))
	{
		System.out.println("Login Successfull-PASS");
	}
	else
	{
		System.out.println("Login failed-FAILED");
	}
}


		public void  PIMValidation()

		{

			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>

			By PIMlink=By.partialLinkText("PIM");

			WebElement PIM=driver.findElement(PIMlink);

			

			//Actions action = new Actions(driver);

			//action.moveToElement(PIM).build().perform();

			PIM.click();
			//System.out.println("print Su");

			

		}
  public void ClickonAddemployee() {
	  
	//  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	  //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
  
 By AddEmployeeproperty= By.id("menu_pim_addEmployee");
 WebElement AddEmployee= driver.findElement(AddEmployeeproperty);

	//Actions action = new Actions(driver);

	//action.moveToElement(AddEmployee).build().perform();
    AddEmployee.click();
 
  }		 
 public void EnteremployeeDetails() {
 //firstname
	 String employeefirstName="RANJITH";
	// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
			 
		By employeenameid= By.id("firstName");
		
	WebElement username=driver.findElement(employeenameid);
	username.sendKeys(employeefirstName);
	
	//middlename
		 String employeemiddleName="REDDY";
		// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
				 
			By employeenameid1= By.id("middleName");
		//	<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">	
		WebElement username1=driver.findElement(employeenameid1);
		username1.sendKeys(employeemiddleName);
		
		
		
		//lastname
		 String employeeLastName="VENNAM";
		// <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
				 
			By employeenameid11= By.id("lastName");
		//	<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		WebElement username11=driver.findElement(employeenameid11);

		username11.sendKeys(employeeLastName);
		
 }
 public void Enteremployeeid() {
	// <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	 //<input class="formInputText" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
	 String employeeIDnumber="143";
	 By employeenumber=By.id("employeeId");
     WebElement userID3=driver.findElement(employeenumber);
 }
 public void clickonsaveButton()

 {
	 By click=By.id("btnSave");
	 WebElement performClick=driver.findElement(click);
	 performClick.click();
	 
	 
	 String expected_employeeFirstName = "Ranjith";
		System.out.println("The expected first name of the employee is:"+expected_employeeFirstName);
		//<input value="RANJITH" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
		
		String actual_employeeFirstName = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		System.out.println("The actual name of the employee is:"+actual_employeeFirstName);
		if(actual_employeeFirstName.equals(expected_employeeFirstName))
		{
			System.out.println("The actual and expected names are matched-PASS--");
			
		}
		else
		{
			System.out.println("The actual and expected names are not matched-Fail");
		}
		
		String expected_employeeMiddleName = "REDDY";
		System.out.println("The expected first name of the employee is:"+expected_employeeMiddleName );
		
		//<input value="REDDY" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		String actual_employeeMiddleName = driver.findElement(By.id("personal_txtEmpMiddleName")).getAttribute("value");
		System.out.println("The actual name of the employee is:"+actual_employeeMiddleName);
		if(actual_employeeMiddleName.equals(expected_employeeMiddleName))
		{
			System.out.println("The actual and expected names are matched-PASS--");
			
		}
		else
		{
			System.out.println("The actual and expected names are not matched-Fail");
		}
		
		String expected_employeeLastName = "VENNAM";
		System.out.println("The expected first name of the employee is:"+expected_employeeLastName );
		
		//<input value="VENNAM" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		String actual_employeeLastName = driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
		System.out.println("The actual name of the employee is:"+actual_employeeLastName);
		if(actual_employeeLastName .equals(expected_employeeLastName))
		{
			System.out.println("The actual and expected names are matched-PASS--");
			
		}
		else
		{
			System.out.println("The actual and expected names are not matched-Fail");
		}
		
		String expected_employeeId = "143";
		System.out.println("The expected id of the employee is:"+expected_employeeId );
		//<input value="143" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		String actual_employeeId =driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		System.out.println("The actual name of the employee is:"+actual_employeeId );
		if(actual_employeeId .equals(expected_employeeId))
		{
			System.out.println("The actual and expected employee ID is matched-PASS--");
			
		}
		else
		{
			System.out.println("The actual and expected employee ID  is not matched-Fail");
		}
		
		
	}
	public void WelcomeAdminValidation()
	{
		By welcomeAdminL=By.linkText("Welcome Admin");
		WebElement welComeAdmin=driver.findElement(welcomeAdminL);
		
		String expectedHomepageText = "Admin";
		
		String actualHomepageWelComeAdminText = welComeAdmin.getText();
		if(actualHomepageWelComeAdminText.contains(expectedHomepageText))
		{
			System.out.println("Login Successfull-PASS");
		}
		else
		{
			System.out.println("Login failed-FAILED");
		}
		welComeAdmin.click();
		By logOutLocator=By.linkText("Logout");
		
		//Explicit wait

	 
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logOutLocator));
		WebElement logout=driver.findElement(logOutLocator);
		logout.click();
		driver.quit();
	}
		
		
		
		
		
		
	
  
  
  



		



		private By By(String string) {
	// TODO Auto-generated method stub
	return null;
}

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			 newemployeid  org =new   newemployeid ();

			org.applicationLaunch();

			
			org.OrangeHRMTitleValidation1();

			org.LoginPageUrlAddressValidation1();

			org.LoginPageTextValidation();
			org.OrangehrmLoginFunction();

			org.HomepageValidation();

			org.PIMValidation();
			org.ClickonAddemployee();
            org.EnteremployeeDetails();		
             org.Enteremployeeid();
             org.clickonsaveButton();
             org.WelcomeAdminValidation();


		}
	}



	




