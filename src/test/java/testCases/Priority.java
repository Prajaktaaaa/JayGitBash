package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
@BeforeMethod
public void setup() 
{
	System.out.println("Before method");
}

@Test(priority=-1)
public void method5() 
{
	System.out.println("Method 5");
}

@Test(priority =-100)

public void method2()
{
	System.out.println("method 2");
}
@Test(priority =0 )
public void method4()
{
	System.out.println("method 4");
}

@Test(priority =100)
public void method51()
{
	System.out.println("method 5");
}

}
