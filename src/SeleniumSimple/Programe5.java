package SeleniumSimple;

// Here we use the locators like Tagname,Id,Name,Classname,linkText,Partial link text etc.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe5 {

	public static void main(String[] args) throws InterruptedException  {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    
    driver.findElement(By.tagName("input")).sendKeys("Vaibhav Adamane");
    driver.findElement(By.id("newpasswd")).sendKeys("8975688065");
    driver.findElement(By.id("newpasswd1")).sendKeys("8975688065");
    driver.findElement(By.id("mobno")).sendKeys("9370267048");
//    driver.findElement(By.linkText("terms and conditions")).click(); 
//    Thread.sleep(3000);
//    xpath by link
    driver.findElement(By.xpath("//a[text()='terms and conditions']")).click();
    Thread.sleep(4000);
    driver.findElement(By.partialLinkText("privacy")).click();
    Thread.sleep(3000);
    driver.close();
	}

}
