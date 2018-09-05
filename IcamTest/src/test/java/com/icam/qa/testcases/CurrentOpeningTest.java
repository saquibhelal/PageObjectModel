package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CurrentOpening;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CurrentOpeningTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CurrentOpening cuOpng;
	String sheetName="CurrentOpening";
	
	public CurrentOpeningTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cuOpng=new CurrentOpening();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void openingForCurrentDriveTest(String FrmFee) throws InterruptedException{
		homePage.clickOnAdmissionOpeningLink();
		cuOpng.openingDrive(FrmFee);
	}
	
	@Test(priority=2)
	public void validateAdmissionDrivePageTest(){
		String title=cuOpng.validateAdmissionDrivePage();
		Assert.assertEquals(title, "Current Openings");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
	    //driver.quit();
	}
}
