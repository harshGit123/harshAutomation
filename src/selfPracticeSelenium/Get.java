package selfPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();

	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshada");
		
		
		
		
	}

}
