package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.TeacherAttendance;

public class TeacherAttendanceTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TeacherAttendance techAtt;
	
	public TeacherAttendanceTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		techAtt=new TeacherAttendance();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void teacherAttendnc() throws InterruptedException{
		homePage.clickOnTeacherAttendanceLink();
		techAtt.teacherAttendance();
		System.out.println("Teacher attendance done successfully===>>");
	}
	
	
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
