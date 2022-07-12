package parallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myClass1 {
  @Test
  public void myMethod()
{
	  	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://kite.zerodha.com/");
 	  
}
  }

