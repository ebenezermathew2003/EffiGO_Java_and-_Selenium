package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	//isDisplayed Method
	boolean imagestatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(imagestatus);
	
	//isEnabled() Method
	System.out.println(driver.findElement(By.xpath("//select[@id='customerCurrency']")).isEnabled());
	
	//isSelected() using radio button
	WebElement we=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement web=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("Befor selection");
	System.out.println(we.isSelected());
	System.out.println(web.isSelected());
	//after selecting radio button
	System.out.println("After selecting");
	web.click();
	System.out.println(we.isSelected());
	System.out.println(web.isSelected());
	
	//driver.quit();
	
	
	}

}
