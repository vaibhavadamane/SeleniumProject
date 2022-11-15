package PopupPrograme;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

//  Handling a Alert Popup1.
	
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(4000);	
//	driver.switchTo().alert().accept();	(without creating reference variable)
	Alert a = driver.switchTo().alert();  //Here Alert is an Interface.
	String text = a.getText();
	System.out.println(text);
	a.accept();
	
		
		
		
		
		
		
	Thread.sleep(4000);	
	driver.close();	
	}
}
