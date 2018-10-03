package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateFacility;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateFacilityTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateFacility crFclt;
	String sheetName="Facility";
	
	
	public CreateFacilityTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crFclt=new CreateFacility();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void facilityCreationTest(String fcNme,String fcDes) throws InterruptedException{
		homePage.clickOnCreateFacilityLink();
		crFclt.addFacility(fcNme, fcDes);
	}
	@Test(priority=2)
	public void validatePageTest(){
		String Title=crFclt.validatePage();
		Assert.assertEquals(Title, "Add Facility");
		System.out.println("=====Landing on the correct page=====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	
}
