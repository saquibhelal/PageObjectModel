package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CommodityAllotmentHistory;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CommodityAllotmentHistoryTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	CommodityAllotmentHistory comHist;
	
	
	public CommodityAllotmentHistoryTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		comHist=new CommodityAllotmentHistory();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		//homePage.navigateToJobTypeLink();
		//driver.switchTo().frame("frame"); 
	}
	
	@Test
	public void checkCommodityAllotHistTest(){
		homePage.clickOnCommodityAllotHist();
		comHist.checkCommodityAllotmentHistory();
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	
	
}
