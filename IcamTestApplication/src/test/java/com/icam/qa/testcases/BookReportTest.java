package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BookReport;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class BookReportTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	BookReport dkRpt;
	
	public BookReportTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		dkRpt=new BookReport();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void generateBookReportTest() throws InterruptedException{
		homePage.clickOnBookReportLink();
		dkRpt.generateBookReport();
		System.out.println("=======Book Report Generated Sucessfull======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
	
	
	
	
	
	
}
