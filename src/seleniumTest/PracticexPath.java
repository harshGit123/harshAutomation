package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticexPath {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Harsh@123");
		
	}

}
