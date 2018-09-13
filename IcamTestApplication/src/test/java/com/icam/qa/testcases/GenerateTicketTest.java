package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.GenerateTicket;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class GenerateTicketTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	GenerateTicket genTicket;
	
	
	public GenerateTicketTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		genTicket=new GenerateTicket();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void generatingTicketTest() throws InterruptedException{
		homePage.clickOnGenerateTicketLink();
		genTicket.ticketCreation();
		System.out.println("****Ticket Has been Generated Successfull*****");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
