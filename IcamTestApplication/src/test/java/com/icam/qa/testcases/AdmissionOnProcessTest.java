package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AdmissionOnProcess;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AdmissionOnProcessTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AdmissionOnProcess adOnPrcs;
	String sheetName="FormSubmission";
	
	public AdmissionOnProcessTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		adOnPrcs=new AdmissionOnProcess();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		//homePage.clickOnDepartment();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void formSubmissionTest(String fNm,String lNm,String phNo,String mail) throws InterruptedException{
		homePage.clickOnAdmissionOnProcessLink();
		adOnPrcs.admissionOnProcess(fNm, lNm, phNo, mail);
	}


	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
