package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BookAllocationReport;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class BookAllocationReportTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	BookAllocationReport bkAlRp;
	
	public BookAllocationReportTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		bkAlRp=new BookAllocationReport();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void bookAllocationReportTest() throws InterruptedException{
		homePage.clickOnBookAllocationReportLink();
		bkAlRp.bookAllocationReport();
		System.out.println("===== Book Allocation Done =====");
	}
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
}
