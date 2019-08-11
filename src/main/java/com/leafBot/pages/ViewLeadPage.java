package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	RemoteWebDriver driver;
	
	public ViewLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	@Then("Lead should be created successfully with firstname as (.*)")
	public ViewLeadPage verifyFirstName(String expectedText)
	{
		verifyExactText(eleFirstName, expectedText);
		return this;
	}
}
