package testNgCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTest {

	@Parameters("browserName")
	@Test
  
  public void myTest(String name)
  {
		WebDriver driver=null;
		
		if(name.equals("firefox"))
		{
    
	  System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");	  
	  driver=new FirefoxDriver();
	  
  }
	else if(name.equals("chrome")) {
		
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");		
		driver=new ChromeDriver();
	}	
		
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		  
		
	
	  
	  
	  
	  
	  
	 
  
  }
}
