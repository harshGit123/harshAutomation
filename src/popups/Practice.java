package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		//accept
		alt.accept();
		Thread.sleep(1000);
		
		//dismiss
		driver.findElement(By.id("confirmButton")).click();
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alt1.dismiss();
		//enter
		driver.findElement(By.id("promtButton")).click();
		Alert alt2 = driver.switchTo().alert();
		//alt2.getText();
		//System.out.println(alt2.getText());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Click me']")).sendKeys("Harshada");
		Thread.sleep(1000);
		alt2.accept();		

		
	}

}
