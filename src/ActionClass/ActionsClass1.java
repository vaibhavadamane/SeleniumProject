package ActionClass;

// By Using the Actions class Handle the Textbox or Listbox 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass1 {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
    WebElement moblieNumber = driver.findElement(By.xpath("//input[@id='user-number']"));
    WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email_id']"));
    WebElement button = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
	moblieNumber.sendKeys("8975688065");
	emailAddress.sendKeys("Vaibhav2018@gmail.com");
	button.click();
	Thread.sleep(2000);
	
//  Occupation DropDown	
    WebElement occuDropDown = driver.findElement(By.xpath("//button[contains(text(),' Select Occupation')]"));
	Actions a = new Actions(driver);
	a.moveToElement(occuDropDown).click().build().perform();
	
//  Getting the all Options present in the Listbox by using the for loop.	
	for(int i=0;i<=2;i++) // here i<=0,in that place government option present so which option we select is decided by the condition. 
	{
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
	}
    a.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(3000);
    
//  Country DropDown	
	WebElement country = driver.findElement(By.xpath("//button[text()='India']"));
	Actions b = new Actions(driver);
	b.moveToElement(country).click().build().perform();
	
	for(int i=0;i<=1;i++)//other 
	{
		b.sendKeys(Keys.DOWN).build().perform();
	}
	b.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	
//  Security Question	
	WebElement secQueDropDown = driver.findElement(By.xpath("//button[contains(text(),'What is your pet name?')]"));
	Actions c = new Actions(driver);
	c.moveToElement(secQueDropDown).click().build().perform();
	
	for(int i=0;i<=7;i++)//where did you meet first your spouses?
	{
		c.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
	}
    c.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(5000);
	driver.close();
	}

}
