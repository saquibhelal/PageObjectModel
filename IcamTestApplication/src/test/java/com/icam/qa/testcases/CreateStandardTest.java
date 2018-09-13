package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateStandard;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateStandardTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CreateStandard csStnd;
	String sheetName="Standard and Section";
	
	public CreateStandardTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		csStnd=new CreateStandard();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		

	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData",enabled=false)
	public void standardCreationTest(String standard,String section) throws InterruptedException{
		homePage.clickOnAcademicLinkForStandardAndSection();
		csStnd.standardCreation(standard, section);
		TestBase.driver.navigate().refresh(); 
		
	}
	
	
	@Test(priority=2)
	public void validateList() throws InterruptedException{
		homePage.clickOnAcademicLinkForStandardAndSection();
		csStnd.validateList();
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====");
		driver.quit();
	}	

}
