package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeProg1

//How we will perform a action on webelement which is persent in the iframe.

{
	public static void main(String[] args) throws Exception {
	 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
//	***Main Page -----> Iframe
//  So here our button(webelement) is persent into the iframe that's why we didn't get element so we switch the  	
//  main page to iframe by using switch method
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(4000);	
	
//	Iframe ----------> Main Page.
//	So here our selenium is present in iframe and our element is present in the main page so we will come from 
//  iframe to main page by using follwing method either parentframe() method or defaultContent().
	driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
//	driver.findElement(By.xpath("//a[@id='menuButton']")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		
		
		
	Thread.sleep(4000);	
	driver.quit();
	
		
	}

}
