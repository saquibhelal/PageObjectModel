package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateNewStudent;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateNewStudentTest extends TestBase {

	
	
	LoginPage loginPage;
	HomePage homePage;
	CreateNewStudent createNewStudents;
	String sheetName="Student_Creation";
	
	public CreateNewStudentTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		createNewStudents=new CreateNewStudent();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	

	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createStudent(String rNo,String fNm,String lNm,String nation,String email,String ftNm,
			String ltNm,String mtNm,String mlNm,String grdNm,String grdLNm,String addrs,String cities,String pnCode,
			String dst,String pOffce,String pStation,String prsnIdent,
			String grAddr,String grCiti,String grDist,String grPof,String grpol
			) throws InterruptedException{
		     homePage.clickOnNewStudent();
		     createNewStudents.createStudent(rNo, fNm, lNm, nation, email, ftNm, ltNm, mtNm,
				mlNm, grdNm, grdLNm, addrs, cities, pnCode, dst, pOffce, pStation,
				prsnIdent,grAddr,grCiti,grDist,grPof,grpol);
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
