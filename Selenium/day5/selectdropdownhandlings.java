package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdownhandlings {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement countryelement=driver.findElement(By.xpath("//select[@id=\"country\"]"));
	Select country=new Select(countryelement);//Select Class object is created to select from dropdown
	
	/*
	 * Three types of select methods
	 1)selectByVisibleText()
	 2)selectByvalue()
	 3)selectByIndex()
	 */
	country.selectByVisibleText("Japan");
	country.selectByValue("australia");
	country.selectByIndex(1);
	
	//capture all the options in the select
	List<WebElement>getelements=country.getOptions();
	System.out.println(getelements.size());
	
	//print the captured elemets using normal for loop
	for (int i = 0; i < getelements.size(); i++) {
		String str=getelements.get(i).getText();
		System.out.println(str);
		
	}
	//capture the elements using enhanced for loop
	for(WebElement element:getelements)
	{
		System.out.println(element.getText());
	}
	
	
	}

}
