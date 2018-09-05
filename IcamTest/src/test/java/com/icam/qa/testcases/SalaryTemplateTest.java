package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SalaryTemplate;

public class SalaryTemplateTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	SalaryTemplate salTemp;
	
	public SalaryTemplateTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		salTemp=new SalaryTemplate();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
	}
	
	@Test
	public void createSalaryTemplateTest() throws InterruptedException{
		homePage.clickOnSalaryTemplateLink();
		salTemp.createSalaryTemplate();
	}
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
