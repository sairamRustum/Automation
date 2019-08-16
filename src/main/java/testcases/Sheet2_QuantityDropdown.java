package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_QuantityDropdown extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Display of units in quantity dropdown";
		testDescription="Verify if quantity dropdown can be clicked";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void quantitydropdown() throws AWTException{
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.quantity();
			
			
	}

	}


