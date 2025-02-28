package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptmethods {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//Used when Element Intercepted Exception Occurs
	WebElement wb=driver.findElement(By.xpath("//input[@id='name']"));
	//passing the text to inputbox-alternate of sendkeys()
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('value','Mathew')", wb);
	
	//click Action
	WebElement button=driver.findElement(By.xpath("//input[@id='male']"));
	js.executeScript("arguments[0].click()",button );
	}

}
