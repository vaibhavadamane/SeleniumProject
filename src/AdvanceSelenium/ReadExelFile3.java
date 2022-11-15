package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelFile3 {

	public static void main(String[] args) throws Exception {
		
	FileInputStream A = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\TestCase1.xlsx");	
    Sheet excel1 = WorkbookFactory.create(A).getSheet("Sheet3");
    for(int row=0;row<=excel1.getLastRowNum();row++)//This for loop counting the totol no of row that is 4
    {
    for(int col=0;col<excel1.getRow(row).getLastCellNum();col++)//This for loop is for counting the last cell no in each row.
    {	
    String value1 = excel1.getRow(row).getCell(col).getStringCellValue();  
    System.out.print(value1 + "\t");
    }
    System.out.println();
    }
    
    
    
    
	}

}
