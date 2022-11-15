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

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoRediff1ByExcel {
//  Automate the total Rediff1.Com URL By Rediff1Data Excel Sheet.
	public static void main(String[] args) throws Exception {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://is.rediff.com/signup/register");
    
    WebElement fullName = driver.findElement(By.id("fullname"));
    WebElement currentEmailId = driver.findElement(By.id("emailid"));
    WebElement passworld = driver.findElement(By.id("pass"));
    WebElement rePassworld = driver.findElement(By.id("repass"));
    WebElement maleGender = driver.findElement(By.xpath("//input[@id='sex']"));
    WebElement femaleGender = driver.findElement(By.xpath("//input[@value='f']"));
    WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='date_day']"));
    WebElement monthDropDown  = driver.findElement(By.xpath("//select[@id='date_mon']"));
    WebElement yearDropDown  = driver.findElement(By.xpath("//select[@name='Date_Year']"));
    WebElement location = driver.findElement(By.id("signup_city"));
    WebElement school = driver.findElement(By.id("school"));
    WebElement collage= driver.findElement(By.id("college"));
    WebElement captcha = driver.findElement(By.id("fld_captcha"));
    WebElement loginButton = driver.findElement(By.id("btn_register"));
    
    FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\TestCase\\Reddiff1Data.xlsx");
    Sheet rediffData = WorkbookFactory.create(file).getSheet("Sheet1");
     
    fullName.sendKeys(rediffData.getRow(0).getCell(0).getStringCellValue());
    currentEmailId.sendKeys(rediffData.getRow(0).getCell(1).getStringCellValue());
    passworld.sendKeys(rediffData.getRow(0).getCell(2).getStringCellValue());
    rePassworld.sendKeys(rediffData.getRow(0).getCell(3).getStringCellValue());
    maleGender.click();
    femaleGender.click();
    Select s1 = new Select(dayDropDown);
    s1.selectByVisibleText(rediffData.getRow(0).getCell(4).getStringCellValue());
    Select s2 = new Select(monthDropDown);
    s2.selectByVisibleText(rediffData.getRow(0).getCell(5).getStringCellValue());
    Select s3 = new Select(yearDropDown);
    s3.selectByVisibleText(rediffData.getRow(0).getCell(6).getStringCellValue());
    location.sendKeys(rediffData.getRow(0).getCell(7).getStringCellValue());
    school.sendKeys(rediffData.getRow(0).getCell(8).getStringCellValue());
    collage.sendKeys(rediffData.getRow(0).getCell(9).getStringCellValue());
    captcha.sendKeys(rediffData.getRow(0).getCell(10).getStringCellValue());
    Thread.sleep(5000);
    loginButton.click();
    
    Thread.sleep(3000);
    driver.close();
	}

}
