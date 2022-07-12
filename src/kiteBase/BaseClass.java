package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{   protected WebDriver driver;

public void browser() 
	{
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
	    driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
