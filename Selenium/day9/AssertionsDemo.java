package day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	void test()
	{
		Assert.assertNotEquals(123,345);
		Assert.assertTrue(1==1);
		Assert.assertFalse(1==2);
		Assert.assertEquals("Mt", "Mt");
		
	}

}
