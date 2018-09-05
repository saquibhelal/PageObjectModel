package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CourseType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.VendorType;
import com.icam.qa.util.TestUtil;

public class VendorTypeTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	VendorType vendorType;
	String sheeName="Vendore_Type";
	
	
	public VendorTypeTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		vendorType= new VendorType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheeName);
		return data;
	}
	

	@Test(priority=1, dataProvider="getIcamSheetData")
	public void createNewVendorType(String type) throws InterruptedException{
		homePage.clickOnVendorManagement();
		vendorType.createNewVendorType(type);   
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}

}
