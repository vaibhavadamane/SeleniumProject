package MultipalWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/index.html");
	
	List<WebElement> rows = driver.findElements(By.xpath("//div[@class='hmmtctable']//ul"));
	List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmmtctable']//ul[2]//li"));
	System.out.println("Total No of Rows = " + rows.size());
	System.out.println("Total No of Column = " + column.size());
	
	for(int i=0;i<rows.size();i++) 
	{
	System.out.println(rows.get(i).getText());	
	}
	
	Thread.sleep(3000);
    driver.close();
	}

}
