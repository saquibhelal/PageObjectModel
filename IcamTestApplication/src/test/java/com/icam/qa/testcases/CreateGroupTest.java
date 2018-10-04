package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateGroup;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateGroupTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateGroup crGroup;
	
	public CreateGroupTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crGroup=new CreateGroup();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void groupCreationTest() throws InterruptedException{
		homePage.clickOnCreateGroupLink();
		crGroup.groupCreation();
		System.out.println("======Group Creation Done=====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
	   String Title=crGroup.validatePageTitle();
	   Assert.assertEquals(Title, "Create Group");
	   System.out.println("======Landing on the Correct Page=====");
	}
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
}
