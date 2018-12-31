package com.icam.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.UploadResult;
import com.icam.qa.util.TestUtil;

public class UploadResultTest extends TestBase {

	
	HomePage homePage;
	UploadResult upRslt;
	String sheetName="UploadResult";
	
	public UploadResultTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		upRslt=new UploadResult();
		//loginPage= new LoginPage();
		//homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("ssp_rt");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9331927704");
		driver.findElement(By.xpath("html/body/section/div/div[3]/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();
	    
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);// get the value from sheet 
		return data;
	}
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void uploadingResultTest(String mrk) throws InterruptedException{
		homePage.clickOnUploadResultLink();
		upRslt.resultupload(mrk);
	}
	
}
