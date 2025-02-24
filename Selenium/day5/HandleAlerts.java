package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//Normal Alert Acception and get the alert text
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Thread.sleep(2000);
	Alert myalert=driver.switchTo().alert();
	System.out.println(myalert.getText());
	myalert.accept();
	
	//2)Confirmation alert-OK and Cancel
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Thread.sleep(3000);
//	driver.switchTo().alert().accept();//accept alert using close button
	driver.switchTo().alert().dismiss();//cancel the alert message

	//Prompt Alert which having message box
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(3000);
	Alert promptalert=driver.switchTo().alert();
	promptalert.sendKeys("Welcome");
	//promptalert.accept();
	promptalert.dismiss();
	}

}
