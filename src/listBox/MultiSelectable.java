package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		WebElement multiSelectElement = driver.findElement(By.name("cars"));
		Select s=new Select(multiSelectElement);
		
		System.out.println("multiple select status is "+s.isMultiple());
		
		s.selectByVisibleText("Volvo");
        Thread.sleep(1000);
		
		s.selectByValue("saab");
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		
		Thread.sleep(1000);
		s.selectByIndex(3);
		//2.deselectall
		
		 Thread.sleep(1000);
		 
		 s.deselectByIndex(3);
		 Thread.sleep(1000);
		 s.deselectByIndex(2);
		 Thread.sleep(1000);
		 s.deselectByValue("saab");
		 
		 System.out.println(s.getFirstSelectedOption().getText());
		 
		 
		 
		 
		
		
		 
		 
		 
		 
		

	}

}
