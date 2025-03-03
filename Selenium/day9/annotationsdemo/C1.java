package day9.annotationsdemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
@Test(priority=0)
void execute()
{
	System.out.println("Execute all the files in the system");
}
@BeforeTest
void before()
{
	System.out.println("Executed before test");
}

}
