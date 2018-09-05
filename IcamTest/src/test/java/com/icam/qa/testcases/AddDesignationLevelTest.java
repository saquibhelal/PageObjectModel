package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddDesignationLevel;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddDesignationLevelTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	AddDesignationLevel dLevel;
	String sheetName="DesignationLevel";
	
	public AddDesignationLevelTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		dLevel=new AddDesignationLevel();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnDesignationLevellink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createDesignationLevelTest(String dsgL) throws InterruptedException{
		
		dLevel.createDesignationLevel(dsgL);
		TestBase.driver.navigate().refresh();
		homePage.payrollLink.click();
		homePage.payrollSetup.click();
		homePage.designationLevelLink.click();
		System.out.println("======Successfully Created======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
	
	
	
	
}
