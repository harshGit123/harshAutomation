package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("E:\\selenium\\hii.xlsx");
		
		String mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(mySheet);
		
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue(); 
        System.out.println(number);
       boolean bool = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue() ;
         System.out.println(bool);
	
	
	}

}
