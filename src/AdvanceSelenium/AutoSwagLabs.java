package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSwagLabs {
// Automate the SwagLabs URL 
	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	WebElement fullName = driver.findElement(By.id("user-name"));
	WebElement passWorld = driver.findElement(By.id("password"));	
	WebElement loginButton = driver.findElement(By.id("login-button"));	
	
	fullName.sendKeys("standard_user");
	passWorld.sendKeys("secret_sauce");
	loginButton.click();
	
	Thread.sleep(2000);
	WebElement dropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	Select s1 = new Select(dropDown);
	s1.selectByVisibleText("Price (low to high)");	
		
	WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));	
	addToCart.click();	
	WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	cartButton.click();
	WebElement checkOut = driver.findElement(By.id("checkout"));
	checkOut.click();	
	WebElement firstName = driver.findElement(By.id("first-name"));	
	WebElement lastName = driver.findElement(By.id("last-name"));	
	WebElement postalCode = driver.findElement(By.id("postal-code"));	
	firstName.sendKeys("Vaibhav");
	lastName.sendKeys("Adamane");
	postalCode.sendKeys("423602");
	Thread.sleep(3000);	
	WebElement continueButoon = driver.findElement(By.id("continue"));	
	continueButoon.click();
	WebElement finish = driver.findElement(By.id("finish"));	
	finish.click();
	Thread.sleep(3000);
	WebElement orderText = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
	String text = orderText.getText();
	System.out.println(text);
	WebElement mainMenu = driver.findElement(By.id("react-burger-menu-btn"));
	mainMenu.click();
	Thread.sleep(2000);
	WebElement logOut = driver.findElement(By.id("logout_sidebar_link"));
	logOut.click();
	Thread.sleep(3000);
	WebElement fullName1 = driver.findElement(By.id("user-name"));
	WebElement passWorld1 = driver.findElement(By.id("password"));
	fullName1.sendKeys("locked_out_user");
	passWorld1.sendKeys("secret_sauce");
	WebElement loginButton1 = driver.findElement(By.id("login-button"));
	loginButton1.click();
	WebElement error = driver.findElement(By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']"));
	String text1 = error.getText();
	System.out.println("When we input a invalid information that this error is show = ");
	System.out.println(text1);
	
	
	Thread.sleep(5000);	
	driver.close();	

	}

}
