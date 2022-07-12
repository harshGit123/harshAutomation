package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.id("userid"));

		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserId = userName.getText();
		String expectedUserId="ELR321";
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("User ID matching tc is Passed");
		}
		else {
			System.out.println("User ID is not matching tc is failed");
		}
		
		 userName.click();

			Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@target='_self']")).click();

			Thread.sleep(1000);
		 driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
