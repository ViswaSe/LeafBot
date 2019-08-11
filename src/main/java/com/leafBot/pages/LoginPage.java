package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class LoginPage extends ProjectSpecificMethods {
	
	//RemoteWebDriver driver;
	public LoginPage()
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement eleUserName;
	@And("Enter the username as (.*)")
	public LoginPage enterUserName(String username)
	{
		clearAndType(eleUserName,username);
		return this;
	}
	
	@FindBy(id="password")
	WebElement elePassword;
	@And("Enter the password as (.*)")
	public LoginPage enterPassword(String password)
	{
		clearAndType(elePassword,password);
		return this;
	}
	
	@FindBy(className="decorativeSubmit")
	WebElement eleLoginButton;
	@And("Click on Login Button")
	public HomePage clickLogin()
	{
		click(eleLoginButton);
		return new HomePage(driver);
	}

}
