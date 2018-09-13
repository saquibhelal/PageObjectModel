package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateCategory;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateCategoryTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateCategory createCat;
	String sheetName="CreateCategory";
    
	public CreateCategoryTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage=new LoginPage();
		createCat=new CreateCategory();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnCreateCategoryLink();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void createCat(String ctNm) throws InterruptedException{
		homePage.clickOnCreateCategoryLink();
		createCat.createCategory(ctNm);
		
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
