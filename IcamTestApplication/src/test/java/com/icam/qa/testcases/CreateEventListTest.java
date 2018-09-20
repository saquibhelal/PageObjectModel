package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateEventList;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateEventListTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateEventList list;
	
	public CreateEventListTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		list=new CreateEventList();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}

	
	@Test
	public void editEventListTest() throws InterruptedException{
		homePage.clickOnCreateEventLink();
		list.updateEventList();
		System.out.println("Event updated Sucessfull......");
	}
		
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
