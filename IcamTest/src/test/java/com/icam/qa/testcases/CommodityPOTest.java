package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CommodityPO;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CommodityPOTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CommodityPO comP;
	String sheetName="CommodityPo";
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		comP=new CommodityPO();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		//homePage.navigateToJobTypeLink();
		//driver.switchTo().frame("frame"); 
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void generateCommodityPo(String qn,String dsc) throws InterruptedException{
		homePage.clickOnCommodityPoLink();
		comP.generateCommodityPo(qn, dsc);
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	
	
	
}
