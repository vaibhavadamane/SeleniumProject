package MultipalWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandalMultipalElement {
   public static void main(String[] args) throws Exception {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");   
	
//  Initial Title
	String Title = driver.getTitle();
	System.out.println("Intial Title = " + Title);
	
	if(driver.getTitle().equals("Google"))
	{
	System.out.println("The test case of Intial Title validition is pass");	
	}
	else
	{
	System.out.println("The test case of Intial Title validition is failed");		
	}
	
	String url = driver.getCurrentUrl();
	System.out.println("First URL = " + url);
	
//  How many links are present in given page
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println("Total no of links in Webpage = " + links.size());
	
//	To get the text of  all links present in the Webpage.
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
	}
	
//  Click on the gmail text
	for(int i=0;i<links.size();i++)
	{
	String excpted = "Sign in";    //First link is Gmail
	String actual = links.get(i).getText();
	if(excpted.equals(actual))
	{
	     links.get(i).click();
//	     break;
	     i=26;
	}
	}
	
//  Final Title
	
	String Title2 = driver.getTitle();
	System.out.println("Final Title = " + Title2);
	
	if(driver.getTitle().equals("Gmail: Private and secure email at no cost | Google Workspace"))
	{
		System.out.println("The test case of Final Title validition is pass");
	}
	else
	{
		System.out.println("The test case of Final Title validition is fail");
	}
	
	String url2 = driver.getCurrentUrl();
	System.out.println("First URL = " + url2);
	
	Thread.sleep(4000);
	driver.close();
}
}
