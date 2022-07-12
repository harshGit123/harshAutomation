package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class self {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Harshada");

	}

}
