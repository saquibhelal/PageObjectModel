package com.icam.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.DesignationLevelMapping;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class DesignationLevelMappingTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	DesignationLevelMapping mapping;
	
	
	public DesignationLevelMappingTest(){
		super();
	}
	
	
	@BeforeTest
	public void setUp(){
		initializationBrowser();
		mapping=new DesignationLevelMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void MappedDesignationLevelTest() throws InterruptedException{
		homePage.clickOnDesignationlevelMappingLink();
		mapping.mappedDesignationLevel();
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	
	
	

}
