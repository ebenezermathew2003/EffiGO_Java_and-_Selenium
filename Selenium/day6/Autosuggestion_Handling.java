package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Handling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(5000);
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role=\"option\"]"));
	System.out.println(list.size());
	for (int i = 0; i < list.size(); i++) {
		if(list.get(i).getText().equals("selenium"))
		{
			list.get(i).click();
			System.out.println("selenium");
			break;
			
			
		}
		
		
	}
	}

}
