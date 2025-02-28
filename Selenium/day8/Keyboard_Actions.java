package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://text-compare.com/");
		
		
	
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Attributes");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//Ctrl + A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
		
		//Ctrl + C
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		//Ctrl+V
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		

	}

}
