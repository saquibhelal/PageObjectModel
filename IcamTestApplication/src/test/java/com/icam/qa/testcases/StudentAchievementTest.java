package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.StudentAchievement;
import com.icam.qa.util.TestUtil;

public class StudentAchievementTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	StudentAchievement stdAchv;
	String sheetName="StudentAchievement";
	
	public StudentAchievementTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		stdAchv=new StudentAchievement();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void studentAchievementTest(String evnPs,String stdnt) throws InterruptedException{
		homePage.clickOnStudentAchievementLink();
		stdAchv.studentAchievement(evnPs, stdnt);
		System.out.println("====Student Achievement Done Successfull====");
		
		
	}
	
	@Test(priority=2)
    public void validatePage(){
		String title=stdAchv.validatePage();
		Assert.assertEquals(title, "Student Achievements");
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	

}
