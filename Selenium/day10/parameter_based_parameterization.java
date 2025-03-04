package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameter_based_parameterization {
	WebDriver driver;
@BeforeClass
@Parameters({"browser","url"})
void setup(String brow,String url) throws InterruptedException
{
	switch(brow.toLowerCase())
	{
	case "chrome":driver=new ChromeDriver(); break;
	case "edge":driver=new EdgeDriver();break;
	case "firefox":driver=new FirefoxDriver();break;
	default:System.out.println("no browser");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
}
@Test(priority=1)
void imagetest()
{
	boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	Assert.assertEquals(status, true);

}
@Test(priority = 2)
void testbox()
{
	boolean box=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	Assert.assertEquals(box, true);
}
@AfterClass
void tearup()
{
	driver.quit();
}

}
