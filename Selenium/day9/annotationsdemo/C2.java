package day9.annotationsdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
@AfterTest()
void after()
{
	System.out.println("After Test");
}
@Test(priority = 1)
void executed()
{
	System.out.println("The method is executed");
}

}
