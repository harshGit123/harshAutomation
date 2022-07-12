package rivision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.get("https://vctcpune.com/");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
     
    // Thread.sleep(20000);
    // driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("aaaa");
     
            String title = driver.getTitle();
            System.out.println("title is "+title);
	}

}
