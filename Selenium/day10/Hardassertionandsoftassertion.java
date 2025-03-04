package day10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassertionandsoftassertion {
//	@Test
//	void hardassertion()
//	{
//		System.out.println("Testing");
//		Assert.assertEquals(1, 2);
//		System.out.println("Testing");
//	}
	@Test
	 void softassertion()
	 {
		 System.out.println("Testing" );
		 SoftAssert asserted=new SoftAssert();
		 asserted.assertEquals(1,2);
		 System.out.println("Testing");	
		 asserted.assertAll();//Mandatory after softassertion
		 
	 }
}
