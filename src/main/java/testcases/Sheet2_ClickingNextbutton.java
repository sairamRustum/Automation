package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_ClickingNextbutton extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking Next button";
		testDescription="Checking the functionality of next button";
		testNodes="test";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC014";
		
		
	}
	
	@Test
	public void nextButton() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.next();
		
		
		
		
}
}