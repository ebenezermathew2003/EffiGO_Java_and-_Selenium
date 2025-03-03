package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("Login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advanced search");
	}

	

}
