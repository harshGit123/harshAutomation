package misc_practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
      
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//rows no.
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		int totalNo = rows.size();
		
		System.out.println("Total No of rows "+totalNo);
		
		//no.of co;ums
		List<WebElement> Columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		
	     int TotalNoOfCol = Columns.size();
		
		System.out.println("Total Coumns are "+TotalNoOfCol);
		//Read header
		for(WebElement header:Columns)
		{
			
			System.out.print(header.getText()+" ");
		}
		//read rows
		
		List<WebElement> AllrowsData = driver.findElements(By.xpath("//table//tr"));
		Iterator<WebElement> it = AllrowsData.iterator();
		
		
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
