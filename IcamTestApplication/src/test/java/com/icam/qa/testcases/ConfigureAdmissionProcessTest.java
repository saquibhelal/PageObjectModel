package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.ConfigureAdmissionProcess;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class ConfigureAdmissionProcessTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ConfigureAdmissionProcess cAdmissionprc;
	
	public ConfigureAdmissionProcessTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cAdmissionprc=new ConfigureAdmissionProcess();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void admissionProcess() throws InterruptedException{
		homePage.clickOnAdmissionOpeningLink();
		cAdmissionprc.admissionProcess();
	}

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
