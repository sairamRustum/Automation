package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Incorrect_AddtoCart extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Add to cart is clicked without choosing the size and color";
		testDescription="Verify if add to cart works when size and color aren't chosen";
		testNodes="PDP";
		category="Smoke";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void addtocartIncorrect() throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.addtocart()
			.addtocartIncorrectmessage();
			
			
	}

	}

