package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//how to open site
	driver.get("https://vctcpune.com/selenium/practice.html");

	}

}
