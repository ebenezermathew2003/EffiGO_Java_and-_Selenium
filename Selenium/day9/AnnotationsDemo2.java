package day9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
@BeforeClass
void login()
{
	System.out.println("Login has done");
}
@Test(priority=1)
void search()
{
	System.out.println("Searching is happening");
}
@AfterClass()
void logout()
{
	System.out.println("Logout");
}
@Test(priority=2)
void advanced_search()
{
	System.out.println("This is advanced search");
}

}
