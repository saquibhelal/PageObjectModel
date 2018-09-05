package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SalaryBreakUp;
import com.icam.qa.util.TestUtil;

public class SalaryBreakUpTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SalaryBreakUp salBrk;
	String sheetName="SalaryBreakUp";
	
	public SalaryBreakUpTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		salBrk=new SalaryBreakUp();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void createSalaryBreakUpTest(String salNm) throws InterruptedException{
		homePage.clickOnsalaryBreakup();
		salBrk.createSalaryBreakUp(salNm);
	}

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
}
