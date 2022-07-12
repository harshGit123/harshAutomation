package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbKeyword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		

		Thread.sleep(500);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(500);
		WebElement day = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
		act.click(day).perform();
		Thread.sleep(500);
		for(int i=1;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		Thread.sleep(500);
		//firstname.sendKeys("Harshada");
		act.keyDown(firstname, Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("arshada").build().perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
