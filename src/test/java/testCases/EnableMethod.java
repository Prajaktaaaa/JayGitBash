package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EnableMethod extends BaseClass {
public EnableMethod() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
LoginPage login;
@BeforeMethod
public void setup() throws IOException
{
	initialization();
	login = new LoginPage();
}
@Test(enabled=false,invocationCount = 2)
public void verifyKiteLogoTest()
{
  boolean value = login.verifyKiteLogo();
  Assert.assertEquals(value,true);
  Reporter.log("Kite logo is "+ value);
}
	
@Test(enabled=true)
public void verifyZerodhaLogoTest()
{
	boolean value = (boolean) login.verifyZerodhaLogo();
	Assert.assertEquals(value,true);
	Reporter.log("ZerodhaLogo"+value);

}
@Test(enabled = true)
public void LoginZerodhaAcc() throws InterruptedException
{
	login.LoginZerodhaAcc();
	
}
@AfterMethod
public void exit() 
{
	driver.close();
}
	
}
