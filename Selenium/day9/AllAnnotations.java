package day9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
@BeforeSuite
void before()
{
	System.out.println("Before suite");
}
@AfterSuite
void after()
{
	System.out.println("After suite");
}
@BeforeClass
void beforeclass()
{
	System.out.println("Before Class");
}
@AfterClass
void afterclass()
{
	System.out.println("After class");
}
@BeforeMethod
void beforemmethod()
{
	System.out.println("Before method");
}
@AfterMethod
void aftermethod()
{
	System.out.println("After method");
}
@Test(priority = 1)
void process()
{
	System.out.println("Procesing");
}
@Test(priority=2)
void execute()
{
	System.out.println("Executed");
}
@BeforeTest
void test1()
{
	System.out.println("Before test");
}
@AfterTest
void aftertest() {
	System.out.println("after test");
	
}

}
