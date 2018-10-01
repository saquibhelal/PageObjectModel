package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.ClassTeacher;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class ClassTeacherTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ClassTeacher clsTchr;
	
	public ClassTeacherTest(){
		super(); 
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		clsTchr=new ClassTeacher();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}

	@Test(priority=1)
	public void classTeacherTest() throws InterruptedException{
		homePage.clickOnCreateClassTeacherLink();
		clsTchr.createClassTeacher();
		System.out.println("=====Class Teacher created sucessfull=====");
	}
	
	@Test(priority=2)
	public void validateCreateClassTeacherPage(){
		String title=clsTchr.validatePageTitle();
		Assert.assertEquals(title, "Class Teacher");
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
