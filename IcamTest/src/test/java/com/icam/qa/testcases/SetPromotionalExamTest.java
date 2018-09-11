package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SetPromotionalExam;

public class SetPromotionalExamTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	SetPromotionalExam pExam;
	
	
	public SetPromotionalExamTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		pExam=new SetPromotionalExam();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnSetPromotionalExamLink();
	}
	
	
	
	@Test
	public void setPromatioExamTest() throws InterruptedException{
		pExam.promotionalExam();
		System.out.println("===Promotion exam set properly===>>");
		
	}
		

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
}
