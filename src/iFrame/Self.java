package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html_quotes");
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
		
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
			
		{
			
		}
		
		
		
	}

}
