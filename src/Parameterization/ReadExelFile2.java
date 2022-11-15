package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelFile2 {

//  Taking a total value from Excel Sheet.	
	
	public static void main(String[] args) throws Exception {
    FileInputStream f = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\TestCase2.xlsx");
    Sheet excel = WorkbookFactory.create(f).getSheet("Sheet2");
    
//  Getting all data from Excel Sheet By using for loop
    
    for(int row=0;row<=6;row++)
    {
    for(int col=0;col<2;col++)
    {
    String Value = excel.getRow(row).getCell(col).getStringCellValue();
    System.out.print(Value + "\t");
    
    }
    System.out.println();
    }
    
    
    
	}

}
