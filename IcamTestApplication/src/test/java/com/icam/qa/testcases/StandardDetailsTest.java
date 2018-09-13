package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.StandardDetails;
import com.icam.qa.util.TestUtil;

public class StandardDetailsTest extends TestBase {

	

	LoginPage loginPage;
	HomePage homePage;
	StandardDetails standardDetails;
	String sheeName="Standard_Details";
	
	public StandardDetailsTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		standardDetails=new StandardDetails();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnEnterStandardDetails();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheeName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void standardDetail(String acronym,String dur,String capacity) throws InterruptedException{
		standardDetails.enterStandardDetails(acronym, dur, capacity);
		TestBase.driver.navigate().refresh();
		homePage.academicLink.click();
		homePage.courseLink.click();
		homePage.enterStandardDetails.click();
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=standardDetails.validateStandardDetailstPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals("Enter Standard Details", title);
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
	
	
}
