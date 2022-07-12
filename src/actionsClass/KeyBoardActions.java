package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		//Find Element
	 WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys;---------- using WebElement method
		 
		//Create object of Actions class and pass driver object
		Actions act = new Actions(driver);
		act.sendKeys(textBox, "Harshada").perform();

		//handle drop down
         WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));		

 act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
 
//act.click(dropdown).sendKeys(Keys.)
		
		
		
		
		
	}

}
