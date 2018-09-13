package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CourseType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CourseType courseType;
	
	public HomePageTest() {

		super();
	}

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		courseType= new CourseType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomepageTitleTest(){
    String  homePageTitle= homePage.verifyHomepageTitle();
    Assert.assertEquals(homePageTitle, "Dashboard | iCAM Admin - BETA", "Home Page Title Not Match");
    
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	/*
	@Test(priority=3)
	public void clickOnAcademicLinkTest(){
		homePage.clickOnAcademicLink();	
	}*/
	
	/*@Test(priority=4)
	public void clickOnCourseLinkTest(){
		homePage.clickOnCourseLink();
	}
	@Test(priority=5)
	public void clickOnCourseTypeTest() throws InterruptedException{
		Thread.sleep(3000);
		//driver.switchTo().frame("frame");
		courseType= homePage.clickOnCourseType();
	}*/
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
