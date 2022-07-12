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

public class KiteAppByExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File myfile=new File("E:\\selenium\\TestExcel26march.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.id("userid"));

		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserId = userName.getText();
		String expectedUserId=UN;
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("User ID matching tc is Passed");
		}
		else {
			System.out.println("User ID is not matching tc is failed");
		}
		
		 userName.click();

			Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@target='_self']")).click();

			Thread.sleep(1000);
		 driver.close();
		
		

	}

	
	}


