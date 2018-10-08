package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.HouseResidenceMapping;
import com.icam.qa.pages.LoginPage;

public class HouseResidenceMappingTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	HouseResidenceMapping houResMap;
	
	public HouseResidenceMappingTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		houResMap=new HouseResidenceMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}

	@Test(priority=1)
	public void houseResMapping() throws InterruptedException{
		homePage.clickOnHouseResidenceMapping();
		houResMap.createHouseResMapping();
		System.out.println("=====House Mapping done=====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=houResMap.validatePageTitle();
		Assert.assertEquals(Title, "Create House-Residence Mapping");
		System.out.println("=====Landing on the correct Page====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	

}
