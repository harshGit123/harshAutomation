package rivision;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/"); hideen popup
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Harsh");

		//Thread.sleep(1000);
		//driver.close();
		System.out.println("==================");
		
		
		//driver.get("https://demoqa.com/alerts");
		
		
		//driver.findElement(By.id("alertButton")).click();
		
	         //  Alert Alt = driver.switchTo().alert();
		///System.out.println(Alt.getText());
		      //  Alt.accept();
		System.out.println("==================");
	//	driver.get("https://demoqa.com/alerts");
		
	//	driver.findElement(By.id("promtButton")).click();
		
	//	 Alert Alt = driver.switchTo().alert();
	//	Alt.sendKeys("Harsh");
		
		//Alt.accept();
		
		
		
		
		System.out.println("==================");
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
	String mainpageId = driver.getWindowHandle();
		
		
		System.out.println("mainpageId is "+mainpageId);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		//System.out.println(ids);
		
		Iterator<String> getid = ids.iterator();
		
	//	while(getid.hasNext())
	//	{
			//System.out.println(getid.next());
		//}
		String mainpage = getid.next();
		String childpageid = getid.next();
	
		//switch focus to child
	
	
	driver.switchTo().window(childpageid);
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenium");
	
	
	
	
	
	
	
	}

}
