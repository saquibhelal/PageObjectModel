package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateCategoryRecipient;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateCategoryRecipientTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateCategoryRecipient catRecp;
	
	public CreateCategoryRecipientTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage=new LoginPage();
		catRecp=new CreateCategoryRecipient();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void createCatRecp() throws InterruptedException{
		homePage.clickOnCreateCategoryRecipientLink();
		catRecp.catRecipient();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}

}
