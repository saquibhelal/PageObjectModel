package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.FacilityList;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class FacilityListTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	FacilityList fcLst;
	
	public FacilityListTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		fcLst=new FacilityList();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void facilityListTest() throws InterruptedException {
		homePage.clickOnFacilityListLink();
		fcLst.facilityList();
		System.out.println("=====List edited successfully====");

	}
	
	@Test(priority=2)
    public void validatePageTest(){
		String Title=fcLst.validatePage();
		Assert.assertEquals(Title, "Edit Facility");
		System.out.println("=====Landing on the Correct Page=====");
	}
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}

}
