package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.TeacherInterview;
import com.icam.qa.util.TestUtil;

public class TeacherInterviewTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TeacherInterview tchrInterview;
	String sheetName="TeacherInterview";
	
	
	public TeacherInterviewTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		tchrInterview=new TeacherInterview();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void teacherInterviewTest(String sbj,String mrks) throws InterruptedException{
		homePage.clickOnTeacherInterviewLink();
		tchrInterview.teacherInterview(sbj, mrks);
		
	}
	
	
	
	@Test(priority=2)
	public void validateScheduleTest(){
		String title=tchrInterview.validateTeacherInterviewPage();
		 SoftAssert sf=new SoftAssert();
		   sf.assertEquals(title, "Teacher Interview Result");
		   sf.assertAll();
		   System.out.println("=====You Are Landing On Correct Page====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
