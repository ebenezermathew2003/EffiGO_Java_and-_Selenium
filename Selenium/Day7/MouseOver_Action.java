package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Action {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	
	WebElement desk=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act=new Actions(driver);
	//mouse over action
	act.moveToElement(desk).moveToElement(mac).click().perform();
	
	
	}

}
