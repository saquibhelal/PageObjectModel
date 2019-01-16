package com.icam.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UploadResult;

public class UploadResultTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UploadResult uploadResult;
	//String sheetName="UploadResult";

	
	public UploadResultTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		uploadResult=new UploadResult();
		//loginPage= new LoginPage();
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("ssp_rt");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9331927704");
		
		driver.findElement(By.xpath("html/body/section/div/div[3]/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();

	}
	
	/*@DataProvider
	public Object[][] getIcamSheetData(){
	
	Object data[][]=TestUtil.getTestData(sheetName);// get the value from sheet 
	
	return data;
	
   }*/

	@Test(/*priority=1,dataProvider="getIcamSheetData"*/)
	public void uploadStudentResult() throws InterruptedException{
		homePage.clickOnUploadResultLink();
		uploadResult.uploadStudentResult();
	} 
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
	
}
