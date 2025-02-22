package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	//isDisplayed
	boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(status);
	//isEnabled
	boolean status1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	System.out.println(status1);
	WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("Before selecting");
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	//after selecting female button
	System.out.println("After selecting female button");
	female.click();
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	driver.quit();
	}

}
