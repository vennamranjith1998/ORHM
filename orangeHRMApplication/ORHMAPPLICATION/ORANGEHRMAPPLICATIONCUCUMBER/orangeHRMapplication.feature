Feature: OrangeHRM Application Functionalities Testing

Scenario: OrangeHRM Application LogInPage functionality Testing

Given User Should Open a Brower in the System
When User should enter valid Application Url Address
Then User should be able to Navigate to the OrangeHRM Application LogIn Page
Then User should close the Browser along with the Application

@Sanity
Scenario: OrangeHRM Application LogInPage functionality Testing
Given User Should Open a Brower in the System
When User should enter valid Application Url Address
Then User should be able to Navigate to the OrangeHRM Application LogIn Page
Then User should close the Browser along with the Application

@Smoke @LogInTestWithSingleTestData
Scenario: OrangeHRM Application LogIn functionality Testing
Given User Should Open a Browser in the System
When User should enter valid Application Url Address
Then User should be able to Navigate to the OrangeHRM Application LogIn Page
Then User should enter UserName and Password and click on logIn button
Then User should be able to navigate to OrangeHRMApplication HomePage
Then User should perform click operation on WelComeAdmin and click on logOut
Then User should be able to navigate to OrangeHRMApplication logIn webPage
Then User should close the Browser along with the Application
 
@Smoke @LogInTestWithTestData
 Scenario Outline: OrangeHRM Application LogIn functionality Testing with Multiple TestData
Given User Should Open a Browser in the System
When User should enter valid Application Url Address
Then User should be able to Navigate to the OrangeHRM Application LogIn Page
Then User should enter "<UserName>" and "<Password>" and click on logIn button
Then User should be able to navigate to OrangeHRMApplication HomePage
Then User should perform click operation on WelComeAdmin and click on logOut
Then User should be able to navigate to OrangeHRMApplication logIn webPage
Then User should close the Browser along with the Application

Examples:
|   UserName         |   Password      |
|   Ranjithreddy     |   Ranjith@143   |
|   ranjithreddy     |   Ranjith@143   |
|   rqanjith         |   Ranjith@143   |
|   ranjith          |   WebDriver     |
|   Ranjithreddy     |   Ranjith@143   |

