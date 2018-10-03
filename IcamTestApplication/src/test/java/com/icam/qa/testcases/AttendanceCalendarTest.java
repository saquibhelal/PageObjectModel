package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AttendanceCalendar;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class AttendanceCalendarTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AttendanceCalendar attndCal;
	
	public AttendanceCalendarTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		attndCal=new AttendanceCalendar();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void attendanceCalendarTest() throws InterruptedException{
		homePage.clickOnAttendanceCalendarLink();
		attndCal.attendanceCalendar();
		System.out.println("=====Attendance Calendar Done=====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=attndCal.validatePage();
		Assert.assertEquals(Title, "Student Attendance");
		System.out.println("=====Landing on the correct page====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}

}
