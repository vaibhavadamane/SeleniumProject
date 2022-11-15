package PopupPrograme;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog4 {
	
//  Handaling the Alert Popup2 with two element.	

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert x = driver.switchTo().alert();
	Thread.sleep(4000);
	x.accept();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert y = driver.switchTo().alert();
	Thread.sleep(4000);
	y.accept();
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(4000);
	a.sendKeys("Vaibhav Adamane");
	a.accept();
    WebElement massage = driver.findElement(By.xpath("//p[@id='demo1']"));
	String text = massage.getText();
	System.out.println(text);
	Thread.sleep(4000);
	driver.close();
	
	}

}
