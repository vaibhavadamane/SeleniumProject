package PopupPrograme;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3 {
	
//  Handaling the Alert Popup2 with two element.	

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" http://demo.guru99.com/test/delete_customer.php");
		
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(4000);
	Alert a = driver.switchTo().alert();
//	a.dismiss();
    String text = a.getText();
    System.out.println(text);
	a.accept();	
	Thread.sleep(4000);
	String text1 = a.getText();
    System.out.println(text1);	
    a.accept();		
		
		
		
	Thread.sleep(4000);
	driver.close();
	}

}
