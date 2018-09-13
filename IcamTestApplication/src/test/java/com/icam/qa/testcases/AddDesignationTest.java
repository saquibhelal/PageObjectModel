package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddDesignation;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddDesignationTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddDesignation addDesg;
	String sheetName="Designation";
	
	public AddDesignationTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		addDesg=new AddDesignation();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnDesignationLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createDesignationTest(String dName) throws InterruptedException{
		
		addDesg.createDesignation(dName);
		TestBase.driver.navigate().refresh();
		homePage.payrollLink.click();
		homePage.payrollSetup.click();
		homePage.designationLink.click();
		
		System.out.println("====Again clicked on Designation===");
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=addDesg.validateAddDesignationPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Add Designation");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
	

}
