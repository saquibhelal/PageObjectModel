package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.DisburseSalary;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class DisburseSalaryTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DisburseSalary dsb;
	
	public DisburseSalaryTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		dsb=new DisburseSalary();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
	}
	
	
	@Test
	public void createDisburseSalaryTest() throws InterruptedException{
		homePage.clickOnDisburseSalaryLink();
		dsb.createDisburseSalary();
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	

}
