package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass5 {
	
//  Handle the MouseOver by using Actions class
	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.americangolf.com/");
	
	WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
	Actions a = new Actions(driver);
	a.moveToElement(aboutUs).build().perform();
	
	WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
    contactUs.click();
	
//  By using for loop we can click	
//	for(int i=0;i<5;i++)
//	{
//	   a.sendKeys(Keys.ARROW_DOWN).build().perform();
//	}
//	a.sendKeys(Keys.ENTER).build().perform();
	
    Thread.sleep(4000);
	driver.close();

	}

}
