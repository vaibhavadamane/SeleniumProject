package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Parameterization
public class ReadExcelFile {
//  Single value input from Excel sheet	
	public static void main(String[] args) throws Exception 
	{
//	Passing	the	excel file address	
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\TestCase.xlsx");
//	Finalizing	the	sheet we are going to read.
	Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
//	Row=0,coulmn=0
    String Value1 = excel.getRow(0).getCell(0).getStringCellValue();//Automation
    System.out.println(Value1);
    String Value2 = excel.getRow(1).getCell(0).getStringCellValue();//Java
    System.out.println(Value2);		
    String Value3 = excel.getRow(2).getCell(0).getStringCellValue();//Selenium
    System.out.println(Value3);		
    String Value4 = excel.getRow(3).getCell(0).getStringCellValue();//Project
    System.out.println(Value4);	
    
	System.out.println("***************************************");
	
    String Value5 = excel.getRow(0).getCell(1).getStringCellValue();//MannulI
    System.out.println(Value5);
    String Value6 = excel.getRow(1).getCell(1).getStringCellValue();//MannulII
    System.out.println(Value6);		
    String Value7 = excel.getRow(2).getCell(1).getStringCellValue();//API Testing
    System.out.println(Value7);		
    String Value8 = excel.getRow(3).getCell(1).getStringCellValue();//SQL
    System.out.println(Value8);				
	}
	
	

}
