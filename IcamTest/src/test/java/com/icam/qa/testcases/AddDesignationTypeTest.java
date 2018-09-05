package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddDesignationType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddDesignationTypeTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AddDesignationType dsgTyp;
	String sheetName="designationType";
	
	public AddDesignationTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		dsgTyp=new AddDesignationType();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnDesignationType();
	}
	
	
	@DataProvider(name="getIcamSheetData")
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void designationTypeTest(String dsTp) throws InterruptedException{
		
		dsgTyp.createDesignationType(dsTp);
		TestBase.driver.navigate().refresh();
		homePage.payrollLink.click();
		homePage.payrollSetup.click();
		homePage.designationType.click();
		
		
		/*//if that text is visible or displaying
		then simply assert.asserTrue(true, tht duplctae value );
		else
			Assert.assertTrue(false, not diaplyed);
		*/
	}
	
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=dsgTyp.validateDesignationTypePage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Create New Designation Type");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
