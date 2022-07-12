package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToView {



	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://instacourses.insightsonindia.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement kt = driver.findElement(By.xpath("//h2[text()='All Courses']"));
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		
		e.executeScript("arguments[0].scrollIntoView(true)",kt);
		

}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
