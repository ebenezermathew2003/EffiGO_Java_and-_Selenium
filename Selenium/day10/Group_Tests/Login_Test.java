package day10.Group_Tests;

import org.testng.annotations.Test;

public class Login_Test {
@Test(priority = 0,groups = {"sanity"})
void loginbymobile() {
	System.out.println("login by mobile");
}
@Test(priority = 1,groups = {"sanity"})
void logibbyemail()
{
	System.out.println("login by email");
}
@Test(priority = 2,groups = {"sanity"})
void loginbyfacebook()
{
	System.out.println("Login by facebook");
}
}
