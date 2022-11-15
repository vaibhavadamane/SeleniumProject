package PopupPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {
	
//  Handling the Hidden Popup by using Xpath becoz we inspect the element in hidden pupup webpage
	
	public static void main(String[] args) throws Exception {
	 
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    
    driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("Vaibhav2018@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vaibhav@123");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    
    
    Thread.sleep(5000);
    driver.close();
	}

}
