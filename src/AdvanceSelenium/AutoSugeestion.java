package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugeestion {
//  How to handle the Autosuggestion its total size,print it,click on one suggestion.

	public static void main(String[] args) throws Exception {
	
    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
	String intialTitle = driver.getTitle();
	System.out.println("Last Title = " + intialTitle);
	
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //Useful for all element present into webpage.Excution speed is more than sleep method.
    
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("info");	
	//Thread.sleep(2000);    //Its is nessarary.
	List<WebElement> sugeestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
//  Total no of Autosugeestion
	System.out.println("Total No Of Autosuggestion = " + sugeestion.size());
//  Get Text of all Auto suggestion.		
	for(int i=0;i<sugeestion.size();i++)	
	{
		System.out.println(sugeestion.get(i).getText());
	}
//  Click on one of the sugesstion present in the autosugeestion.		
	for(int i=0;i<sugeestion.size();i++) 
	{
		String exp = "infosys nagpur";
		String act = sugeestion.get(i).getText();
		if(act.equals(exp))//(exp.equals(act))
		{
			sugeestion.get(i).click();
			break;  // Put break keyword here
		}
	}
	String lastTitle1 = driver.getTitle();
	System.out.println("Last Title = " + lastTitle1);

	driver.close();
	}

}
