package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.JobType;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class JobTypeTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	JobType jbType;
	String sheetName="JobType";
	
	public JobTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		jbType=new JobType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.navigateToJobTypeLink();
		driver.switchTo().frame("frame"); 
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="getIcamSheetData",priority=1)
	public void createJobTypeTest(String jobNm) throws InterruptedException{
		jbType.createJobType(jobNm);
		jbType.getTextByRowColNum(6, 1, "FF");
	}
	
	@AfterTest
	public void cc()
	{
		System.out.println("Test Completed");
	}
	
	
	
	
	
	/*@Test(priority=2, dataProvider="getIcamSheetData")
	public void createJobTypeTest(String jobNm) throws InterruptedException{
		homePage.clickOnJobTypeLink();
		jbType.createjobType(jobNm);
		Assert.assertTrue(true, "Added in the List");// is this correct to check the value , where is the list
	}*/
	
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	

}
