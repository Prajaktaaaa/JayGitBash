package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;

public class DashBoardPageTest extends BaseClass {
	
	public DashBoardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	DashboardPage dash;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		 initialization();
		dash = new DashboardPage();
		login = new LoginPage();
		login.LoginZerodhaAcc();
	}
	
	@Test
	public void  verifyNicknameTest() throws InterruptedException
	{
		String value =dash.verifyNickname();
		Thread.sleep(2000);
		Assert.assertEquals(value,"Ramesh");
		
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
