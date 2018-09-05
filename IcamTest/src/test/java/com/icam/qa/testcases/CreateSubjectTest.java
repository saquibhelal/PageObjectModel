package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateSubject;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateSubjectTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	CreateSubject crSub;
	String sheetName="Subject";
	
	
	public CreateSubjectTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crSub=new CreateSubject();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnCreateSubjectLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createSubjectTest(String subNme,String subCred,String subDrn) throws InterruptedException{
		 crSub.subjectCreation(subNme, subCred, subDrn);
		 TestBase.driver.navigate().refresh();
		 homePage.academicLink.click();
		 homePage.subjectLink.click();
		 homePage.createSubject.click();
	}
	
	
	@Test(priority=2)
	public void ValidateSubjectCreationTest(){
		String title=crSub.validateCreateSubjectPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title,"Create Subject");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
	    driver.quit();
	}
	
}
