package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void method5()
	{
		System.out.println("method 5");
		Assert.assertEquals("java","java","If fail then display");
		System.out.println("Method 5 after assertion");
		
	}
}
