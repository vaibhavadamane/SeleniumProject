package PopupPrograme;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser2 {

	public static void main(String[] args) throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	Set<String> windows = driver.getWindowHandles();//Store the windows
	Iterator<String> it = windows.iterator();//used for retrieval and store the windows into array
	String win[] = new String[2];
	for(int i=0;i<windows.size();i++)
	{
		win[i]=it.next();
	}
	
	driver.switchTo().window(win[0]);
	Thread.sleep(3000);
	driver.close();
	
	//Child Browser.
	driver.switchTo().window(win[1]);
	driver.manage().window().maximize();
	
	WebElement text = driver.findElement(By.xpath("//h1[text()='About me']"));
	String text1 = text.getText();
	System.out.println("Text = " + text1);
	
	WebElement img = driver.findElement(By.xpath("//img[@width='152']"));
	System.out.println(img.isDisplayed());
	
	WebElement textBox = driver.findElement(By.xpath("//input[@id='the7-search']"));
	textBox.sendKeys("Selenium");
	Thread.sleep(3000);
	driver.close();
	}

}
