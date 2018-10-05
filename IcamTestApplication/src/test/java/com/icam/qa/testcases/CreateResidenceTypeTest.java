package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateResidenceType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateResidenceTypeTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateResidenceType crResTyp;
	
	public CreateResidenceTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crResTyp=new CreateResidenceType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void residenceType() throws InterruptedException{
		homePage.clickOnResidenceTypeLink();
		crResTyp.residenceCreationType();
		System.out.println("=====Residence Creation Done Successfully=====");
		
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=crResTyp.validatePageTitle();
		Assert.assertEquals(Title, "Create Residence Type");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	

}
