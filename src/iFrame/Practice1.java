package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		//text
		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(text);
		
		//
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Velocity");
		//
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		//
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement s = driver.findElement(By.id("animals"));
		Select s1=new Select(s);
        System.out.println(s1.isMultiple());		
		s1.selectByIndex(3);
		s1.selectByValue("babycat");
		
		
		

	}

}
