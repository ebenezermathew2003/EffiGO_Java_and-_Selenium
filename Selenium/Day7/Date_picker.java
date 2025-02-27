package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	//switch to frame.
	driver.switchTo().frame(0);
	
	//Using send keys method
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/20/2025");//mm/dd/yyyy
	
	//Using Date picker
	//expected date and month
	String month="May";
	String year="2025";
	String date="1";
	
	driver.findElement(By.xpath("//input[@id='datepicker']"));
	while(true)
	{
	String currentmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
	String currentyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	
	if(currentmonth.equals(month) && currentyear.equals(year)) {
		break;
	}
	driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();//forward arrow/next button
	
	}
	//select the date
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td/a"));
	for (WebElement dt : dates) {
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
		}
		
	}
	}
	
	

}
