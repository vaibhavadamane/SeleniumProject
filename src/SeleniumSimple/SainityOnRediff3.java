package SeleniumSimple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SainityOnRediff3 //This is also Dropdown Programe ,next Programe is Programe No.10
{  
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//
    driver.manage().window().maximize();
	driver.get("https://is.rediff.com/signup/register");
	    
	//We have to print date 8 Auguest 2022
	
	WebElement dayDropdown = driver.findElement(By.id("date_day"));
	WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='date_mon']"));
	WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
	
	Select s1 = new Select(dayDropdown);
	s1.selectByVisibleText("08");
	Select s2 = new Select(monthDropdown);
	s2.selectByVisibleText("AUG");
	Select s3 = new Select(yearDropdown);
	s3.selectByVisibleText("2020");
	
	//get all value of daydropdown
	List<WebElement> allDaydropdownOptions = s1.getOptions();
	System.out.println("Total Value persent in Day drop down = " + allDaydropdownOptions.size());//no.of value
	for(int i=0;i<allDaydropdownOptions.size();i++)//name of the all value
	{
		System.out.println(allDaydropdownOptions.get(i).getText());
	}
	System.out.println("Selected option in day drop down is = " +s1.getFirstSelectedOption().getText());//selected date print
	
	//get all value of maonth drop down
	List<WebElement> allmonthdropdownOptions = s2.getOptions();
	System.out.println("Total Value persent in month drop down = " + allmonthdropdownOptions.size());//no.of value
	for(int i=0;i<allmonthdropdownOptions.size();i++)
	{
		System.out.println(allmonthdropdownOptions.get(i).getText());
	}
	System.out.println("Selected option in month drop down is = " +s2.getFirstSelectedOption().getText());//seleted value
	
	//get all option of year drop down
	List<WebElement> allyeardropdownOptions = s3.getOptions();
	System.out.println("Total value persent in year drop down = " + allyeardropdownOptions.size()); 
	for(int i=0;i<allyeardropdownOptions.size();i++)
	{
		System.out.println(allyeardropdownOptions.get(i).getText());
	}
	System.out.println("Selected option in year drop down = " +s3.getFirstSelectedOption().getText());
	
	//check is our drop down is multiselectiable or not?
	System.out.println("Is Day drop down is multi selectiable = " +s1.isMultiple());//false
	System.out.println("Is Month drop down is multi selectiable = " +s2.isMultiple());//false
	System.out.println("Is Year drop down is multi selectiable = " +s3.isMultiple());//false
	
	Thread.sleep(2000);
	driver.close();
	}

}
