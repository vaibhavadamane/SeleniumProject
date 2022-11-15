package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager1 {
	
//  use of webdrierManager
	
	public static void main(String[] args) throws Exception  {
		
//  By using WebDriverManger We can automate the URL in various Browser without adding its exe file and if our 
//	Browser is Update until we automate the URL	

//  Simple Way Chromedriver
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.amazon.in/");

//  By Using WebDriverManager	
		
//  1)Chrome
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();	
	
//  2)FireFox
//	WebDriverManager.firefoxdriver().setup();
//	WebDriver driver = new FirefoxDriver();
	
// 	3)Edge
//	WebDriverManager.edgedriver().setup();
//	WebDriver driver = new EdgeDriver();

//	4)Opera
//	WebDriverManager.operadriver().setup();
//	WebDriver driver = new OperaDriver();	
	
//  5)Safari
//	WebDriverManager.safaridriver().setup();
//	WebDriver driver = new SafariDriver();	
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");

	Thread.sleep(5000);
	driver.quit();
	}

}