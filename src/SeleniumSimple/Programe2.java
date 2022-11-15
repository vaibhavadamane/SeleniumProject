package SeleniumSimple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This programe we use the Navigate method for get,forword,refresh the brower....
//and also get title for browser page by using getTitle method...



public class Programe2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://paytm.com/");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    String title1 = driver.getTitle();   //get title method
	    System.out.println(title1);
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
	    String title3 = driver.getTitle();
	    System.out.println(title3);
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.netflix.com/in/");
	    String title4 = driver.getTitle();
	    System.out.println(title4);
	    Thread.sleep(5000);
	    driver.navigate().back();//amazon
	    String title5 = driver.getTitle();
	    System.out.println(title5);
	    Thread.sleep(5000);
	    driver.navigate().forward();//netflix
	    String title6 = driver.getTitle();
	    System.out.println(title6);
	    Thread.sleep(5000);
	    driver.navigate().refresh();//netflix
	    String title7 = driver.getTitle();
	    System.out.println(title7);
	    Thread.sleep(5000);
	    driver.close();
	    
	    
	}

	}


