package SeleniumSimple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


// Methods of Webelement and Handling Dropedown/listbox

public class Programe9AutomateRediff {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");     
	WebDriver driver = new ChromeDriver();
	    
	driver.manage().window().maximize();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

	WebElement fullNameBox = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[1]"));
	WebElement rediffMailId = driver.findElement(By.xpath("(//input[@onblur='fieldTrack(this);'])[2]"));
	WebElement passworld = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]"));
	WebElement rePassworld = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[2]"));
	WebElement alterMailId = driver.findElement(By.xpath("(//input[contains(@name,'altemail')])[1]"));
//	WebElement cheakBox = driver.findElement(By.xpath("(//input[contains(@name,'altemail')])[2]"));
	WebElement moblieNumber = driver.findElement(By.id("mobno"));
	WebElement genderMale = driver.findElement(By.xpath("//input[@value='m']")); //for male
	WebElement genderFemale = driver.findElement(By.xpath("//input[@value='f']"));  //for female
	WebElement captcha = driver.findElement(By.xpath("//input[@style='width:183px;']")); 
	
	fullNameBox.sendKeys("Vaibhav Adamane");
	rediffMailId.sendKeys("Vaibhavadamane2029");
	passworld.sendKeys("Pass@1999");
	rePassworld.sendKeys("Pass@1999");
	alterMailId.sendKeys("Vaibhavadamane2000@rediff.com");
//	cheakBox.click();
	moblieNumber.sendKeys("8975688065");
	System.out.println("Before click = " + genderMale.isSelected());
	genderMale.click();
	System.out.println("After click =" + genderMale.isSelected());
	Thread.sleep(2000);
	genderFemale.click();
	captcha.sendKeys("Hye bhau");
	
	//Get Text method
	WebElement createAccountlebel = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")); 
	String lebel1 = createAccountlebel.getText();
	System.out.println(lebel1);
	
	//Handaling Dropdown/list Box
	WebElement dayDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]")); 
	Select s = new Select(dayDropdown);
	s.selectByVisibleText("18");
	s.selectByIndex(8);
	s.selectByValue("10");
	
	Thread.sleep(2000);
	WebElement monthDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[3]")); 
	Select a = new Select(monthDropdown);
	a.selectByIndex(5);
	a.selectByVisibleText("APR");
	a.selectByValue("11");
	
	Thread.sleep(2000);
	WebElement yearDropdown = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[4]")); 
	Select b = new Select(yearDropdown);
	b.selectByIndex(5);
    b.selectByVisibleText("2017");
	b.selectByValue("2014");
    
    Thread.sleep(2000);
    WebElement countryDropdown = driver.findElement(By.id("country")); 
	Select c = new Select(countryDropdown);
	c.selectByIndex(2);
	Thread.sleep(2000);
    c.selectByVisibleText("Nepal");
	c.selectByValue("99");
    
    Thread.sleep(2000);
    WebElement cityDropdown = driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']")); 
	Select d = new Select(cityDropdown);
	d.selectByIndex(2);
	Thread.sleep(2000);
    d.selectByVisibleText("Mumbai");
	d.selectByValue("Cochin");
	
//	WebElement moblieNoDropeDown = driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']"));
//    Select e = new Select(moblieNoDropeDown);
//    e.selectByIndex(3);
//    e.selectByVisibleText("China(+86)");
	
//	WebElement tandcLink= driver.findElement(By.linkText("terms and conditions"));
//    tandcLink.click();
//    
//    WebElement privatePolicy= driver.findElement(By.partialLinkText("privacy policy"));
//    privatePolicy.click();
    
//	WebElement createButton = driver.findElement(By.xpath("//input[@id='Register']")); 
//    createButton.click();
    
    
    if(cityDropdown.isSelected())
    {
    	System.out.println("citydropdown is working");
    }
    else
    {
    	System.out.println("citydropdown is not working");
    }
    Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	}

}
