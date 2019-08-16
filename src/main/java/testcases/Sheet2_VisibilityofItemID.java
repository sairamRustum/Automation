package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_VisibilityofItemID extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Visibility of item ID link";
		testDescription="Verifying the visibility of item ID link";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void visibilityofItemID() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.itemid();
			
			
	}

	}