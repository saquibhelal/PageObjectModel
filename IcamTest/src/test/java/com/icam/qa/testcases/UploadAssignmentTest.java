package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UploadAssignment;

public class UploadAssignmentTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UploadAssignment upldAssgn;
	
	public UploadAssignmentTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		upldAssgn=new UploadAssignment();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnUploadAssignment();
		
	}
	
	
	@Test
    public void uploadAssignTest() throws InterruptedException{
		upldAssgn.uploadAssignment();
		System.out.println("====Assignment Uploaded Successfully====>>");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
	
	
	
	
	
	
}
