package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BookCatalog;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class BookCatalogTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	BookCatalog bkCt;
	String sheetName="BookCatalog";
	
	public BookCatalogTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		bkCt=new BookCatalog();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password")); 
	}
	
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void addBookToCatalogTest(String yrs,String cs,String pg,String clsNo,String auth,String vl,String bookNm,
			String bkTl,String sr,String wthNm,String pl,String blNm,String Pb,String rmk ) throws InterruptedException{
		homePage.clickOnBookCatalogLink();
		bkCt.AddBookToCatalog(yrs, cs, pg, clsNo, auth, vl, bookNm, bkTl, sr, wthNm, pl, blNm, Pb, rmk);
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}
}
