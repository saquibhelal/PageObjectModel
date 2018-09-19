package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateEvent;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateEventTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateEvent event;
	String sheetName="CreateEvent";
	
	public CreateEventTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		event=new CreateEvent();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnCreateEventLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void eventCreationTest(String evNm,String evDs,String evIn) throws InterruptedException{
		event.eventCreation(evNm, evDs, evIn);
		System.out.println("Event created sucessfully..........");
	}
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	

}
