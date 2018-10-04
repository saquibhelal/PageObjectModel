package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.FacilityDeActivation;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class FacilityDeActivationTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	FacilityDeActivation fcActv;
	
	public FacilityDeActivationTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		fcActv=new FacilityDeActivation();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void facilityDeActivationTest() throws InterruptedException{
		homePage.cilckOnFacilityDeActionLink();
		fcActv.facilityDeActivation();
		System.out.println("=====Facility DeActivation Don====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=fcActv.validatePageTitle();
		Assert.assertEquals(Title, "De - Activate Facility");
		System.out.println("=====Landing on the correct page=====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	

}
