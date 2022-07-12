package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9062094%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnFIGGhYBK2LwK77-nwldTPb_kx-W40wP3Gf_0bCqY9BFPg4LGwsZo0aApHiEALw_wcB");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harsha");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chaudhari");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("saharsh@gmail.com");
			
			//date
			WebElement date = driver.findElement(By.id("day"));
			Select s=new Select(date);
			s.selectByValue("3");
			
			//month
			WebElement month = driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByValue("10");
			
			//year
			WebElement year = driver.findElement(By.id("year"));
			Select s2=new Select(year);
			s2.selectByValue("1999");
			
			
			//
			
			driver.findElement(By.xpath("//input[@value='1']")).click();
			
			
			

			
			
			

	}

}
