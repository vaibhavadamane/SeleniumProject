package SeleniumSimple;


import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

    public class ScrrenshotPograme2 {
	
	static WebDriver driver;
	
//  Taking a Screenshot of full scrolling Webpage Due to this we use the GekoDriver(FireFox) and  got a Date and time of screenshots.	
	
	public static String getDateTime()
	{
	Date d = new Date(0);
 // System.out.println(d.toString());
	return d.toString(); // toString() method will convert date into string
    }
	
	public static void fullScreenshot1() throws Exception
	{
    String currentDate = getDateTime();//when we call the getdateandTime method that time it will date as return type and store into currentDate variable or object.
    File source1 = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	File dest1 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo9 "+currentDate+".jpg");
	FileHandler.copy(source1,dest1);
	}
	
	public static void fullScreenshot2() throws Exception 
	{
	File source2 = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	File dest2 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo10.jpg");
	FileHandler.copy(source2, dest2);
	}
	public static void main(String[] args) throws Exception {
	
    System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
	
//  Current page full screen page Screenshots.
//  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  File dest = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Screenshot/Photo7.jpg");
//  FileHandler.copy(source, dest);
//  fullScreenshot1();  
//	getDateTime();
	fullScreenshot2();
    Thread.sleep(5000);
    driver.quit();
	}
	

}
