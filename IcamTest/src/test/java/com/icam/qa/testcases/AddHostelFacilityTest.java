package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddHostelFacility;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddHostelFacilityTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	AddHostelFacility hstlFac;
	String sheetName="FacilityToHostel";
	
	public AddHostelFacilityTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		hstlFac=new AddHostelFacility();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void hostelFacilityTest(String fcName,String fDesc,String gnrl,
			String ssc,String sst,String ob) throws InterruptedException{
		homePage.clickOnHostelFacility();
		hstlFac.facilityAddToHostel(fcName, fDesc, gnrl, ssc, sst, ob);
		System.out.println("*****Facility Added Successfully******");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}

	
}
