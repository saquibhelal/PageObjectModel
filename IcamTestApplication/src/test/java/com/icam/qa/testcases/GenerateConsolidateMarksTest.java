package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.GenerateConsolidateMarks;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class GenerateConsolidateMarksTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	GenerateConsolidateMarks genConMark;
	
	public GenerateConsolidateMarksTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		genConMark=new GenerateConsolidateMarks();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnGenerateConsolidateMarks();
	}
	
	@Test
	public void generateConMark() throws InterruptedException{
		genConMark.generateConsMark();
		System.out.println("===Consolidate Marks is generated===>>");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
}
