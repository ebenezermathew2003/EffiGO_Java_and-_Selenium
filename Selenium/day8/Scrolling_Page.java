package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Page {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//scroll down by pixel number
	
	js.executeScript("window.scrollBy(0,1000)","");
	System.out.println(js.executeScript("return window.pageYOffset;"));//print the pixel 
	
	//Scroll the page till the ellement is visible
	WebElement scroll=driver.findElement(By.xpath("//strong[normalize-space()='News']"));

	js.executeScript("arguments[0].scrollIntoView();",scroll);
	System.out.println(js.executeScript("return window.pageYOffset;", args));
	
	//scroll till end of the page.
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	Thread.sleep(3000);
	//scroll up to initial position
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	}
	

}
