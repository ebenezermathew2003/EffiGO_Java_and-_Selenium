package day1;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/*
 Test Case
 1.Launch Browser(chrome)
 2.OpenUrl https://demo.opencart.com/
 3.Validate title should be "Your Store"
 4)close browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	String act_title=driver.getTitle();
	String url=driver.getCurrentUrl();
	//String page=driver.getPageSource();
	//System.out.println("Page source is "+page);
	System.out.println("Current url is  "+url);
	if(act_title.equals("Your Store"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.navigate().to("https://saw-erp.in/");
	
	driver.navigate().back();
	driver.navigate().refresh();
	//driver.navigate().forward();
	driver.quit();
	}
}
