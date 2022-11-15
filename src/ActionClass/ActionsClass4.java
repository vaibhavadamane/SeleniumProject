package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass4 {

//  dragAndDrop method of Actions Class.	
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");	
		
		WebElement rupess1 = driver.findElement(By.xpath("//a[text()=' 5000 '] "));
		WebElement rupess2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amount1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement amount2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement account1 = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement account2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(rupess1).clickAndHold().moveToElement(amount1).release().build().perform();
		Thread.sleep(2000);
		a.moveToElement(rupess2).clickAndHold().moveToElement(amount2).release().build().perform();
		
		//By another way
		Thread.sleep(2000);
		a.dragAndDrop(bank, account1).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(sales, account2).build().perform();
		
		WebElement text = driver.findElement(By.xpath("//a[text()='Perfect!']"));
	    String x = text.getText();
	    System.out.println(x);
		
	    String excptedResult = "Perfect!";
	    String acctulResult = text.getText();
	    if(excptedResult.equals(acctulResult))
	    {
	    	System.out.println("Data filled Correctly");
	    }
	    else
	    {
	    	System.out.println("Incomplete Data");
	    }
	    
		Thread.sleep(5000);
		driver.close();

	}

}
