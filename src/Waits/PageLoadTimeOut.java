package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PageLoadTimeOut {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//PageLoadTimeOut wait
	    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(26));
//		driver.manage().timeouts().pageLoadTimeout(26,TimeUnit.SECONDS);//Here timeout is an interface and implement should be provided by broswer class.
//		driver.get("https://www.amazon.in/");
//      driver.close();
        
		//setScriptTimeOUt wait :- Same for the PageLoadTimeOut wait and useful for JavaScript Application.
		driver.manage().timeouts().setScriptTimeout(6,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.close();
		
		//ImplicitlyWait :- Example of this wait in AutoSuggession Program.
		
	
}
}