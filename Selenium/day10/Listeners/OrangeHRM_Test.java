package day10.Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM_Test {
WebDriver driver;
@BeforeClass
void setup()
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}
@Test(priority = 0)
 void imagetest() throws InterruptedException
 {
	Thread.sleep(5000);
	  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  Assert.assertEquals(status, true);
 }
@Test(priority = 1)
 void urlgett()
 {
	 Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
 }
@Test(priority = 2 , dependsOnMethods = {"urlgett"})
void title()
{
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
}
@AfterClass
void tear()
{
	driver.quit();
}


}
