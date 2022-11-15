package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoRediff2ByExcel {
//	Automate the total Rediff2.Com URL By Rediff3Data Excel Sheet.
	public static void main(String[] args) throws Exception{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    
    WebElement fullNameBox = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[1]"));
	WebElement rediffMailId = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[2]"));
	WebElement checkAvability = driver.findElement(By.xpath("//input[@value='Check availability']"));
	WebElement passworld = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]"));
	WebElement rePassworld = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[2]"));
	WebElement alterMailId = driver.findElement(By.xpath("(//input[contains(@name,'altemail')])[1]"));
	WebElement cheakBox = driver.findElement(By.xpath("(//input[contains(@name,'altemail')])[2]"));
	WebElement securityQuestion = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[1]"));
	Select s0 = new Select(securityQuestion);
    WebElement enterAnswer = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
    WebElement mothersMaidenName = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[7]"));
	WebElement moblieNumber = driver.findElement(By.id("mobno"));
	WebElement dayDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]")); 
	Select s1 = new Select(dayDropdown);
	WebElement monthDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[3]")); 
	Select s2 = new Select(monthDropdown);		
	WebElement yearDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[4]")); 
	Select s3 = new Select(yearDropdown);	
	WebElement countryDropdown = driver.findElement(By.id("country")); 
	Select s4 = new Select(countryDropdown);	
	WebElement cityDropdown = driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']")); 
    Select s5 = new Select(cityDropdown);	
	WebElement genderMale = driver.findElement(By.xpath("//input[@value='m']")); //for male
	WebElement genderFemale = driver.findElement(By.xpath("//input[@value='f']"));  //for female
	WebElement captcha = driver.findElement(By.xpath("//input[@style='width:183px;']")); 
	WebElement createButton = driver.findElement(By.xpath("//input[@id='Register']")); 	
	
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\Rediff3Data.xlsx");
	Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");	
	
	
	fullNameBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
	rediffMailId.sendKeys(excel.getRow(1).getCell(0).getStringCellValue());
	checkAvability.click();
	passworld.sendKeys(excel.getRow(2).getCell(0).getStringCellValue());
	rePassworld.sendKeys(excel.getRow(3).getCell(0).getStringCellValue());
	alterMailId.sendKeys(excel.getRow(4).getCell(0).getStringCellValue());
	cheakBox.click();
	s0.selectByVisibleText(excel.getRow(5).getCell(0).getStringCellValue());
	enterAnswer.sendKeys(excel.getRow(6).getCell(0).getStringCellValue());
	mothersMaidenName.sendKeys(excel.getRow(7).getCell(0).getStringCellValue());
    moblieNumber.sendKeys(excel.getRow(8).getCell(0).getStringCellValue());
	s1.selectByVisibleText(excel.getRow(9).getCell(0).getStringCellValue());
	s2.selectByVisibleText(excel.getRow(10).getCell(0).getStringCellValue());
	s3.selectByVisibleText(excel.getRow(11).getCell(0).getStringCellValue());
	s4.selectByVisibleText(excel.getRow(12).getCell(0).getStringCellValue());
	s5.selectByVisibleText(excel.getRow(13).getCell(0).getStringCellValue());
	genderMale.click();
    genderFemale.click();
    captcha.sendKeys(excel.getRow(14).getCell(0).getStringCellValue());
    Thread.sleep(4000);
    createButton.click();
    
	Thread.sleep(5000);
	driver.quit();
		
		
		
		
		
		
		
	}

}
