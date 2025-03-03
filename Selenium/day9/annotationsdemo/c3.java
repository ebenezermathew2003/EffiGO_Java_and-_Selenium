package day9.annotationsdemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
@Test(priority=3)
void test3()
{
	System.out.println("Executed in test3");
}
@BeforeSuite
void before()
{
	System.out.println("Before Suite Execution");
}
@AfterSuite
void after()
{
	System.out.println("After suite execution");
}
}
