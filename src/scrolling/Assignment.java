package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement aa = driver.findElement(By.id("name"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true)",aa);
		aa.sendKeys("Hi");
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		JavascriptExecutor i = ((JavascriptExecutor)driver);
		i.executeScript("arguments[0].scrollIntoView(true)",b);
		
		b.click();
		
		
		Thread.sleep(2000);
		WebElement bb = driver.findElement(By.id("autocomplete"));
		JavascriptExecutor e = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true)",bb);
		
		bb.sendKeys("Velocity");
		
		
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//input[@name='show-hide']"));
		
		JavascriptExecutor k = ((JavascriptExecutor)driver);
		k.executeScript("arguments[0].value='Good Morning';",c);
		
		

	}

}
