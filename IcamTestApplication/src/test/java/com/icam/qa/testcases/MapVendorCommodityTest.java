package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.MapVendorCommodity;
import com.icam.qa.util.TestUtil;

public class MapVendorCommodityTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	MapVendorCommodity mapComVen;
	String sheetName="MapVendorCommodity";
	
	public MapVendorCommodityTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		mapComVen=new MapVendorCommodity();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnMapVendorLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void doCommVenMap(String rate) throws InterruptedException{
		mapComVen.doCommodityMapping(rate);
		TestBase.driver.navigate().refresh();
		homePage.inventoryLink.click();
		homePage.commodityVendorMappingLink.click();
		homePage.mapComVendorLink.click();
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=mapComVen.validateCommodityVendorMappingPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Commodity Vendor Mapping");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
