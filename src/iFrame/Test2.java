package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/iframes/");
			Thread.sleep(1000);
		  	String text=driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		  	System.out.println(text);
		  	
		  	driver.switchTo().frame("Frame1");
		  	String text1=driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
			System.out.println(text1);
			
			//xpath bylinktext
			driver.switchTo().parentFrame();
			//driver.switchTo().defaultContent();
			String text2 = driver.findElement(By.linkText("Pavilion")).getText();
			System.out.println(text2);

	}

}
