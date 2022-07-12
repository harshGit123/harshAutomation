package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement checkBox2 = driver.findElement(By.name("checkBoxOption2"));
		if(checkBox2.isSelected())
		{
			System.out.println("Checkbox already selected");
		}
		else {
			checkBox2.click();
			System.out.println("checkbox is now selected");
		}

		
	}

}
