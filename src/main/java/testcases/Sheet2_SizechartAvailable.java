package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_SizechartAvailable extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Display of size chart";
		testDescription="Verify if size chart is displayed or not";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void sizeChart() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.sizechart();
			
			
	}

	}

