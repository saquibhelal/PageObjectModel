package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateTask;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateTaskTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateTask creatTask;
	String sheetName="CreateTask";
	
	public CreateTaskTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage=new LoginPage();
		creatTask=new CreateTask();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	@DataProvider()
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createTaskTest(String tskName,String tskDes,String tskNte) throws InterruptedException{
		homePage.clickOnApprovalLink();// this lilnk is for create task purpose....
		creatTask.createTaskApproval(tskName, tskDes, tskNte);
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
