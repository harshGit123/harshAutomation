package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		//switch selenium focus from main page to alert
		  Alert alt = driver.switchTo().alert();
		 //1. gettext
		 System.out.println(alt.getText());
		
		//2.accept
		alt.accept();
		//driver.findElement(By.id("timerAlertButton")).click();
		 
		
		 

	}

}
