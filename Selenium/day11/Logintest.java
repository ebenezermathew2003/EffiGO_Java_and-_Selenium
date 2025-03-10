package day11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	void logintesting() throws InterruptedException
	{
		//Pom_Login log=new Pom_Login(driver);
		Pom_Login_Paging log=new Pom_Login_Paging(driver);
		log.setusername("Admin");
		log.setpassword("admin123");
		log.clickbutton();
		log.logout();
		
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}

}
