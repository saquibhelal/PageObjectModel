package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.ConfigureExamSeating;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class ConfigureExamSeatingTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ConfigureExamSeating cnfExmSeat;
	
	
	public ConfigureExamSeatingTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cnfExmSeat=new ConfigureExamSeating();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void examSeating() throws InterruptedException{
		homePage.clickOnExamSeatingArrangementLink();
		cnfExmSeat.examSeatingArrang();
		System.out.println("Exam Seating done successfully===>>");
	}
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	

}
