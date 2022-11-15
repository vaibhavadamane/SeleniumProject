package SeleniumSimple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SainityOnRediff2 {
//Hanadaling the dropedown and counting and prtiting of the list box..
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//
	    driver.manage().window().maximize();
	    driver.get("https://is.rediff.com/signup/register");
	    
	    WebElement dayDropdown = driver.findElement(By.id("date_day")); 
		Select a = new Select(dayDropdown);
		a.selectByIndex(5);
		Thread.sleep(2000);
	    a.selectByVisibleText("19");
		a.selectByValue("31");
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='Date_Year']")); 
		Select b = new Select(yearDropdown);
		b.selectByIndex(5);
		Thread.sleep(2000);
	    b.selectByVisibleText("1945");
	    b.selectByValue("2020");
		
		//Get all option persent in day list box
		
		 List<WebElement> alldayDropedownOptions = a.getOptions();
		 
//		 
//		 System.out.println (alldayDropedownOptions); //herre we get a xath of all value
		 
		 System.out.println("Total value = " +alldayDropedownOptions.size());//couting the value persent in list box
		 
//		 for(int i=0;i<alldayDropedownOptions.size();i++)  //we get all value in concole (for loop)
//		 {
//			 System.out.println(alldayDropedownOptions.get(i).getText());
//		 }
		 
		 for (WebElement value :  alldayDropedownOptions)  //for each loop
		 {
			 System.out.println(value.getText());
		 }
		  //which option u have selected in print in concole
		 System.out.println("Selected option in day drop down = " + a.getFirstSelectedOption().getText());
		 System.out.println("Selected option in year drop down = " + b.getFirstSelectedOption().getText());
		
		 
		 Thread.sleep(3000);
		driver.close();
	}

}
