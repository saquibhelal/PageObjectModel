package com.icam.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BookCatalogingAndAccessionRegistration;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class BookCatalogingAndAccessionRegistrationTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	BookCatalogingAndAccessionRegistration bkCtAcReg;
	String sheetName="BookCatalogingAnd AccessionReg";
	
	 public BookCatalogingAndAccessionRegistrationTest() {
          super();
	}
		
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		bkCtAcReg=new BookCatalogingAndAccessionRegistration();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void bookCatAndAccReg(String bktl,String accNo,String aut,String ct) throws InterruptedException{
		homePage.clickOnBookCatAndAccessionRegLink();
		bkCtAcReg.bookCatAndAccReg(bktl, accNo, aut, ct);
		System.out.println("=====Book cataloging and Accesion done=====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=bkCtAcReg.validatePage();
		Assert.assertEquals(Title, "Add Book/Magazines To Catalogue");
		System.out.println("====Landing on the correct page====");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
}
