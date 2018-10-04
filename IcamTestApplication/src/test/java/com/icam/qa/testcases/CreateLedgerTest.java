package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateLedger;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateLedgerTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateLedger crLedger;
	String sheetName="Ledger";
	
	
	public CreateLedgerTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crLedger=new CreateLedger();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void ledgerCreationTest(String ledNm,String opBl) throws InterruptedException{
		homePage.clickOnCreateLedgerLink();
		crLedger.createLedger(ledNm, opBl);
		System.out.println("======Ledger has been created successfully=====");
		
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=crLedger.validatePagetTitle();
		Assert.assertEquals(Title, "Create Ledger");
		System.out.println("=====Landing on the correct Page=====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
}
