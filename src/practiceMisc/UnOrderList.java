package practiceMisc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys("honda");
		
		 List<WebElement> searchRESULT = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		 System.out.println(searchRESULT.size());
		 Iterator<WebElement> r = searchRESULT.iterator();
		 
			
		 
		 	
	//	 for(WebElement s:searchRESULT)
		// {
			// System.out.println(s);
		 //}
	}

}
