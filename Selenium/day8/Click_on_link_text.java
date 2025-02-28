package day8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_on_link_text {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reg_link=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		
		Actions act=new Actions(driver);
		//Ctrl+reg_link
		act.keyDown(Keys.CONTROL).click(reg_link).keyUp(Keys.CONTROL).perform();
		//switch to second tab
		List<String> str=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(str.get(1));
	}
          
}                                                                                                    
