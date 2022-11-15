package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessProg 
{
   public static void main(String[] args) throws Exception
{
  /*Basic format:- WebDriverManager.chromedriver().setup();
	               ChromeOptions option = new ChromeOptions();
	               option.addArguments("headless");
	               WebDriver driver =new ChromeDriver(option);*/
	
	WebDriverManager.chromedriver().setup();
	
//  This Modification we will include into to achieve the headless program	
	ChromeOptions o = new ChromeOptions();
	o.addArguments("headless");
	WebDriver driver = new ChromeDriver(o);
	
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
	String intialTitle = driver.getTitle();
	System.out.println("Last Title = " + intialTitle);

	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("info");	
	Thread.sleep(2000);    //Its is nessarary.
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
		if(exp.equals(act))
		{
			sugeestion.get(i).click();
			break;  // Put break keyword here
		}
	}
	String lastTitle1 = driver.getTitle();
	System.out.println("Last Title = " + lastTitle1);
		
	Thread.sleep(3000);
	driver.close();
	}
}
	
	
	
