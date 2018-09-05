package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateTicketStatus;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateTicketStatusTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CreateTicketStatus tktStus;
	String sheetName="TicketStatus";
	
	public CreateTicketStatusTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage=new LoginPage();
		tktStus=new CreateTicketStatus();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		//homePage.clickOnTicketStatusLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1,dataProvider="getIcamSheetData")
	public void ticketStatus(String tcktName) throws InterruptedException{
		homePage.clickOnTicketStatusLink();
		tktStus.ticketStatus(tcktName);
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
}
