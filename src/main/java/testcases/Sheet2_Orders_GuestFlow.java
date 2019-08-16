package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Orders_GuestFlow extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders";
		testDescription="Verify the orders flow";
		testNodes="PDP";
		category="Regression";
		authors="sairam";
		browserName="chrome";
		dataSheetName="TC029";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void orders(String xpath,String email, String xp,String number, String firstname, String lname, String address, String cityname,String state, String zipcode, String cardname, String cardnumber, String year, String cvn) throws AWTException  {
		
		
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
			.entercardname(cardname)
			.carddetails(cardnumber)
			.expiryyear(year)
			.cvnfield(cvn)
			.giftcardexpand()
			.giftcardcollapse()
			.revieworder()
			.placeorderButton()
	.orderConfirmationmessage();
			
			
			
			
			
			
			
	}

	}

