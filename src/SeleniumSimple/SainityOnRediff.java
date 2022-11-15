package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Here we perform overall Testing.....
public class SainityOnRediff {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//
	    driver.manage().window().maximize();
	    driver.get("https://is.rediff.com/signup/register");
	    
	    WebElement rediffLink = driver.findElement(By.xpath("//a[@class='ft11']"));
	    WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
//	    WebElement grayLine = driver.findElement(By.xpath("//div[@class='greybar']"));
//	    WebElement newUserLabal = driver.findElement(By.xpath("New User? Register here"));
//	    WebElement disCriptiction = driver.findElement(By.xpath("//p[@class='grey1']"));
//	    WebElement fullName = driver.findElement(By.xpath("//div[@class='col1']"));
//	    WebElement rediffLink = driver.findElement(By.xpath(""));
//	    WebElement rediffLink = driver.findElement(By.xpath(""));
	    
	    int count=0;
	    if(rediffLink.isDisplayed())
	    {
	    	count++;
	    	System.out.println("Rediff Link is avialble on web application");
	    }
	    else
	    {
	    	System.out.println("Rediff Link is not avialble on web application");
	    }
	    
	    if( rediffLogo.isDisplayed())
	    {
	    	count++;
	    	System.out.println("Rediff Logo is avialble on web application");
	    }
	    else
	    {
	    	System.out.println("Rediff Logo is not avialble on web application");
	    }
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
		

	}
}
