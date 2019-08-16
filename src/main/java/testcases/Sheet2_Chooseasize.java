package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Chooseasize extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Choose a size for the product";
		testDescription="Verify if a size can be chosen";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void choosesize() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosesize();
			
			
	}

	}

