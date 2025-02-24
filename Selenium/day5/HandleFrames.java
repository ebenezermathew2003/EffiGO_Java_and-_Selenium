package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	//enter the text on the first frame 
	WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
	driver.switchTo().frame(frame1);//passed webelement
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
	driver.switchTo().defaultContent();//go back to the page
	
	//Frame 2
	WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Return");
	driver.switchTo().defaultContent();
	
	//Frame3
	WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hi");
	driver.switchTo().frame(0);// interacts with the inner iframe
	driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"]")).click();
	driver.switchTo().defaultContent();
	}

}
