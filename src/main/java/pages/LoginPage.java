package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(xpath="//input[@label='User ID']")private WebElement useridTextBox;
	@FindBy(xpath="//input[@type='password']")private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn; 
	@FindBy(xpath="//Input[@Id=\'pin\']")private WebElement pin;
	@FindBy(xpath="//img[@alt='Kite']")private WebElement KiteLogo; 
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement ZerodhaLogo;	
	@FindBy(xpath="//button[@class=\'button-orange wide\']")private WebElement ContinueBtn;
	
	public LoginPage()throws IOException 
	{
		PageFactory.initElements(driver,this);
	}

	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyKiteLogo() 
	{
		 return KiteLogo.isDisplayed();
	}
	
	public boolean verifyZerodhaLogo()
	{
		return ZerodhaLogo.isDisplayed();
	}
	public void LoginZerodhaAcc() throws InterruptedException 
	{
//		useridTextBox.sendKeys(prop.getProperty("userid"));
//		Thread.sleep(2000);
//		passwordTextBox.sendKeys(prop.getProperty("password"));
//		Thread.sleep(2000);
//		loginBtn.click();
//		Thread.sleep(2000);
//		pin.sendKeys(prop.getProperty("pin"));
//		Thread.sleep(2000);
//		ContinueBtn.click();
//		Thread.sleep(2000);
//		useridTextBox.sendKeys("RCZ545");
//		Thread.sleep(2000);
//		passwordTextBox.sendKeys("Smeet@666");
//		Thread.sleep(2000);
//		loginBtn.click();
//		Thread.sleep(2000);
//		pin.sendKeys("112233");
//		Thread.sleep(2000);
//		ContinueBtn.click();
//		Thread.sleep(2000);
}

	}

