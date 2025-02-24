package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hiddendropdown {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement usrname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	usrname.sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	WebElement leave=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-main-menu-item active']")));
//	leave.click();
	WebElement element=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave']")));
	element.click();
	}

}
