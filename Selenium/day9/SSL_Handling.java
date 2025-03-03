package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Handling {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);//accept ssl certificate
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.quit();
	

	}

}
