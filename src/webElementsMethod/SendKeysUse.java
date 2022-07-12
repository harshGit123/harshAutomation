package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//sendkeys//
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Selenium");
		
		//synchronisation=to match speed of selenium and browser
		Thread.sleep(1000);   //1 sec
		
		
		//clear method//
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();

	}
	

}
