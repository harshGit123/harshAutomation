package misleniousStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHAndling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(500);
	     String mainpageid = driver.getWindowHandle();
	     System.out.println(mainpageid);
	     driver.findElement(By.linkText("Try it Yourself")).click();
		    Thread.sleep(1000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		  Thread.sleep(1000);
			driver.findElement(By.linkText("Try it Yourself")).click();
			Thread.sleep(1000);
		         Set<String> multiid = driver.getWindowHandles();
		        ArrayList<String>at=new ArrayList(multiid);
		        System.out.println(at.get(0));
		        System.out.println(at.get(1));
		        System.out.println(at.get(2));
		        System.out.println(at.get(3));
		        driver.switchTo().window(at.get(1));
		        driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		        Thread.sleep(1000);
		        //driver.close();
		        Thread.sleep(1000);
		        driver.switchTo().window(at.get(0));
		        driver.switchTo().window(at.get(2));
		        driver.findElement(By.id("menuButton")).click();
		        Thread.sleep(1000);
		        //driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		        driver.close();
		      driver.switchTo().window(at.get(0));
		        Thread.sleep(1000);
		        driver.switchTo().window(at.get(3));
		        driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		        driver.close();
		        
		        
		
	
	
	}

}
