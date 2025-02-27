package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouserightclick_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		
		//right click
		act.contextClick(button).perform();
		
		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

		Thread.sleep(5000);
	// accept the alert
		driver.switchTo().alert().accept();
	}
	

}
