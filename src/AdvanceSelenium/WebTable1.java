package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://money.rediff.com/index.html");
	
    List<WebElement> rows = driver.findElements(By.xpath("//div[@id='div_bseindices']//ul"));//This is xpath of total 6 rows
    System.out.println("Total Rows = " + rows.size());
    List<WebElement> column = driver.findElements(By.xpath("//div[@id='div_bseindices']//ul[1]//li"));//This xpath indicate each row contain 4 column.
    System.out.println("Total Column = " + column.size());
    for(int i=0;i<rows.size();i++)     //Print the total rows with total column in each row
    {
    	System.out.println(rows.get(i).getText());
    }
//    for(int i=0;i<column.size();i++) //Print the total column in selective row (row no1)
//    {
//    	System.out.println(column.get(i).getText());
//    }
    
    Thread.sleep(3000);
    driver.close();
	}

}
