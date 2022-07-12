package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String abc = RandomString.make(3);
		File destination = new File("E:\\selenium\\ScreenShot\\TestScreenshot"+abc+".png");
		FileHandler.copy(src, destination);

	}

}
