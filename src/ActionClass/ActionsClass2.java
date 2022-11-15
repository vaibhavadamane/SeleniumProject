package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass2 {

//  By using Actions class Right click and Double click on particular button present in the webpage	
	
	public static void main(String[] args) throws Exception 
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	//Right Click and select particular option
	WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions a = new Actions(driver);
	a.moveToElement(rightClick).contextClick().build().perform();
	for(int i=0;i<5;i++)
	{
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	Thread.sleep(3000);
	a.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	String y = driver.switchTo().alert().getText();
    System.out.println("After the right click = " + y);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);

	//Double click on button.
	WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	a.moveToElement(doubleClick).doubleClick().build().perform();
	Thread.sleep(3000);
    String x = driver.switchTo().alert().getText();
    System.out.println("After the double click = " + x);
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	driver.close();
	}
}
