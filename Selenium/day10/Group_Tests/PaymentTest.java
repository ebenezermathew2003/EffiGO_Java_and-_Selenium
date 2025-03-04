package day10.Group_Tests;

import org.testng.annotations.Test;

public class PaymentTest {
@Test(priority = 0,groups = {"sanity", "Regression","functional"})
 void payinRupees()
 {
	 System.out.println("Pay in Rupees");
 }
@Test(priority = 1,groups = {"sanity", "Regression","functional"})
 void payinDoller()
 {
	 System.out.println("Pay in Dollers");
 }

}
