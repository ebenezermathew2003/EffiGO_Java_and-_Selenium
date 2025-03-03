package day9;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capture_screenshot {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//Full Page ScreenShot
	TakesScreenshot ts=(TakesScreenshot)driver;
	File SourceFile=ts.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullsnapshot.png");
	SourceFile.renameTo(targetfile);//copy sourcefile to target file
	
	//Capture the screenshot from the particular section
	WebElement wb=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	File source=wb.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\screenshots\\particularsnapshot.png");
	source.renameTo(target);
	
	//capture the specific web element
	WebElement logo=driver.findElement(By.xpath("//div[@class=\"header-logo\"]//img"));
	File sources=logo.getScreenshotAs(OutputType.FILE);
	File targets=new File(System.getProperty("user.dir")+"\\screenshots\\specificelement.png");
	sources.renameTo(targets);
	
	driver.quit();
	
	}

}
