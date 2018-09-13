package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateFeesStructure;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateFeeStructureTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateFeesStructure createFees;
	//CreateFeesStructure feeStructure;
	String sheeName="Create_Fees_Structure";
	
	
	
	public CreateFeeStructureTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		createFees=new CreateFeesStructure();
		//feeStructure= new CreateFeesStructure();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnFeesManagement();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheeName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createFeesStructure(String catname) throws InterruptedException{
		createFees.feesStructure(catname);
		TestBase.driver.navigate().refresh();
		homePage.officeAdminLinkForFees.click();
		homePage.feesManagement.click();
		homePage.createFeesStructure.click();
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=createFees.validateFeesStructurePage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Create Fees Structure");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
