package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
     //excel
	//screenshot               //static type code or generic code
	//closing
	
	public static String readDataExcel(int row , int cell) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("E:\\selenium\\TestExcel26march.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;		
		
	}
	
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\selenium\\ScreenShot\\myScreenshot"+TCID+".png");
	
	    FileHandler.copy(src, dest);
	    
	    
	}
	
	
	
	
	
	
}
