package day2;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class locatorsdemo {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("search")).sendKeys("Tab");
	
	boolean displaystatus=driver.findElement(By.id("logo")).isDisplayed();
	System.out.println(displaystatus);
	
	driver.findElement(By.partialLinkText("Soft")).click();
//	driver.findElement(By.linkText("Software")).click();
	driver.findElement(By.linkText("Mobiles")).click();
	try {
	List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
	System.out.println(+headerlinks.size());
	}
	catch(Exception e)
	{
		System.out.println("Error in accessing");
	}
	List<WebElement> headerlinks1=driver.findElements(By.tagName("a"));
	System.out.println(headerlinks1.size());
	
	List<WebElement>links=driver.findElements(By.tagName("img"));
	System.out.println(links.size());
	
	driver.quit();
	}

}
