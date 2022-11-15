package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass6 {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	//To Mouse over the account list module and select the your prime vedio
    WebElement accountAndLists = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	Actions a = new Actions(driver);
	a.moveToElement(accountAndLists).build().perform();//after mouse over we displayed the component
	Thread.sleep(2000);
	WebElement yourPV = driver.findElement(By.xpath("//span[text()='Your Prime Video']"));//we inspect that element by right click.
	yourPV.click();
	
    driver.navigate().back();
    Thread.sleep(2000);
    
    //To Mouse over the language module and select Marathi language
    WebElement lang = driver.findElement(By.xpath("//span[@style='visibility: visible;']"));
	Actions b = new Actions(driver);
	b.moveToElement(lang).build().perform();
	Thread.sleep(2000);
	WebElement marathi = driver.findElement(By.xpath("//span[text()='मराठी']"));
    marathi.click();
    
    Thread.sleep(5000);
	driver.close();

	
	}
}
