package kitePOMByTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validateKiteUserName 
{
	WebDriver driver;
	Sheet mySheet;
	KiteLogInPage login;
	KitePINPage pin;
	KiteHomePage home;
	
	
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		//headless browser remain topic//
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		
		//opt.addArguments("--disable-notifications");
		//opt.addArguments("--incognito");
	    driver= new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		File myfile=new File("E:\\selenium\\TestExcel26march.xlsx");
	    mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		login =new KiteLogInPage(driver);
		pin = new KitePINPage(driver);
		home=new KiteHomePage(driver);
		
		
	}
	
	
	
	@BeforeMethod
	public void logIntoKite() throws InterruptedException
	{
		String UN = mySheet.getRow(2).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(2).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(2).getCell(2).getStringCellValue();
		
		login.sendUsername(UN);
		Reporter.log("sending username",true);
		  Thread.sleep(2000);
		login.sendPassword(PWD);
		Reporter.log("sending password",true);
		  Thread.sleep(2000);
		login.clickOnLoginButton();
		Reporter.log("clicking on login",true);
		
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	pin.sendpin(PIN);
	Reporter.log("sending pin",true);
    pin.clickOncontinueButton();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
    
    
	
	}
	
	
  @Test
  public void validateUsername()
  {
	
	  String expectedUN = mySheet.getRow(2).getCell(0).getStringCellValue();
	  String actualUN = home.actualUser();
	  Reporter.log("validating username",true);
	  
	  Assert.assertEquals(actualUN, expectedUN,"Actual an expected is not matching TC failed");
	  Reporter.log("UN are matching TC passed");
	  
  }

  @AfterMethod
  public void logoutFromKite() throws InterruptedException
  {
     home.logOut();
     Reporter.log("logging out...",true);
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	 driver.close(); 
	 Reporter.log("closing browser",true);
  }
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
}
