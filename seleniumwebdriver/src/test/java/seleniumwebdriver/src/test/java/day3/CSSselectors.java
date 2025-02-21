package day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CSSselectors {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//search by tag name syntax tag#id
	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
	//locating search box with tag name without using it.Syntax : #id
	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobiles");
	
	//tag class Syntax:tag.class
	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tab");
	//without using tag name Synatx:.class
	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tab");
	driver.quit ();
	//locate using attribute value Synatx:tag[attribute="Value"]
	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
	//locate using the tag,class and attribute Syntax:tag.class[attribute='Value']
	driver.findElement(By.cssSelector("input.form-control.form-control-lg[placeholder='Search']")).sendKeys("Tab");
	
	//driver.findElement(By.cssSelector("input.oxd-input[placeholder='Password']")).sendKeys("Admin123");
	}

}
