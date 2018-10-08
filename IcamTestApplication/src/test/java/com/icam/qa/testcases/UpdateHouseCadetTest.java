package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UpdateHouseCadet;

public class UpdateHouseCadetTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	UpdateHouseCadet upHouCad;
	
	public UpdateHouseCadetTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		upHouCad=new UpdateHouseCadet();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void updateHouseCadetTest() throws InterruptedException{
		homePage.clickOnUpdateHouseCadetLink();
		upHouCad.updateHouseCadet();
		System.out.println("=====House Update Successfull====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=upHouCad.validatePagetTitle();
		Assert.assertEquals(Title, "Update House For Cadet");
		System.out.println("=====Landing on the correct page=====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	

}
