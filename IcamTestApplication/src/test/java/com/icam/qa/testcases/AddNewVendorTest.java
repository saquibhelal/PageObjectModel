package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddNewVendor;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddNewVendorTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AddNewVendor newVendor;
	String sheetName="Vendor";
	
	public AddNewVendorTest(){
		super();
	}


	@BeforeClass
	public void setUp(){
		initializationBrowser();
		newVendor= new AddNewVendor();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnNewVendorLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void vendorCreationTest(String nm,String cnct,String eml,String add,String bnkNm,String acNo,
			String ifs,String loc,String cd,String opBal) throws InterruptedException{
		newVendor.createVendor(nm, cnct, eml, add, bnkNm, acNo, ifs, loc, cd, opBal);
		TestBase.driver.navigate().refresh();
		homePage.ofcAdmin.click();
		homePage.vm.click();
		homePage.vndr.click();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
