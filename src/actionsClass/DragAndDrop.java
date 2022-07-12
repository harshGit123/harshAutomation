package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(500);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destination = driver.findElement(By.id("amt8"));
		
		//how to drag and drop by using actions class
		
		//create object of action class and pass driver objecr
		Actions act=new Actions(driver);
		
		//by using action class methods from  desired location
		
		//1 way .act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		
		act.dragAndDrop(source, destination).perform();  //2.
		
		
		//mousehavor means move to element
		
		
		
		
		
		
		
		
		

	}

}
