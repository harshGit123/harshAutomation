package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//click method
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
		

	}

}
