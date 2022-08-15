package testCases;

import org.testng.annotations.Test;

public class GroupTestClass {
	@Test(groups = "sanity")
	public void method1() 
	{
		System.out.println("Method 1");
	}
	@Test(groups = "sanity")
	public void method2()
	{
		System.out.println("method 2");
	}
	@Test(groups="regression")
	public void method3()
	{
		System.out.println("method 3");
	}
    @Test(groups="regression")
    public void method4()
    {
    	System.out.println("method 4");
    }
    @Test(groups={"regression","sanity"})
    public void method5()
    {
    	System.out.println("method 5");
    }
    @Test(groups="sanity")
    public void method6()
    {
    	System.out.println("method 6");
    }

	
	
	
}
