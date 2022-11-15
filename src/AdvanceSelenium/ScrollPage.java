package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {
	
//  Scrolling the webpage by automation testing
	
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
//  First we Type casting between driver (object of the class) to javascriptExcutor as interface then use excuteScript method
	JavascriptExecutor scroll = ((JavascriptExecutor)driver);
	
//  Scroll the page as per x and y value By using "scrollBy method"
//	scroll.executeScript("window.scrollBy(0,1000)");

//  Scroll as per height of the page and reach to bottom by using "scrollTo method"
//	scroll.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
//  Scroll up to the particular area by using webelement of the that particular area's and By using the scrollIntoView method
	WebElement element = driver.findElement(By.xpath("//span[text()='Up to 60% off | Home furnishing picks from local shops']"));
	scroll.executeScript("arguments[0].scrollIntoView();",element);

	Thread.sleep(6000);
    driver.close();
	}

}
