package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AccessionRegister;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AccessionRegisterTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	AccessionRegister accssReg;
	String sheetName="AccessionRegister";
	
	public AccessionRegisterTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		accssReg=new AccessionRegister();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnAccessionRegisterLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void accesionRegisTest(String bkT,String AcNo,String athor,String plce,String publ,String yrs,String pges,String sr,
			String blnum,String cos,String clNum,String bukNm,String wdnum) throws InterruptedException{
		accssReg.accsnRegister(bkT, AcNo, athor, plce, publ, yrs, pges, sr, blnum, cos, clNum, bukNm, wdnum);
	
		System.out.println("Successfull");
	}
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
	//	driver.quit();
	}
	
	
}
