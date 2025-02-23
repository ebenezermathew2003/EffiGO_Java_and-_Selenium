package day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandles {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(50));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	WebElement link=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")));
	link.click();
	//Approach 1
	Set<String>s1=driver.getWindowHandles();
	List<String> s2=new ArrayList<String>(s1);
	String parent=s2.get(0);
	String child=s2.get(1);
	driver.switchTo().window(child);
	String secondtabtitle=driver.getTitle();
	System.out.println(secondtabtitle);
	
	//Approach 2 using loops for multiple browser pages
	for(String windowid:s1)
	{
		String str1=driver.switchTo().window(windowid).getTitle();
		if(str1.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
		}
	}
	driver.quit();

	}

}
