package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_SocialmediaLink  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Facebbok navigation";
		testDescription="Verify whether facebook page navigation is proper or not";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC021";
		
		
	}
	
	@Test
	public void facebookpage() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.socialmedialinks()
			.fbnavigation()
			.newtab();
}
}