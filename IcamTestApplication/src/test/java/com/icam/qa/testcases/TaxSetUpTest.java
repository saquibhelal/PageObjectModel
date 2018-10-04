package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.TaxSetUp;

public class TaxSetUpTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TaxSetUp taxSet;
	
	public TaxSetUpTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		taxSet=new TaxSetUp();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void taxSetupTest() throws InterruptedException{
		homePage.clickOnTaxSetUpLink();
		taxSet.taxSetup();
		System.out.println("====Tax setup done====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=taxSet.validatePageTitle();
		Assert.assertEquals(Title, "TAX Setup");
		System.out.println("====Landing on the correct Page===");
		
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}

}
