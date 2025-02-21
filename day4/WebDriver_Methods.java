package day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	//get(url)--opens webpage
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	//getTitle()--returns title of the page
	System.out.println(driver.getTitle());
	//getPageSource()
	//System.out.println(driver.getPageSource());
	//getWindowHandle--returns the id of single browser
	String str=driver.getWindowHandle();
	System.out.println(str);
	//getWindowHandles()-returns id of multiple browser
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	Set<String>s1=driver.getWindowHandles();
	System.out.println(s1);
	driver.quit();

	}

}
