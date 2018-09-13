package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SchoolBankDetail;
import com.icam.qa.util.TestUtil;

public class SchoolBankDetailTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SchoolBankDetail scBd;
	String sheetName="SchoolBankDetail";
	
	public SchoolBankDetailTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		scBd=new SchoolBankDetail();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
	}
	
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createSchoolBankDetailTest(String bnkNm,String brchNm,String accNm,
			String ifscCd,String brchCd,String locBnk,String opgBl) throws InterruptedException{
		homePage.clickOnSchoolBankDetails();
		scBd.createSchoolBankDetail(bnkNm, brchNm, accNm, ifscCd, brchCd, locBnk, opgBl);
		System.out.println("======School Bank Details Added Successfully======");
	}
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
