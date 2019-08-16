package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_ChooseaColor extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Choose a color for the product";
		testDescription="Verify if a color can be chosen";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void choosecolor() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosecolor();
			
			
	}

	}
