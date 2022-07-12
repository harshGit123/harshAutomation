package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.buffer.search.AbstractMultiSearchProcessorFactory;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
   //how to find number of rows in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		int totalNumOfRows = rows.size();
		System.out.println("Total number of rows in table "+totalNumOfRows);
		System.out.println("---------------------------------------------------");
		
		//how to find number of column
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNumOfColums = columns.size();
		System.out.println("total number of columns are "+totalNumOfColums);
		System.out.println("---------------------------------------------------");
		//how to read header
		for(WebElement header:columns)
		{
			System.out.print(header.getText()+" ");
		}
		System.out.println("---------------------------------------------------");
		//how to read all rows from table
		List<WebElement> allrowsdata = driver.findElements(By.xpath("//table//tr"));
	
		Iterator<WebElement> it = allrowsdata.iterator();
	
	while(it.hasNext())
	{
		System.out.print(it.next().getText()+" ");
		System.out.println();
	}
	
		//assignment=IPL score
	     //score card
	
		
		
		
	}

}
