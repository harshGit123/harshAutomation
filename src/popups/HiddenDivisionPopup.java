package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("q")).sendKeys("one plus 10r");
		  Thread.sleep(1000);
		  
		  //one more for 
		 // driver.findElement(By.xpath("//button[@type='submit']")).click();
		  //OR
		  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
	}

}
