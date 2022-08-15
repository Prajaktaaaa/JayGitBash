package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DashboardPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Ramesh']")private WebElement nickname;
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid; 
	@FindBy(xpath="//h4[text()='Ramesh Vitthalrao Kanchanpure']")private WebElement username;
	@FindBy(xpath="//div[text()='rameshkanchanpure@gmail.com'] ")private WebElement email;
	
	
	

	public DashboardPage() throws IOException 
	{
		PageFactory.initElements(driver,this);
		
	}
	public String  verifyNickname() 
	{
		return nickname.getText();
	}
	public  String verifyUserId() 
	{
		return userid.getText();
	}
	public String verifyUsername()
	{
		return username.getText();
	}
	public String verifyEmail() 
	{
		return email.getText();
	}
	}

	


