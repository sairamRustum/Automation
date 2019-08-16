package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_VisibilityofGetthisPriceLink  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Visibility of get this link";
		testDescription="Verifying the visibility of get this link";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void getthisPrice() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.getthispricelink();
			
			
	}

	}