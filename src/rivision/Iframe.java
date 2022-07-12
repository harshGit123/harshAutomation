package rivision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/iframes/");
		Thread.sleep(1000);
		
		driver.switchTo().frame("Frame2");
		
		String name = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		
		
		System.out.println(name);
		
		driver.switchTo().defaultContent();
		
		
		String name1 = driver.findElement(By.linkText("Blogger")).getText();
		
		System.out.println(name1);
		
		
		
		
		
		
		
		
	}
}
