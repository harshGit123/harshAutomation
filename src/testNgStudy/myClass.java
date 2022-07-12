package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myClass {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://vctcpune.com/selenium/practice.html");
	   System.out.println("hi method is running this is prinnting statement");   
	   Reporter.log("hi method is running this is reporter output");
	   Reporter.log("hi method is running this is reporter output true",true);	   
	   
	   
	  Thread.sleep(1000);	  	  
  }
  @Test
  public void myMethod1() throws InterruptedException 
  {
	  	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://kite.zerodha.com/");
	  
	  Thread.sleep(1000);	  	  
  }
  
  
  
  
  
  
  
}
