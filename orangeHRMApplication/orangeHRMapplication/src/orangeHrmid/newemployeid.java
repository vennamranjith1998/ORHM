package orangeHrmid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newemployeid

{
	
		public static void main(String[] args) throws InterruptedException {
			/*OrangeHRM Application  LogIn Functionality Test


			1. Automate Browser
			2. Navigate to OrangeHRM Application LogIn Page

			3. Validate LogInPage
			     Expected Title - OrangeHRM - (Should be)
			     Expected Url Address should have - OrangeHRM-4.2.0.1
			     
			     Expected LogIn Page Text - LOGIN Panel(should be)

			4. LogIn to the Application with a Validate Test data

			5.  Validated OrangeHRM Application HomePage

			6. Validate Home Page
			    Expected Title - OrangeHRM - (Should be)
			    Expected text should have - Admin
			7. Test WelCome Admin
			8. Test LogOut
			9. Validated LogIn Page    
			Expected Title - OrangeHRM - (Should be)
			      Expected Url Address should have - OrangeHRM-4.2.0.1
			        Expected LogIn Page Text - LOGIN Panel(should be)  */

			//1. Automate Browser
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\orange hr application\\orangeHRMApplication\\orangeHRMapplication\\browserDriverFiles\\broswerDriverFiles\\chromedriver.exe");
			    ChromeDriver driver= new ChromeDriver();
			   
			    //2. Navigate to OrangeHRM Application LogIn Page
			    String applicationUrlAddress="http://127.0.0.1/OrangeHRM-4.2.0.1/symfony/web/index.php/dashboard";
			    driver.navigate().to(applicationUrlAddress);
			   
			   
			    //3. Validate LogInPage
			               //Expected Title - OrangeHRM - (Should be)
			               //Expected Url Address should have - OrangeHRM-4.2.0.1
			               // Expected LogIn Page Text - LOGIN Panel(should be)
			   
			   //Expected Title - OrangeHRM - (Should be)
			     String expected_OrangeHRMLogInPageTitle="OrangeHRM";//Should Be
			 System.out.println(" The Expected Title of OrangeHRM Login Page is - "+expected_OrangeHRMLogInPageTitle);
			 
			 String actual_OrangeHRMLogInPageTitle=driver.getTitle();
			 System.out.println("The Actual Title Of OrangeHRM Login Page is - "+actual_OrangeHRMLogInPageTitle);
			 
			 
			 if (actual_OrangeHRMLogInPageTitle.equals(expected_OrangeHRMLogInPageTitle)) {
			 System.out.println("The Actual Title of OrangeHRM Login page  is Matched - Pass");

			 }
			 else {
			System.out.println("The Actual Title of OrangeHRM Login Page  is not Matched - Fail");

			 }
			 
			 //validation of Web Browser Current  Url
			 String expected_OrangeHRMLogInPageCurrentUrlAddress="OrangeHRM-4.2.0.1";//should have
			 System.out.println("The expected OrangeHRM application current url address  is - "+expected_OrangeHRMLogInPageCurrentUrlAddress);


			 String actual_OrangeHRMLogInPageCurrentUrlAddress =driver.getCurrentUrl();//getting Current page url Address
			 System.out.println("the actual OrangeHRM application current url address is -"+actual_OrangeHRMLogInPageCurrentUrlAddress);

			if(actual_OrangeHRMLogInPageCurrentUrlAddress.contains(expected_OrangeHRMLogInPageCurrentUrlAddress)) {
			System.out.println("The actual url Address  contains the Expected url address- Pass");

			}else
			{
			System.out.println("the actual url address does not Contain Expected url Address-Fail");

			}

			//Expected LogIn Page Text - LOGIN Panel(should be)
			String expected_OrangeHRMLogInPageText= "LOGIN Panel";
			System.out.println("The Expected Text of Login Page is "+expected_OrangeHRMLogInPageText);

			// <div id="logInPanelHeading">LOGIN Panel</div>

			By actual_OrangeHRMLogInPageTextProperty=By.id("logInPanelHeading");
			WebElement actual_logInPageText=driver.findElement(actual_OrangeHRMLogInPageTextProperty);
			String actual_OrangeHRMLogInPageText =actual_logInPageText.getText();
			System.out.println("The Actual Login Page Text is "+actual_OrangeHRMLogInPageText);


			if (actual_OrangeHRMLogInPageText.equals(expected_OrangeHRMLogInPageText)) {
			System.out.println("Actual Login Page Text Matched - Pass");

			} else {
			System.out.println(" Actual Login Page Text Not Matched - Fail");

			}


			//4. LogIn to the Application with a Validate Test data
			 

			//<input name="txtUsername" id="txtUsername" type="text">     userName
			      //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">     Password
			      //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">    login Button
			By UseNameProperty=By.id("txtUsername");
			WebElement userName=driver.findElement(UseNameProperty);
			String testData_UerName="ranjithreddy";
			userName.sendKeys(testData_UerName);

			    By passwordProperty=By.id("txtPassword");
			    WebElement Password=driver.findElement(passwordProperty);
			    String testData_Password="Ranjith@143";
			    Password.sendKeys(testData_Password);
			       
			   
			    By loginButtonProprty=By.className("button");
			    WebElement loginButton=driver.findElement(loginButtonProprty);
			    loginButton.click();
			   
			   
			    //5.  Validated OrangeHRM Application HomePage
			   
			   String  expected_OrangeHRMHomePageUrlAddress="http://127.0.0.1/OrangeHRM-4.2.0.1/symfony/web/index.php/dashboard";
			   System.out.println(" Expected OrangeHRM  Home Page  Url Address Is -"+expected_OrangeHRMHomePageUrlAddress);
			     
			   
			    String actual_OrangeHRMHomePageUrlAddress=driver.getCurrentUrl();
			    System.out.println(" Actual OrangeHRM Home Page Address Is -"+actual_OrangeHRMHomePageUrlAddress);
			   
			    if (actual_OrangeHRMHomePageUrlAddress.equals(expected_OrangeHRMHomePageUrlAddress)) {
			    System.out.println("The actual url Address of OrangeHRM Home Page is Matched- Pass");

			} else {
			System.out.println(" The actual url Address of OrangeHRM Home Page is Not Matched- Fail");


			}
			   
			   
			   
			    //6. Validate Home Page
			    //Expected Title - OrangeHRM - (Should be)
			    //Expected text should have - Admin
			   
			     String expected_OrangeHRMHomePageTitle="OrangeHRM";
			     System.out.println(" Expected Title of OrangeHRM Home Page is- "+expected_OrangeHRMHomePageTitle);
			     
			     
			    String actual_OrangeHRMHomePageTitle=driver.getTitle();
			    System.out.println(" Actual Title  of OrangeHRM home Page is- "+actual_OrangeHRMHomePageTitle);
			   
			   
			   
			    if (actual_OrangeHRMHomePageTitle.equals(actual_OrangeHRMHomePageTitle)) {
			    System.out.println("The Actual Title of OrangeHRM Home page  is Matched - Pass");

			 }
			 else {
			System.out.println("The Actual Title of OrangeHRM Home Page  is not Matched - Fail");


			}
			   
			   
			    //Expected text should have - Admin
			   
			   
			   
			    String expected_OrangeHRMHomePage_Text= "Admin";
			System.out.println("The Expected Text of OrangeHRM Home Page is "+expected_OrangeHRMHomePage_Text);

			//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			By actual_OrangeHRMHOmePage_TextProperty=By.linkText("Welcome Admin");
			WebElement actual_OrangeHRMHomePage_Text=driver.findElement(actual_OrangeHRMHOmePage_TextProperty);
			String actual_OrangeHrmPage_Text1= actual_OrangeHRMHomePage_Text.getText();

			System.out.println("The Actual Login Page Text is "+actual_OrangeHrmPage_Text1);


			if (actual_OrangeHrmPage_Text1.contains(expected_OrangeHRMHomePage_Text)) {
			System.out.println("Actual OrangeHRM Home Page text Contains Expected text - Pass");

			} else {
			System.out.println(" Actual OrangeHRM Home Page Text Contain Expected text - Fail");

			}



			  //7. Test WelCome Admin
			//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			By welcomeAdminProperty=By.linkText("Welcome Admin");
			WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
			welcomeAdmin.click();




			//8. Test LogOut
			Thread.sleep(10000);
			By logOutProperty=By.linkText("Logout");
			WebElement logOut= driver.findElement(logOutProperty);
			logOut.click();




			//9. Validated LogIn Page    
			//Expected Title - OrangeHRM - (Should be)
			    // Expected Url Address should have - OrangeHRM-4.2.0.1
			        //Expected LogIn Page Text - LOGIN Panel(should be)  



			 //Validation of LOGIN PAGE
			System.out.println() ;
			System.out.println("Validation Results After LogOut     ");
			System.out.println();
			String   expected_LoginPageUrlAddress="http://127.0.0.1/OrangeHRM-4.2.0.1/symfony/web/index.php/auth/login ";
			System.out.println(" Expected Current web  page url address After Logout is - "+expected_LoginPageUrlAddress);

			String actual_LoginPageUrlAddress=driver.getCurrentUrl();
			System.out.println("aCtral Current web Page Url Address After Logout  is -"+actual_LoginPageUrlAddress);
			 

			if (actual_LoginPageUrlAddress.equals(expected_LoginPageUrlAddress)) {
			 System.out.println("The Actual url Address is Matched - Pass");

			} else {
			System.out.println("The Actual url Address is not Matched - Fail");

			}

			//Expected Title - OrangeHRM - (Should be)

			String expected_OrangeHRMHomPageTitle1="OrangeHRM";
			System.out.println(" The Expected Title of OrangeHRM Home Page is - "+expected_OrangeHRMHomPageTitle1);
			 
			String actual_OrangeHRMHomePageTitle1=driver.getTitle();
			System.out.println("The Actual Title Of OrangeHRM Home Page is - "+actual_OrangeHRMHomePageTitle1);
			 
			 
			if (actual_OrangeHRMHomePageTitle1.equals(expected_OrangeHRMHomPageTitle1)) {
			 System.out.println("The Actual Title is Matched - Pass");

			} else {
			System.out.println("The Actual Title is not Matched - Fail");

			}


			// Expected Url Address should have - OrangeHRM-4.2.0.1

			String expected_OrangeHRMHomPageCurrentUrlAddress1="OrangeHRM-4.2.0.1";//should have
			 System.out.println("The expected url address of orngehrm home page is - "+expected_OrangeHRMHomPageCurrentUrlAddress1);


			 String actual_OrangeHRMHomePageCurrentUrlAddress1 =driver.getCurrentUrl();//getting Current page url Address
			 System.out.println("the actual OrangeHRM application current url address is -"+actual_OrangeHRMHomePageCurrentUrlAddress1);

			if(actual_OrangeHRMHomePageCurrentUrlAddress1.contains(expected_OrangeHRMHomPageCurrentUrlAddress1)) {
			System.out.println("The actual url Address  contains the Expected url address- Pass");

			}else {
			System.out.println("the actual url address dose not Contain Expected url Address-Fail");

			}

			//Expected LogIn Page Text - LOGIN Panel(should be) IN
			String expected_OrangeHRMLogInPage_Text="LOGIN Panel";
			System.out.println("Expected OrangeHRM Login Page Text is -"+expected_OrangeHRMLogInPage_Text);


			 // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			By actual_LoginPage_TextProperty=By.id("logInPanelHeading");
			WebElement  actual_LoginPage_Text=driver.findElement(actual_LoginPage_TextProperty);
			String  actual_OrangeHRMLogInPage_Text=actual_LoginPage_Text.getText();

			System.out.println(" Actual OrangeHRM Login Page Text is -"+actual_OrangeHRMLogInPage_Text);


			if (actual_OrangeHRMLogInPage_Text.equals(actual_OrangeHRMLogInPage_Text)) {
			System.out.println(" Actual OrangeHrm Login Page Text Is Matched -Pass");

			} else {
			System.out.println(" Actual OrangeHrm Login Page Text Is Not Matched -Fail");
	        
			}
			 driver.close();
			}

			

		}



