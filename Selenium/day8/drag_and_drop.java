package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	
	WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
	
	act.dragAndDrop(washington, usa).perform();

	}

}
