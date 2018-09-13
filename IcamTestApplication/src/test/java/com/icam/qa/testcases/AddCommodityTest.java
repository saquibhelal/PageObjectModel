package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddCommodity;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddCommodityTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	AddCommodity addCom;
	String sheetName="Commodity";
	
	public AddCommodityTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		addCom=new AddCommodity();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createCommodityTest(String cName,String cDes,String cThr) throws InterruptedException{
		homePage.clickOnAddCommodityLink();
		addCom.createCommodity(cName, cDes, cThr);
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
