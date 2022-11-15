package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass7 {

//  This is difficult program when we didn't have HTML code of particular component that time we perform this method	
	
	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");	
	
	WebElement closePopup = driver.findElement(By.xpath("//button[text()='✕']"));
	closePopup.click();
	Thread.sleep(2000);
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	Actions a = new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(login).build().perform();
	Thread.sleep(2000);
	WebElement giftCards = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
    giftCards.click();
		
	Thread.sleep(9000);
	driver.close();
	}
}