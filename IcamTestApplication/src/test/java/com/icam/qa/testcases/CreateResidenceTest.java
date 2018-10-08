package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateResidence;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateResidenceTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateResidence crRes;
	String sheetName="Residence";
	
	
	public CreateResidenceTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crRes=new CreateResidence();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createResidenceTest(String rsNm,String rsAb,String znRes) throws InterruptedException{
		homePage.clickOnCreateResidenceLink();
		crRes.createResidence(rsNm, rsAb, znRes);
		System.out.println("=====Residence has been created successfully====");
	}
	
	@Test(priority=2)
	public void validatePageTest(){
		String Title=crRes.validatePageTitle();
		Assert.assertEquals(Title, "Create Residence");
		System.out.println("====Landing on the correct Page=====");
	}
	
}
