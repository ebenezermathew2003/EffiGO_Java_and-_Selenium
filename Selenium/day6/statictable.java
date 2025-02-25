package day6;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class statictable {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//find the no of table row in a table
	int row=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
	System.out.println("No of table row = "+row);
	
	int rows=driver.findElements(By.tagName("tr")).size();
	System.out.println(rows);
	
	//no of columns in a table
	int columns=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
	System.out.println(columns);
	
//	int rows=driver.findElements(By.tagName("th")).size();
//	System.out.println(rows);
	
	//capture data from the row and column
	
//	WebElement wb=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]"));
//	String str=wb.getText();
//	System.out.println(str);
	
//	//read the data from the table
//	System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price"+"\t");
//	for (int r = 2; r <=row; r++) {
//		
//		for (int c= 1; c<=columns; c++) {
//			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//			System.out.print(value+"\t");
//			
//		}
//		System.out.println();
//		
//	}
	
	//print books of Mukesh
	for (int r = 2;  r<=row; r++) {
		String author=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
		if(author.equals("Mukesh"))
		{
			String book=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
		System.out.println(book);
		}
		
	}
	//count the total price
	int total=0;
	for (int  r = 2; r <=row; r++) {
		
		String price=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]"))).getText();
				
		total=total+Integer.parseInt(price);
		
		
	}
	System.out.println(total);
	driver.quit();
	}
	
	

}
