package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://demo.opencart.com/");
//	WebElement field6 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
//	field6.sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	//with multiple attributes
//	WebElement field5 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Username'][@name='username']")));
//	field5.sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	//and operator
//	WebElement field4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Username' and @name='username']")));
//	field4.sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	//or operator
//	WebElement field3 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Usernam' or @name='username']")));
//	field3.sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	//inner path Syntax (//a[text()='Name'])
//	WebElement field2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
//	field2.sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
//	boolean status=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//	System.out.println(status);
//	
//	//contains method xpath Syntax: //input[contains(@placeholder,'Sea')]
//	WebElement field =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'user')]")));
//	field.sendKeys("Admin");
//	
//	//start with function
//	WebElement field1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[start-with(@placeholder,'user')]")));
//	field1.sendKeys("Admin");
	
	//chained xpath
	boolean status=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	System.out.println(status);
	
	} 
	

}
