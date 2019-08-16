package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_PaywithGiftCard extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orderwithgiftcard";
		testDescription="Verify the orders flow with gift card";
		testNodes="PDP";
		category="Regression";
		authors="sairam";
		browserName="chrome";
		dataSheetName="giftcard";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void orderswithgiftcard(String xpath,String email, String xp,String number, String firstname, String lname, String address, String cityname,String state, String zipcode,String gift,String pin) throws AWTException  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosecolor()
			.choosesize()
			.addtocart()
			.viewCart()
			.verifycarttitle()
			.guestbutton()
			.signinbutton()
			.paypalbutton()
			
			.clickGuest()
			.withoutvipbutton()
			.withvipbutton()
			.clickWithoutVip()
			.enteremail(xpath,email)
			.enterphonenumber(xp,number)
			.firstnamefield(firstname)
			.lastnamefield(lname)
			.enteraddress(address)
			.cityfield(cityname)
			.statefield(state)
			.zipfield(zipcode)
			.giftcardexpand()
			.entergiftcard(gift)
			.enterpinnumber(pin)
			.clickapply()
			.revieworder()
		.placeorderButton()
			.orderConfirmationmessage();
			
			
			
			
			
			
	}

	}


