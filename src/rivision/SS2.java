package rivision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String ssk = RandomString.make(3);
		
		File dest=new File("E:\\selenium\\ScreenShot\\myss2"+ssk+".png");
		
		FileHandler.copy(srs, dest);
	}

}
