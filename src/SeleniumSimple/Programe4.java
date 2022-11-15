package SeleniumSimple;

//Here we use the Dimension and Postion of current page of application....

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
	Thread.sleep(5000);
	
	Dimension a = new Dimension(1000,2000);
	driver.manage().window().setSize(a);
	Thread.sleep(5000);
	
	Point b = new Point(100,300);
	driver.manage().window().setPosition(b);
	Thread.sleep(5000);
	
	driver.close();
	


	
	}

}
