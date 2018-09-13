package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AssignAmount;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AssignAmountTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	AssignAmount asgnAmount;
	String sheetName="Assign_Amount";
	
	public AssignAmountTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		asgnAmount=new AssignAmount();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void assignTemplateAmount(String generl,String sch,String schtrb,String bck) throws InterruptedException{
		homePage.clickOnAssignAmount();
		asgnAmount.assignFeesAmount(generl, sch, schtrb, bck);
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=asgnAmount.validateAssignAmountPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Assign Fees To Template For A Standard");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}
	
	
	
	
	

}
