package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateRecipientGroup;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateRecipientGroupTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateRecipientGroup recGrp;
	
	public CreateRecipientGroupTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void recipientGroup() throws InterruptedException{
		homePage.clickOnRecipientGroupLink();
		recGrp.recipientroup();
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
	    //driver.quit();
	}
      
}
