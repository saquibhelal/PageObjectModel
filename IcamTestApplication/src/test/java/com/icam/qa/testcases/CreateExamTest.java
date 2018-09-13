package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateExam;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateExamTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CreateExam examCreate;
	
	
	public CreateExamTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		examCreate=new CreateExam();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test(priority=1)
	public void examCreationTest() throws InterruptedException{
		homePage.clickOnCreateExam();
		examCreate.examCreation();
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	

}
