package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_VerifyMSRPandVIPprice extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify MSRP and VIP price of a product";
		testDescription="Verifying the MSRP and VIP price of a product";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void verifyprice() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.verifymsrp()
			.verifyvip();
			
			
	}

	}