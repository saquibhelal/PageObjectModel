package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UploadTeacherAttendance;

public class UploadTeacherAttendanceTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UploadTeacherAttendance upldTeach;
	
	public UploadTeacherAttendanceTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		upldTeach=new UploadTeacherAttendance();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void teacherAttendance() throws InterruptedException{
		homePage.clickOnUploadTeacherAttendanceLink();
		upldTeach.teacherAttendance();
		System.out.println("====Teacher Attendance Upload Successfully====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=upldTeach.validatePage();
		Assert.assertEquals(Title, "Teacher Attendance");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
}
