package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateHostel;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateHostelTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateHostel crHstl;
	String sheetName="AddHostel";
	
	public CreateHostelTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crHstl=new CreateHostel();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.navigateToHostelLink();
	}

	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getIcamSheetData")
      public void addHostelTest(String hNm,String hstAbv,String zne) throws InterruptedException{
		crHstl.hostelCreation(hNm, hstAbv, zne);
		System.out.println("************Added Sucessfully***********");
	}
	@Test(priority=1)
	public void hostelPageValidation(){
	   String title=crHstl.validateAddHostelpage();
	   SoftAssert sf=new SoftAssert();
	   sf.assertEquals(title, "Create Hostel", "You are in the correct page");
	   sf.assertAll();
	  // System.out.println("====You Are Landing On Correct Page====");
	  
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}
	
	
	
	
	
	
}
