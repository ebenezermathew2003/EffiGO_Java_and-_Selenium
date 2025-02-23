package day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) throws MalformedURLException {
	WebDriver driver=new ChromeDriver();
	URL myurl=new URL("https://demo.opencart.com/");
	driver.get("https://demo.opencart.com/"); //takes ony in string formate
	driver.navigate().to("https://demo.opencart.com/");//take in bith string and url object formate
	driver.navigate().to(myurl); //opened using url object
	
	driver.get("https://demo.opencart.com/");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}

}
