package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BookLendingReport;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class BookLendingReportTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	BookLendingReport bkLenRp;
	
	public BookLendingReportTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		bkLenRp=new BookLendingReport();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void lendingBookTest() throws InterruptedException{
		homePage.clickOnBookLendingReportLink();
		bkLenRp.bookLending();
		System.out.println("====Book Lending done====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
}
