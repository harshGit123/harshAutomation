package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html_quotes");
		Thread.sleep(1000);
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		
		
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
    


	}

}
