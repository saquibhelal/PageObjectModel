package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.TeacherList;

public class TeacherListTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TeacherList listTeacher;
	
	public TeacherListTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		listTeacher=new TeacherList();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	
	@Test
	public void teacherListTest() throws InterruptedException{
		homePage.clickOnTeacherList();
		listTeacher.teacherDetails();
	}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	
	
	
	
	
	

}
