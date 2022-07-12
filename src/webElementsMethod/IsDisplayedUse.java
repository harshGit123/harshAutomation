package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textBox = driver.findElement(By.name("show-hide"));
		
		if(textBox.isDisplayed()) {
			System.out.println("Text box is displayed");
			
		}
		
		else {
			System.out.println("can't find textbox");
			
		}
		hide.click();

		if(textBox.isDisplayed()) {
			System.out.println("Text box is displayed");
			
		}
		
		else {
			System.out.println("can't find textbox");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
