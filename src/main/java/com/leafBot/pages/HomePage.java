package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class HomePage extends ProjectSpecificMethods{
	
	RemoteWebDriver driver;
	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="CRM/SFA")
	WebElement eleCRMSFALink;
	@And("Click crmsfa link button")
	public MyHomePage clickCRMSFA()
	{
		click(eleCRMSFALink);
		return new MyHomePage(driver);
	}

}
