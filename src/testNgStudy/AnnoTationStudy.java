package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoTationStudy {
  @Test
  public void validateUserID() {
	  
	  Reporter.log("User ID validate", true);
	  	  
  }
  @Test
  public void validateDashboard()
  {
	  Reporter.log("Dashboard validate",true);
  }
  @BeforeMethod
  public void loginToKiteApp() 
  {
	  Reporter.log("Login sucess",true);
	  
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser launched",true);
  }
  @AfterMethod
  public void logoutFromKiteapp() 
  {
	  Reporter.log("logging out...",true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser closed...",true);
  }

  

}
