package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(500);
		
		
		WebElement seleniumButton= driver.findElement(By.linkText("Selenium"));
		//seleniumButton.click();---->using webelement method
		
		
		//by actions class
		//create object of actions class and pass driver object
		Actions act =new Actions(driver);
		
		//using one of the required actions complete the process
		
	//1.way	//act.moveToElement(seleniumButton).perform();
		//act.click().perform();
		
	//2.way//	act.moveToElement(seleniumButton).click().build().perform();
		
		//act.click(seleniumButton).perform();  //3.way
		
		
	///right click(contextclick)using action class
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(rightClickButton).build().perform();
		
		//act.contextClick(rightClickButton).perform();
		
		
		////double click
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleClick).perform();
		
		
		
		
		
		
		
		

	}

}
