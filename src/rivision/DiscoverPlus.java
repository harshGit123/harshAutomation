package rivision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiscoverPlus {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9322346374");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}

}
