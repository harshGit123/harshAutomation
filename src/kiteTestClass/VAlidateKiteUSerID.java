package kiteTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.BaseClass;
import kitePOMtestngNew.KiteHomePage;
import kitePOMtestngNew.KiteLogInPage;
import kitePOMtestngNew.KitePINPage;
import kiteUtility.Utility;

public class VAlidateKiteUSerID extends BaseClass{
	KiteHomePage home;
	KiteLogInPage login;
	KitePINPage pin;
	String TCID="1234";
	
  @BeforeClass
  public void launchBrowser() {
	  browser();
	  login =new KiteLogInPage(driver);
	  pin=new KitePINPage(driver);
	  home=new KiteHomePage(driver);
	  
  }
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.sendUsername(Utility.readDataExcel(2, 0));
		Thread.sleep(1000);
		login.sendPassword(Utility.readDataExcel(2, 1));
		Thread.sleep(1000);
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.readDataExcel(2, 2));
		pin.clickOncontinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}	
	
	
	@Test
  public void validateUserid() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.actualUser(),Utility.readDataExcel(2, 0),"Actual and Expected username are not matching TC failed");
	  Utility.captureScreenshot(driver, TCID);
	  
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
