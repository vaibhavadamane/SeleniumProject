package SeleniumSimple;

//Here we get a Title and URL of our current page of application and comapred the title of application

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(5000);
	    
	    String appUrl = driver.getCurrentUrl();
	    System.out.println(appUrl);
        
	    String webtitle = driver.getTitle();
        System.out.println(webtitle);
        
	    String expTitle = "Instagram";
	    String actTitle = driver.getTitle();	
	    
	    if(expTitle.equals(actTitle)) //Comparison test case of title...
	    {
	    	System.out.println("Application title verification test case is passed");
	    }
	    else
	    {
	    	System.out.println("Application title verfication test case is failed");
	    }
	    
	    driver.close();
	}

}
