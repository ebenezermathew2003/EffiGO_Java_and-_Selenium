package day8;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		/*
		 * This element is in iframe - //input[@id='field1']
		 * This element is in iframe - //input[@id='field2']
		 * This element is in iframe - //button[@ondblclick='myFunction()']
		 */
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	
		box1.clear();
		box1.sendKeys("Welcome");
		
		//Action Button to be performed
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation
		String str=box1.getAttribute("value");
		System.out.println(str);
		if(str.contains(box2.getText()))
		{
			System.out.println("Same text present");
		}
		else
		{
			System.out.println("Not same");
		}
		
		
	}

}
