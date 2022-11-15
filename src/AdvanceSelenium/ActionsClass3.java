package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass3 {

//  By use Of the Action Class Method "clickAndHold" and "dragAndDrop" and "Release"	
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");	
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions img = new Actions(driver);
		
		//Here we use the clickAndHold method and release method
		Thread.sleep(2000);
		img.moveToElement(image1).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		img.moveToElement(image2).clickAndHold().moveToElement(trash).release().build().perform();
		
		//Here we can use dragAndDrop method
		Thread.sleep(2000);
		img.dragAndDrop(image3, trash).build().perform();
		Thread.sleep(2000);
		img.dragAndDrop(image4, trash).build().perform();
		
		//Recycling the dragAndDrop images
		WebElement recycleimg1 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[1]"));
		WebElement recycleimg2 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[2]"));
		WebElement recycleimg3 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[3]"));
		Thread.sleep(2000);
		recycleimg1.click();
		Thread.sleep(2000);
		recycleimg2.click();
		Thread.sleep(2000);
		recycleimg3.click();

		Thread.sleep(4000);
		driver.close();
	}

}
