package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateHouse;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateHouseTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CreateHouse crHouse;
	
	public CreateHouseTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crHouse=new CreateHouse();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void createHouseTest() throws InterruptedException{
		homePage.clickOnCreateHouseLink();
		crHouse.createHouse();
		System.out.println("=====House has been created=====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=crHouse.validatePageTitle();
		Assert.assertEquals(Title, "Create House");
		System.out.println("=====Landing on the correct page=====");
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	

}
