package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLogInPage login=new KiteLogInPage(driver);
		login.sendUsername();
		login.sendpassword();
		login.clickOnLoginButton();
		
		
		Thread.sleep(2000);
		
		
		KitePINPage pin=new KitePINPage(driver);
		 pin.sendpin();
		 pin.clickOncontinueButton();
		 
		 Thread.sleep(2000);
			
		
		KiteHomePage home =new KiteHomePage(driver);
		home.validateUserName();
		home.logOut();
		
		driver.close();
		
		
		
		
		
		

	}

}
