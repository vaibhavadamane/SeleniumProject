package Waits;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/explicit-wait");
	
	//Scenario-1
	/*WebElement alert = driver.findElement(By.xpath("//button[@id='alert']"));
	alert.click();	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	a.accept();*/
	
	//Scenario-2
	/*driver.findElement(By.xpath("//button[@id='populate-text']")).click();
	WebElement text = driver.findElement(By.xpath("//h2[@class='target-text']"));
	System.out.println("Old Text = " + text.getText());
	WebDriverWait wait = new WebDriverWait(driver,11);
	wait.until(ExpectedConditions.textToBePresentInElement(text,"Selenium Webdriver"));
	System.out.println("New Text = " + text.getText());*/
	
	//Scenario-3
	/*driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
	WebElement hiddenButton = driver.findElement(By.xpath("//button[@id='hidden']"));
	WebDriverWait wait = new WebDriverWait(driver,11);
	wait.until(ExpectedConditions.visibilityOfAllElements(hiddenButton));
	System.out.println("Visibility of the Button = " + hiddenButton.isDisplayed());*/
	
	//Scenario-4
	/*driver.findElement(By.xpath("//button[@id='enable-button']")).click();
	WebElement EnableButton = driver.findElement(By.xpath("//button[@id='disable']"));
	WebDriverWait wait = new WebDriverWait(driver,11);
	wait.until(ExpectedConditions.elementToBeClickable(EnableButton));
	System.out.println("Is disable button is active = " + EnableButton.isEnabled());*/
		
	//Scenario-5
	driver.findElement(By.xpath("//button[@id='checkbox']")).click();
	WebElement checkBox = driver.findElement(By.xpath("//input[@id='ch']"));
	WebDriverWait wait = new WebDriverWait(driver,11);
	wait.until(ExpectedConditions.elementToBeSelected(checkBox));
	System.out.println("Is CheckBox is selectable = " + checkBox.isSelected());
	
	
	
	
	driver.close();
}
}
