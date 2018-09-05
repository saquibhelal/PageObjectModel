package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.MapTeacherClass;

public class MapTeacherClassTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MapTeacherClass teacherClass;
	
	public MapTeacherClassTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		teacherClass=new MapTeacherClass();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void mappTeacherClassTest() throws InterruptedException{
		homePage.clickOnTeacherClass();
		teacherClass.mappedTeacherClass();
	}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	
	

}
