package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	//min slider
	
	WebElement min=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
	System.out.println("Location os slider "+min.getLocation());
	
	act.dragAndDropBy(min, 80, 293).perform();
	
	//max slider
	WebElement max=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
	System.out.println("Max Location "+max.getLocation());
	act.dragAndDropBy(max, -100, 293).perform();
	System.out.println(max.getLocation());
	
	
	
	

	}

}
