package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.StudentAttendance;

public class StudentAttendanceTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	StudentAttendance stndAtt;
	
	public StudentAttendanceTest(){
		super();
	}

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		stndAtt=new StudentAttendance();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	
	@Test
	public void attendanceForStudent() throws InterruptedException{
		homePage.clickOnStudentAttendanceLink();
		stndAtt.stdnAttnd();
		System.out.println("Student Attendance Done====>>");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
