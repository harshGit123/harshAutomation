package dynamicWaitsTypes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		
		//Thread.sleep(1000);
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
	}

}
