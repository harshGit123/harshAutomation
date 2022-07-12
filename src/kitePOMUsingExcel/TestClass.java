package kitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		Thread.sleep(2000);
		File myfile=new File("E:\\selenium\\TestExcel26march.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String UN = mySheet.getRow(2).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(2).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(2).getCell(2).getStringCellValue();
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLogInPage login=new KiteLogInPage(driver);
		login.sendUsername(UN);
	
		login.sendPassword(PWD);
	
		login.clickOnLoginButton();
		
		
		Thread.sleep(2000);
		
		
		KitePINPage pin=new KitePINPage(driver);
		 pin.sendpin(PIN);
		 Thread.sleep(2000);
		 pin.clickOncontinueButton();
		 
		 Thread.sleep(2000);
			
		
		KiteHomePage home =new KiteHomePage(driver);
		home.validateUserName(UN);
		home.logOut();
		
		//driver.close();
		
		
		
		
		
		

	}

}
