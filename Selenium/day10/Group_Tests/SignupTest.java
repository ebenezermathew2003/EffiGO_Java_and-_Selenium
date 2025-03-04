package day10.Group_Tests;

import org.testng.annotations.Test;

public class SignupTest {
@Test(priority = 0,groups = {"Regression"})
 void signupbyemail()
 {
	 System.out.println("signup by email");
 }
@Test(priority = 1,groups = {"Regression"})
 void signupbygmail()
 {
	 System.out.println("Signup by gmail");
 }
@Test(priority = 2,groups = {"Regression"})
 void signupbyfacebook() {
	 System.out.println("Signup by facebook");
 }

}
