package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.VenueAllocation;

public class VenueAllocationTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	VenueAllocation venAlloc;
	
	public VenueAllocationTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		venAlloc=new VenueAllocation();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void venueAllocationTest() throws InterruptedException{
		homePage.clickOnVenueAllocationLink();
		venAlloc.venueAllocation();
		System.out.println("=====Venu Allocation Done=====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
	  String Title=venAlloc.validatePageTitle();
	  Assert.assertEquals(Title, "Venue Allocation");
	  System.out.println("=====Landing on the correct Page=====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	

}
