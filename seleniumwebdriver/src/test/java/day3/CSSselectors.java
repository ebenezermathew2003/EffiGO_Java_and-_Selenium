package day3;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CSSselectors {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//search by tag name syntax tag#id
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
	//locating search box with tag name without using it.Syntax : #id
	//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobiles");
	
	//tag class Syntax:tag.class
	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tab");
	//driver.quit ();

	}

}
