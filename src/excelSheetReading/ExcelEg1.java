package excelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create excel sheet ANd pass the path along with name and extension
		File myfile=new File("E:\\selenium\\TestExcel26march.xlsx");
		
		//using workbookfactory  class read excel sheet
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(name);
		
		double num = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
        System.out.println(num);
	
        
       String str = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println(str);
        
        
        
        
        
	
	}

}
