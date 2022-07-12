package practiceMisc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		Iterator<WebElement> links = list.iterator();
		
		while(links.hasNext())
		{
			System.out.println(links.next().getText());
		}
		
		

	}

}
