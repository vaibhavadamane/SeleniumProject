package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe7Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	    
	    //xpath by index
	    WebElement fullName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        fullName.sendKeys("Vaibhav Adamane");
        
        Thread.sleep(4000);
        driver.close();
	}

}
