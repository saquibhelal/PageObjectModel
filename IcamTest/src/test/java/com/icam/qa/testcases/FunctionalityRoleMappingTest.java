package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.FunctionalityRoleMapping;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class FunctionalityRoleMappingTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	FunctionalityRoleMapping funMap;
	
	public FunctionalityRoleMappingTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		funMap=new FunctionalityRoleMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void functionalityRoleMappingTest() throws InterruptedException{
		homePage.clickOnfunctionMappingLink();
		funMap.doFunctionalityRoleMapping();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
