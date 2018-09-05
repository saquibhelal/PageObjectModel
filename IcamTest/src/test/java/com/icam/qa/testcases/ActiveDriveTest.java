package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.ActiveDrive;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class ActiveDriveTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ActiveDrive actdrv;
	//String sheetName="CurrentOpening";
	
	public ActiveDriveTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		actdrv=new ActiveDrive();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void activeDriveTest() throws InterruptedException{
		homePage.clickOnAdmissionDrive();
		actdrv.activeDrive();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
	    //driver.quit();
	}

}
