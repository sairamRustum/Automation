package testcases;



import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_ClickaProduct extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking a product";
		testDescription="Verifying the product link navigation";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void clickaProduct() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.verifyProduct();
			
			
	}

	}