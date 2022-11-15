package SeleniumSimple;
//xpath way....
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe6 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

    //	driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Vaibhav Adamane");
    
    //xpath by attribute
    WebElement yourName = driver.findElement(By.xpath("//input[@name='customerName']"));
	yourName.sendKeys("Vaibhav Adamane");
	
    //xpath by attribute
	WebElement moblieNumber = driver.findElement(By.xpath("//input[@type='tel']"));
	moblieNumber.sendKeys("8975688065");
	
	//xpath by text (use only for link)
    // driver.findElement(By.xpath("//a[text()='Conditions of Use']")).click();
	
	//xpath by contains
	WebElement email = driver.findElement(By.xpath("//input[contains(@autocomplete,'email')]"));
    email.sendKeys("vaibhavadamane2011@gmail.com");
    
    WebElement passworld = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
    passworld.sendKeys("sai@123");
    
    
    
    Thread.sleep(2000);
	driver.close();
	}

}
