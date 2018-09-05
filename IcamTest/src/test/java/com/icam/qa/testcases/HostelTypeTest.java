package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.HostelType;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class HostelTypeTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	HostelType hstTyp;
	String sheetName="HostelType";
	
	public HostelTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		hstTyp=new HostelType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clicOnHostelType();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createHostelTypeTest(String hstNm) throws InterruptedException{
		hstTyp.createHostelType(hstNm);
		TestBase.driver.navigate().refresh();
		homePage.hstlLink.click();
		homePage.cfgHostel.click();
		homePage.crtHstlTyp.click();
	}
	
   @Test(priority=2)
	
	public void validateAdmissionDrivePageTest(){
		String title=hstTyp.validateHostelPage();
		Assert.assertEquals(title, "Create New HostelType");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}
	
}
