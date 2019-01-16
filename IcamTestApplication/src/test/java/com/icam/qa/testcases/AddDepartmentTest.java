package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddDepartment;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddDepartmentTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AddDepartment department;
	String sheetName="Department";
	
	public AddDepartmentTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		department=new AddDepartment();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnDepartment();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void addDepartment(String dpName) throws InterruptedException{
	
		department.createDepartment(dpName);
		TestBase.driver.navigate().refresh();
		homePage.officeAdminLinkForVendor.click();
		homePage.departmentLink.click();
		homePage.addDepartment.click();
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=department.validateAddDepartmentPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals("Add Department", title);
		softassert.assertAll();
		
		System.out.println("======You are Landing on the Correct Page======");
		//Assert.
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}

}
