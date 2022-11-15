package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://money.rediff.com/companies/market-capitalisation?src=moneyhome_topmarketcapital_more");
    
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
	System.out.println("Total No of Rows = " + rows.size());
	System.out.println("Total No of Column = " + column.size());
	
	for(int i=0;i<rows.size();i++) 
	{
	System.out.println(rows.get(i).getText());	
	}
    
    
    
    Thread.sleep(5000);
    driver.close();
	}

}
