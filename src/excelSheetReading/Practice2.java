package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    File myfile=new File("E:\\selenium\\hii.xlsx");
		
	//String mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row row = mysheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getCellType());
		
		
		
		Sheet mySheet2 = book.getSheet("Sheet2");
		
		for(int i=0;i<=1;i++)
		{
			for(int j =0;j<=2;j++)
			{
				String value = mySheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
				
			}
			System.out.println();
			
						
		}
		int totalNumberOfRows = mysheet.getLastRowNum();// will give me total
		
		int rowCount = totalNumberOfRows;
		System.out.println("Total number of rows are "+rowCount);
		short totalNumberOfCells =
		mysheet.getRow(totalNumberOfRows).getLastCellNum();
		int cellCount = totalNumberOfCells-1;
		System.out.println("Total number of cell are "+cellCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				Cell cellValue = mysheet.getRow(i).getCell(j);
				CellType dataType = cellValue.getCellType();
				if(dataType==CellType.STRING)
				{
				String value = cellValue.getStringCellValue();
				System.out.print(value+" ");
				}
				else if (dataType==CellType.NUMERIC)
				{
				double value = cellValue.getNumericCellValue();
				System.out.print(value+" ");
				}
				else if (dataType==CellType.BOOLEAN)
				{
				Boolean value = cellValue.getBooleanCellValue();
				System.out.print(value+" ");
				}
				else if (dataType==CellType.BLANK)
				{
				System.out.print(" ");
				}
				}
				System.out.println();
				}
				}
				}
					
				
			
		
	
	
	



