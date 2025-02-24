package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]")).click();//open all the dropdown options
//	//1) select the one option from the dropdown
	//driver.findElement(By.xpath("//input[@value=\"MySQL\"]")).click();
	//select the all the options from the dropdown list
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println(options.size());
	//select the unselected
	List<WebElement>wb=driver.findElements(By.xpath("//ul[contains(@class,\"multiselect-container dropdown-menu\")]//label/input"));
	for(WebElement opt:wb)
	{
		if(opt.isSelected())
		{
			opt.click();
		}
		else
		{
			opt.click();
		}
	}
	//print the elements in the dropdown
//	for(int i=0;i<options.size();i++)
//	{
//		String str=options.get(i).getText();
//		
//		System.out.println(str);
//	}
	//print the options
//	for(WebElement string:options)
//	{
//		System.out.println(string.getText());
//	}
	
	//select the choiced options
//	for(WebElement Str:options)
//	{
//		String op=Str.getText();
//		if(op.equals("Python") || op.equals("MySQL"))
//		{
//			Str.click();
//		}
//		
//	}
	
//driver.quit();
	}

}
