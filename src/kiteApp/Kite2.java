package kiteApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
 
		 WebElement UserId = driver.findElement(By.id("userid"));
		 WebElement PWD = driver.findElement(By.id("password"));
		 
		 
		 UserId.sendKeys("ELR321");
		 PWD.sendKeys("Dhana1111");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		 WebElement PIN = driver.findElement(By.id("pin"));
		 PIN.sendKeys("982278");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		 WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String ActualUI = username.getText();
		 
		 String ExpectedUI = "ELR321";
		 
		 if(ActualUI.equals(ExpectedUI))
		 {
			 System.out.println("TC pass");
		 }
		 else
		 {
			 System.out.println("TC fail");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
