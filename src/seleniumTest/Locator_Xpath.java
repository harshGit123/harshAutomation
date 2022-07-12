package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Harsh");
		
		driver.findElement(By.xpath("//input[@name='radio']")).click();
		driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Velocity");
		//x-path by contains text
        driver.findElement(By.xpath("//h1[contains(text(),'Welcome To ')]']"));
        //X-path by contains attribute
        driver.findElement(By.xpath("//button[contains(@id,'ope')]"));
        //X-path by Index =when multiple option available and want to choose one
        driver.findElement(By.xpath("(//input[@name='radio'])[3]"));
        //x-path text
        driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));

	}

}
