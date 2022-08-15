package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	public LoginPageTest() throws IOException {
		super();
		
	}
	LoginPage login ;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialization();
		 login = new LoginPage();
		
	}

	
	@Test
	public void verifyLoginPageTitleTest()
	{
		String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle = login.verifyLoginPageTitle();
		Assert.assertEquals(actTitle,expTitle);
		Reporter.log("Title = "+actTitle);
		
		
	}
	@Test
	public void verifyKiteLogoTest()
	{
		boolean value = login.verifyKiteLogo();
		Assert.assertEquals(value,true);
		Reporter.log("kite logo is"+value);
	}
    @Test
	public void verifyZerodhaLogo() 
	{
    	boolean value = login.verifyZerodhaLogo();
    	Assert.assertEquals(value,true);
    	Reporter.log("zerodha logo is"+value);
	} 
	@Test
	public void LoginZerodhaAccountTest() throws InterruptedException
	{
		login.LoginZerodhaAcc() ;
	}
	@AfterMethod
	public void exit() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.quit();
	}
	
	
	
}
