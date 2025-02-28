package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	driver.manage().window().maximize();
	//upload single file
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Lenovo\\OneDrive\\Documents\\Sublime text\\2.c");
	if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]/li")).getText().equals("2.c"))
	{
		System.out.println("File is successfully uploaded");
	}
	else
	{
		System.out.println("no such file");
	}
	//upload multiple files
	String file1="C:\\Users\\Lenovo\\OneDrive\\Documents\\Sublime text\\1.c";
	String file2="C:\\Users\\Lenovo\\OneDrive\\Documents\\Sublime text\\2.c";
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	
	
	}

}
