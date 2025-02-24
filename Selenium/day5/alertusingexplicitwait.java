package day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertusingexplicitwait {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Thread.sleep(3000);
	Alert alert=mywait.until(ExpectedConditions.alertIsPresent());//capture alert
	alert.accept();
		

	}

}
