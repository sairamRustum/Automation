package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_ClickingSortBy extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking SortBy dropdown";
		testDescription="Checking the functionality of Sort by dropdown";
		testNodes="test";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC013";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void sortBy(String text) throws AWTException  {
		
		new HomePage_RRS()
		.searchbrands()
		.rgearbrand()
		.clickSort(text);
		
		
	}
}