
package com.leafBot.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class TC_001_LeafTaps_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()
	{
		excelFileName="TC_001_LeafTaps_CreateLead";
		testcaseName="TC_001_LeafTaps_CreateLead";
		testcaseDec="Create Lead in the leaftaps application";
		author="Vishveshwar";
		category="SIT";
		browser="chrome";
	}

	
	@Test(dataProvider="fetchData")
	public void leafTapsCreateLead(String username,String password,
			String cname,String fname,String lname)
	{
		System.out.println("Create Lead");
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickSubmit()
		.verifyFirstName(fname);
	}
}
