package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		

	}

}
