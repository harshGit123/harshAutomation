package actionsClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizePosition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		//how to get size
		System.out.println(driver.manage().window().getSize());
		
		//How to set size
		//need to create object of dimension class and pass value
		
		Dimension d=new Dimension(1000,200) ;
		
		//set size 
		driver.manage().window().setSize(d);
		
		Thread.sleep(500);
		
		//position---------//need to create object of point class and pass value
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(620, 10);
		
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		

	}

}
