package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class MyHomePage extends ProjectSpecificMethods {
	
	RemoteWebDriver driver;
	public MyHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	@And("Click Leads link")
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage(driver);
	}

}
