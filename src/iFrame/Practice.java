package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(1000);
		driver.switchTo().frame("iframe inside frame:");
		String text = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
		
		System.out.println(text);
	}

}
