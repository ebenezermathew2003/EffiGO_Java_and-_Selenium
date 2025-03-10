/*
 * Page Object Model By using PageFactory
 */
package day11;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login_Paging {
	WebDriver driver;
	
	//Constructor
	public Pom_Login_Paging(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//Mandatory because the driver is internally alloted for FindBy annotations

	}
	//Locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_click;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logouting;
//	By username_locator=By.xpath("//input[@placeholder=\"Username\"]");
//	By password_locator=By.xpath("//input[@placeholder=\"Password\"]");
//	By btn_locator=By.xpath("//button[@type='submit']");
	
	//Action Methods
	public void setusername(String name) {
		username.sendKeys(name);
		
	}
	public void setpassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void clickbutton()
	{
		btn_click.click();
	}
	public void logout()
	{
		logouting.click();
	}
}
