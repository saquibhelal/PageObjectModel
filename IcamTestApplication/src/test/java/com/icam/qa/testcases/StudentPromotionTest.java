package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.StudentPromotion;

public class StudentPromotionTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	StudentPromotion stdPro;
	
	public StudentPromotionTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		stdPro=new StudentPromotion();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void studentPromotionTest() throws InterruptedException {
		homePage.clickOnStudentPromotionLink();
		stdPro.studentPromotion();
		System.out.println("=====Student promotion done sucessfully====");
	}
	
	@Test(priority=2)
	public void validatePageTitle(){
		String Title=stdPro.validatePage();
		Assert.assertEquals(Title, "Student Promotion");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}

}
