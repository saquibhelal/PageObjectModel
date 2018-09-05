package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateLocation;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateLocationTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateLocation cLoc;
	String sheetName="Location";
	
	public CreateLocationTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cLoc=new CreateLocation();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider="getIcamSheetData",priority=1)
	public void createLocationTest(String lcName,String lcDes, String lcArea,String lcCity,String lcPin) throws InterruptedException{
		homePage.clickOnLocationLink();
		cLoc.locationCreation(lcName, lcDes, lcArea, lcCity, lcPin);
		System.out.println("********Added Successfully********");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
