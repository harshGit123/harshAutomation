package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite2Excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		
		
		File myFile=new File("E:\\selenium\\TestExcel26march.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");  
		String UN = mySheet.getRow(6).getCell(0).getStringCellValue();
		
		String PWD = mySheet.getRow(6).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(6).getCell(2).getStringCellValue();
 
		 WebElement UserId = driver.findElement(By.id("userid"));
		 WebElement PassWord = driver.findElement(By.id("password"));
		 
		 
		 UserId.sendKeys(UN);
		 Thread.sleep(1000);
		 PassWord.sendKeys(PWD);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
         WebElement UserPin = driver.findElement(By.id("pin"));
		 
		UserPin.sendKeys(PIN);
		 
		 Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		 WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String ActualUI = username.getText();
		 
		 String ExpectedUI = "ELR321";
		 
		 if(ActualUI.equals(ExpectedUI))
		 {
			 System.out.println("TC pass");
		 }
		 else
		 {
			 System.out.println("TC fail");
		 }
		 

	}

}
