package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.EmployeeDetails;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class EmployeeDetailsTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	EmployeeDetails empDtls;
	String sheetName="EmpCreation";
	
	public EmployeeDetailsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		empDtls=new EmployeeDetails();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void employeeCreationTest(String fnm,String lnm,String inm,String cn,
			String nt,String usId) throws InterruptedException{
		homePage.clickOnEnterEmployeeDetailsLink();
		empDtls.employeecreation(fnm, lnm, inm, cn, nt,usId);
	}
		
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	

}
