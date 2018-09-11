package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.ScheduleInterview;
import com.icam.qa.util.TestUtil;

public class ScheduleInterviewTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ScheduleInterview schedule;
	String sheetName="Schedule";
	
	public ScheduleInterviewTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		schedule=new ScheduleInterview();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void scheduleTest(String fName,String lName,String hQual,String sSpz) throws InterruptedException{
		homePage.clickOnTeacherInterviewSchedule();
		schedule.createSchedule(fName, lName, hQual, sSpz);
	}
	
	@Test(priority=2)
	public void validateScheduleTest(){
		String title=schedule.validateSchedulePage();
		 SoftAssert sf=new SoftAssert();
		   sf.assertEquals(title, "Schedule Teacher Interview");
		   sf.assertAll();
		   System.out.println("=====You Are Landing On Correct Page====");
	}

	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
}
