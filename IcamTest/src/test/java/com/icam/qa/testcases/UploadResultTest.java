package com.icam.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UploadResult;
import com.icam.qa.util.TestUtil;

public class UploadResultTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	UploadResult upRslt;
	String sheetName="UploadResult";
	
	public UploadResultTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		upRslt=new UploadResult();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
	}
	
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void uploadingResultTest(String mrk) throws InterruptedException{
		homePage.clickOnUploadResultLink();
		upRslt.resultupload(mrk);
	}
	
}
