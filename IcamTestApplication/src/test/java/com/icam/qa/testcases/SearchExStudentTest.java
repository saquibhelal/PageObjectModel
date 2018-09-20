package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SearchExStudent;

public class SearchExStudentTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	SearchExStudent exStudent;
	
	public SearchExStudentTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		exStudent=new SearchExStudent();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}

	@Test
	public void searchExStudentTest() throws InterruptedException{
		homePage.clickOnSearchExStudentLink();
		exStudent.searchExStudent();
		System.out.println("Got X Student......");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	
}
