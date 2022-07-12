package rivision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1
{   public static void main(String[] args) throws InterruptedException, IOException
	{
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://instacourses.insightsonindia.com/dashboard");
	
	
	Thread.sleep(2000);
	
     	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	     File destination= new File("E:\\selenium\\ScreenShot\\myS1.png");
	     
	     FileHandler.copy(src, destination);
	
	
	}

	
	
	
}
