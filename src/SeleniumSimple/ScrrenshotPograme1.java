package SeleniumSimple;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotPograme1 {
	
//    How to take a Screenshot (Current full screen and perticular area).
	
	static  WebDriver driver;
	
//	Screenshot of full current page IMD
	public static void takeScreenshotMethod1() throws Exception 
	{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo2.jpg");
    FileHandler.copy(source,dest);
	}
	
//	Take screenshot of full current page amazon
	public static void takeScrrenshot3() throws Exception
	{
    File sourse2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest2 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo5.jpg");
    FileHandler.copy(sourse2, dest2);
	}
	
//	Screenshot of particular area IMD
	public static void takeScreenshotMethod2() throws Exception
	{
	WebElement poster = driver.findElement(By.xpath("//div[@class='ipc-lockup-overlay__screen']"));
	File source1 = poster.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo3.jpg");
    FileHandler.copy(source1, dest1);
	}
	
//	Screenshot of particular area on amazon
	public static void takeScrrenshot4() throws Exception
	{
	WebElement lobo = driver.findElement(By.id("nav-logo-sprites"));
	File source3 = lobo.getScreenshotAs(OutputType.FILE);
	File dest3 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo6.jpg");  
	FileHandler.copy(source3, dest3);
	}
	
	public static void main(String[] args) throws Exception {
//	IMD
//	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
//  driver = new ChromeDriver();//
//  driver.manage().window().maximize();
//  driver.get("https://www.imdb.com/title/tt10648342/?ref_=ttls_li_i");
//  takeScreenshotMethod1();
//  takeScreenshotMethod2();
		
//	AMAZON	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
    driver = new ChromeDriver();//
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");	
    takeScrrenshot3();
    takeScrrenshot4();
     
    Thread.sleep(4000);
    driver.close();
}

}
