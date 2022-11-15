package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Method of chack the status of element like displayed,enabled,selected
public class Programe8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://mpsconline.gov.in/candidate/login");

	    WebElement regEmailorMoblieNO = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	    WebElement passworldBox = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	    
	    System.out.println(regEmailorMoblieNO.isDisplayed());//true
	    System.out.println(regEmailorMoblieNO.isEnabled());//true
	    System.out.println(regEmailorMoblieNO.isSelected());//false
	    
	    System.out.println(passworldBox.isDisplayed());//true
	    System.out.println(passworldBox.isEnabled());//false
	    System.out.println(passworldBox.isSelected());//false
	    
	    driver.close();
	}

}
