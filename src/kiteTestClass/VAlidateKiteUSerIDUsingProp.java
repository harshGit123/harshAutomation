package kiteTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteBase.BaseNew;
import kitePOMtestngNew.KiteHomePage;
import kitePOMtestngNew.KiteLogInPage;
import kitePOMtestngNew.KitePINPage;
import kiteUtility.UtilityProp;

@Listeners(kiteUtility.Listener.class)

public class VAlidateKiteUSerIDUsingProp extends BaseNew{
	KiteHomePage home;
	KiteLogInPage login;
	KitePINPage pin;
//	String TCID="555";
	@Parameters("Browsername")
	
 
  @BeforeClass
  public void launchBrowser(String name) throws IOException {
	 
	if(name.equals("chrome"))
	{
		openChromeBrowser();
	}
	else if(name.equals("firefox"))
	{
		openfirefoxBrowser();
	}
	
	  login =new KiteLogInPage(driver);
	  pin=new KitePINPage(driver);
	  home=new KiteHomePage(driver);
	  
  }
	
			  
		  
		
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.sendUsername(UtilityProp.getDataFromPropertyFile("UN"));
		Thread.sleep(2000);
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		Thread.sleep(2000);
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOncontinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}	
	
	
	@Test
  public void validateUserid() throws EncryptedDocumentException, IOException
  {
		//Assert.fail();
	 Assert.assertEquals(home.actualUser(), UtilityProp.getDataFromPropertyFile("UN"));
	// UtilityProp.captureScreenshot(driver, TCID);
	  
  }
	
	@AfterMethod
	public void logOutfromKite() throws InterruptedException {
		home.logOut();
	}
	@AfterClass
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
