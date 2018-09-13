package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CommodityDetails;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CommodityDetailsTest extends TestBase{

	
	
 
	LoginPage loginPage;
	HomePage homePage;
	CommodityDetails cmdDtls;
	String sheetName="CommodityDetails";
	
	public CommodityDetailsTest(){
		super();
	}
	
	

	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		cmdDtls=new CommodityDetails();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOncommodityDetailsLink();
	}
	
	/*@BeforeMethod
	public void callingMethod(){
		homePage.clickOncommodityDetailsLink();
	}*/
	

	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void addCommodityDetailsTest(String mNo,String wty,String dp) throws InterruptedException{
		
		cmdDtls.addCommodityDetails(mNo, wty, dp);
		System.out.println("******Commodity Details Added Successfully*******");
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=cmdDtls.validateCommodityDetailsPage();
		Assert.assertEquals(title, "Individual Commodity Details");
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	/*@AfterMethod
	public void tearMethod(){
		System.out.println("=====Worked Done======");
	}*/
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
