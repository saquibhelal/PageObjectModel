package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.MapTeacherSubject;

public class MapTeacherSubjectTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MapTeacherSubject subMapping;
	
	public MapTeacherSubjectTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		subMapping=new MapTeacherSubject();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	
	@Test
	public void subjectMappingTest() throws InterruptedException{
		homePage.clickOnTeacherSubjectMapping();
		subMapping.subjectMapping();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	

}
