package misleniousStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath_rewievs_rating {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=one%20plus%20r&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).click();
		
	}

}
