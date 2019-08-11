package com.leafBot.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeMethods;

import cucumber.api.java.en.Given;
import utils.ExcelUtils;

public class ProjectSpecificMethods extends SeMethods {

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return ExcelUtils.readExcelData(excelFileName);
	}	
 
  @BeforeMethod
  public void beforeMethod() {
	  node = test.createNode(testcaseName);
	  startApp(browser, "http://leaftaps.com/opentaps");
	
  }

  @AfterMethod
  public void afterMethod() {
	  quit();
  }
 
}
