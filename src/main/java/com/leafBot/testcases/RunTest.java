package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/main/java/features/LeaftapsLeads.Feature",
		glue= "com.leafBot")

public class RunTest extends ProjectSpecificMethods{
	
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

}
