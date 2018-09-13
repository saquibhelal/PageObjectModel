package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateLocation;
import com.icam.qa.pages.CreateVenue;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateVenueTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	CreateVenue cVenue;
	String sheetName="Venue";
	
	public CreateVenueTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cVenue=new CreateVenue();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider="getIcamSheetData",priority=1)
	public void createVenueTest(String vName,String vDes,String vSeat,
			String vRoom,String vBuild,String vFloor) throws InterruptedException{
		homePage.clickOnVenueLink();
		cVenue.venueCreation(vName, vDes, vSeat, vRoom, vBuild, vFloor);
		System.out.println("*******Venue Created Successfully*******");
	}
	
	
	@Test(priority=2)
	public void validateVenueTest(){
		String title=cVenue.validateVenuePage();
		Assert.assertEquals(title, "Create Venue");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
}
