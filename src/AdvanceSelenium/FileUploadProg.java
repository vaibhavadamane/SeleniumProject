package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadProg {

	public static void main(String[] args) throws Exception {
	
   /* Selenium does not support to file uploading due to when we choose the file that time the control will be
	goes to the operating system that time Selenium doesn't work that time we use path of that file and we
	pass this path through sendkeys into that webelement and we can also upload the .file and pdf through robot
	class*/
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	WebElement chooseButton = driver.findElement(By.xpath("//input[@type='file']"));
	WebElement pressButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
	chooseButton.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop");	
	Thread.sleep(3000);
	pressButton.click();	
		
	Thread.sleep(5000);
	driver.close();

	}

}
