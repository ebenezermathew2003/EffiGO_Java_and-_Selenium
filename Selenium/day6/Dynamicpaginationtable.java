package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicpaginationtable {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
	driver.manage().window().maximize();
	WebElement usr=driver.findElement(By.xpath("//input[@id=\"input-username\"]"));
	usr.clear();
	usr.sendKeys("demo");
	WebElement pass=driver.findElement(By.xpath("//input[@id=\"input-password\"]"));
	pass.clear();
	pass.sendKeys("demo");
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	WebElement customer=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\" Customers\"]")));
	customer.click();
	//driver.findElement(By.xpath("//a[text()=\" Customers\"]")).click();
	driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	
	
//check the substring of the page
	String pages=driver.findElement(By.xpath("//div[contains(text(),\"Pages\")]")).getText();
	int total=Integer.parseInt(pages.substring(pages.indexOf("(")+1,pages.indexOf("Pages")-1));
	for (int i = 1; i <=5; i++) {
		if(i>1)
		{
			
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li/*[text()="+i+"]"));
			active_page.click();
			Thread.sleep(5000);
		}
		//reading the data from the table for customer name
		
		int rows=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr")).size();
		for (int r = 1; r <=rows; r++) {
		String name=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]/td[2]")).getText();
		String email=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]/td[3]")).getText();	
		System.out.println(name+"\t"+email+"\t");
		
		}
	}

	}
	
	

}
