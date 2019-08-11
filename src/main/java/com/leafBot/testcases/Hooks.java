package com.leafBot.testcases;

import com.leafBot.selenium.api.base.SeMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeMethods{
	
	@Before
	public void beforeScenario()
	{
		excelFileName="TC_001_LeafTaps_CreateLead";
		testcaseName="TC_001_LeafTaps_CreateLead";
		testcaseDec="Create Lead in the leaftaps application";
		author="Vishveshwar";
		category="SIT";
		browser="chrome";
		startReport();
		report();
		node = test.createNode(testcaseName);
		startApp(browser, "http://leaftaps.com/opentaps");
		
	}

	
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println(sc.getStatus());
		stopReport();
		quit();
	}
}
