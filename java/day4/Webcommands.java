package day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webcommands {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//get(url) opens the web browser
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	//getTitle() 
	System.out.println(driver.getTitle());
	//getPageSource() --returns the DOM of the web page
	System.out.println(driver.getPageSource());
	//getWindowHandle --returns the id of the page
	String str=driver.getWindowHandle();
	System.out.println(str);
	//getWindowHandles --returns the id of multiple browser pages
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> str1=driver.getWindowHandles();
	System.out.println(str1);
	//driver.quit();
	}

}
