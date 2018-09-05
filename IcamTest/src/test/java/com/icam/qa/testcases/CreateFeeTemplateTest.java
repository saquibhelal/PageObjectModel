package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateFeeTemplate;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateFeeTemplateTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	CreateFeeTemplate feeTemplate;
	String sheetName="Fee_Template";
	
	
	public CreateFeeTemplateTest(){
		super();
	}
	
	@BeforeClass
	
	public void setUp(){
		initializationBrowser();
		feeTemplate=new CreateFeeTemplate();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createFeeTemplate(String templateName) throws InterruptedException{
		homePage.clickOnFeeTemplate();
		feeTemplate.templateCreation(templateName);
		
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=feeTemplate.validateFeesTemplatePage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Create Fees Template");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		System.out.println("======Browser is shutting down=====\n");
		Thread.sleep(2000);
		 driver.quit();
	}
	
	

}
