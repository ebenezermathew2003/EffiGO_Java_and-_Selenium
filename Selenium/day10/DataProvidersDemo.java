package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Data Provider Parameterization Annotation
public class DataProvidersDemo {
	WebDriver driver;
@BeforeMethod
void beforetest()
{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		
	}
@Test(dataProvider = "pass")
void login(String email,String password) throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	if(status==true)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);

	}
	else
	{
		Assert.fail();
	}
	
}
@AfterMethod
void teardown() {
	driver.close();
}
@DataProvider(name="pass",indices = {0,1})
Object[][] logindata()
{
	Object data[][] = {
			{"ramesh123456@gmail.com","test@123"},
			{"suresh@gmail.com","test"},
			{"john@gmail.com","test@123"},
			{"xyz@gmail.com","test@123"},
			
	};
	return data;
}

}

