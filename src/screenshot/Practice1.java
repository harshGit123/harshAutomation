package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String ran = RandomString.make(2);
		
		File destination = new File("E:\\selenium\\ScreenShot\\sstest"+ran+".png");
		FileHandler.copy(ss, destination);
		
		
		
		
		
		
		
		
	}

}
