package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddDesignation;
import com.icam.qa.pages.CreateTaskStatus;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateTaskStatusTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateTaskStatus crTask;
	String sheetName="TaskStatus";
	
	public CreateTaskStatusTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crTask=new CreateTaskStatus();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnTaskStatusLink();
	}
	
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createTaskStatusTest(String tStats) throws InterruptedException{
		crTask.taskStatuseCreation(tStats);
		System.out.println("Task Creation Done");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
