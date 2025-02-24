package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().window().maximize();
	
	//self element
	String text=driver.findElement(By.xpath("//a[contains(text(),'Clean Science & Tech')] /self::a")).getText();
	System.out.println("Self: "+text);
	//parent
	String text1=driver.findElement(By.xpath("//a[contains(text(),'Avantel Ltd.')]/parent::td")).getText();
	System.out.println("Using parent: "+text1);
	//child
	List <WebElement> child=driver.findElements(By.xpath("//a[contains(text(),\"HCL Technologies\")]/ancestor::tr/child::td"));
	System.out.println(child.size());
	//ancestor
	String ancestor=driver.findElement(By.xpath("//a[contains(text(),\"Blue Dart Expres\")]/ancestor::tr")).getText();
	System.out.println("Using Ancestor: "+ancestor);
	//descendant
	List<WebElement>descendant=driver.findElements(By.xpath("//a[contains(text(),\"JM Financial Ltd.\")]/ancestor::tr/descendant::*"));
	System.out.println("Descendent size: "+descendant.size());
	//following
	List<WebElement> following=driver.findElements(By.xpath("//a[contains(text(),\"HCL Technologies\")]/ancestor::tr/following::tr"));
	System.out.println("Following element size: "+following.size());
	//following-siblings
	List<WebElement> follow_siblings=driver.findElements(By.xpath("//a[contains(text(),\"HCL Technologies\")]/ancestor::tr/following-sibling::tr"));
	System.out.println("Size of the following-siblings: "+follow_siblings.size());
	
	//precedings
	List<WebElement>preceding=driver.findElements(By.xpath("//*[contains(text(),\"LIC\")]/ancestor::tr/preceding::tr" ));
	System.out.println("Preceding: "+preceding.size());
	//preceding-siblings
	List<WebElement> pre_sib=driver.findElements(By.xpath("//*[contains(text(),\"LIC\")]/ancestor::tr/preceding-sibling::tr"));
	System.out.println("preceding-siblings "+pre_sib.size());
	driver.quit();
	}

}
