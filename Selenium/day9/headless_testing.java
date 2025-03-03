package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_testing {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless=new");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	String act_title=driver.getTitle();
	if(act_title.equals("Your Storedes"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	driver.quit();

	}

}
