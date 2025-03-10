/*
 *Page Object Model without using PageFactory
 */
package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_Login {
	WebDriver driver;
	
	//Constructor
	public Pom_Login(WebDriver driver) {
		this.driver=driver;

	}
	//Locators
	By username_locator=By.xpath("//input[@placeholder=\"Username\"]");
	By password_locator=By.xpath("//input[@placeholder=\"Password\"]");
	By btn_locator=By.xpath("//button[@type='submit']");
	By logout_locator=By.xpath("//a[normalize-space()='Logout']");
	
	//Action Methods
	public void setusername(String name) {
		driver.findElement(username_locator).sendKeys(name);
		
	}
	public void setpassword(String pass)
	{
		driver.findElement(password_locator).sendKeys(pass);
	}
	public void clickbutton()
	{
		driver.findElement(btn_locator).click();
	}
	public void logout()
	{
		driver.findElement(logout_locator).click();
	}
}
