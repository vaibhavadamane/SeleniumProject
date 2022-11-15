package PopupPrograme;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser1 {

	public static void main(String[] args) throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.aspsnippets.com/demos/1102/");
	
	//Open the popup by click the button
	driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
    Thread.sleep(5000);
    driver.close();
    //Due to Handle the popup/window one by one we can store it into Set Collection
     Set<String> windows = driver.getWindowHandles();    
    //By using the Universal cursor we can get the address of windows
     Iterator<String> it = windows.iterator();
     while(it.hasNext())
    {
      System.out.println(it.next());
    }
    
    //Now we can store the window into the String Array for separately handle it
    String win[] = new String[2];  //Create the Array
    for(int i=0;i<windows.size();i++)
    {
    	win[i]= it.next();
    	System.out.println(win[i]);
    }
    
    //Now we handle the window so we can switch into that window
    driver.switchTo().window(win[1]);
    driver.close();
    
    Thread.sleep(3000);
    driver.switchTo().window(win[0]);
    driver.close();
    }

}
