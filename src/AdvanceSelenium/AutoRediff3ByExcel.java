package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoRediff3ByExcel {
//  We Automate the Rediff.com by using excel but we fill the webelement value in diferent way.

	public static String readExcelSheet1(int row,int col) throws Exception
	{
    FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\Rediff3Data.xlsx");
    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = excel.getRow(row).getCell(col).getStringCellValue();
	return value;
		
	}
	
	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
       
    WebElement fullNameBox = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[1]"));
	WebElement rediffMailId = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[2]"));

	fullNameBox.sendKeys(readExcelSheet1(0,0));
	rediffMailId.sendKeys(readExcelSheet1(1,0));

	
	

	}

}
