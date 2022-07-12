package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		//window id
       String mainpageID = driver.getWindowHandle(); //id of main page		
		
		System.out.println(mainpageID);
		System.out.println("==============================");
		//to open child window
		driver.findElement(By.name("NewWindow")).click();
		
		//to handle multiple windows /to get multiple ids
		Set<String> allPageIDs = driver.getWindowHandles();
				Iterator<String> it = allPageIDs.iterator();
		
	//	while(it.hasNext()) {
		//	System.out.println(it.next());
		//}
	    String mainPageId=it.next();//will return main page id
	    String childPageId=it.next();// will return child page id 
	    Thread.sleep(1000);
		//switch focus to child window
		driver.switchTo().window(childPageId); 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		//driver.close();//close only current focus
		//driver.quit();//close all tab
		driver.switchTo().window(mainPageId);
	WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myElement.getText());
		
		
		
		
		
		
	}

}
