package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateVoucherType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateVoucherTypeTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateVoucherType crVoTyp;
	
	public CreateVoucherTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crVoTyp=new CreateVoucherType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1,enabled=false)
	public void voucherCreationTest() throws InterruptedException{
		homePage.clickOnCreateVoucherTypeLink();
		crVoTyp.voucherCreation();
		System.out.println("====Voucher Creation Done====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=crVoTyp.validatePageTitle();
		Assert.assertEquals(Title, "Create Voucher Type");
	}
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	

}
