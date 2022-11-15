package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//  We enter the iframe by using webelement
public class IframeProg2 {

	public static void main(String[] args) throws Exception {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	driver.findElement(By.id("s")).sendKeys("Velocity");
//	by using name we enter the iframe
//	driver.switchTo().frame("globalSqa");
	
//	By using the Webelemrnt we enter the iframe
	WebElement iframe = driver.findElement(By.xpath("//iframe[@align='center']"));
	driver.switchTo().frame(iframe);//By using the Webelemrnt we enter the iframe
	driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Velocity");
	
	
	Thread.sleep(5000);
	driver.quit();
	}

}
