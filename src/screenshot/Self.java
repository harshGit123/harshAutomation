package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Self {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://instacourses.insightsonindia.com/dashboard");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String src = RandomString.make(3);
	 File destination=new File("E:\\selenium\\myss"+src+".png");
	 FileHandler.copy(source, destination);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	///File soukrce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	

	}

}
