package kiteBase;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import kiteUtility.UtilityProp;

public class BaseNew 
{   
	static public WebDriver driver;

   
	public void openfirefoxBrowser() throws IOException 
	{
//	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");	
	//	driver= new ChromeDriver();		
	    //driver.get("https://kite.zerodha.com/");
		//driver.manage().window().maximize();
		//driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		//Reporter.log("Launching browser",true);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
		
    
	  System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");	  
	  driver=new FirefoxDriver();
	driver.get(UtilityProp.getDataFromPropertyFile("URL"));
	Reporter.log("Launching browser",true);
	  
  }
	public void openChromeBrowser() throws IOException{
		
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Launching browser",true);
	}			
		
		

		
		
	


	
	    
	    public  void captureScreenshot(String TCID) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("E:\\selenium\\ScreenShot\\myScreenshot"+TCID+".png");
		
		    FileHandler.copy(src, dest);
		    


}
}
