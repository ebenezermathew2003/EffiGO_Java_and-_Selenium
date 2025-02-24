package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxes {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	List<WebElement>checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	//1) normal loop approach
	for (int i = 0; i < checkbox.size(); i++) {
		checkbox.get(i).click();
		
	}
	//2)Enhanced loop Approach
	for(WebElement checkboxes:checkbox)
	{
		checkboxes.click();
	}
	//Selective last 3 checkboxes based on our choice
	for (int i = 4; i < checkbox.size(); i++) {
		checkbox.get(i).click();
		
		
	}
	//4)select 4 checkboxes
	for (int i = 0; i < checkbox.size()-4; i++) {
		checkbox.get(i).click();
		
	}
	//5)unselect the selected checkboxes
	for (int i = 0; i < checkbox.size()-4; i++) {
		checkbox.get(i).click();
		Thread.sleep(3000);
		
	}
	for (int i = 0; i < checkbox.size(); i++) {
		if(checkbox.get(i).isSelected())
		{
			checkbox.get(i).click();
		}
		
	}

}
}
