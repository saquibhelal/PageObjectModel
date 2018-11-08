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
	public void setUp() throws InterruptedException{
		initializationBrowser();
		createNewStudents=new CreateNewStudent();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnNewStudent();
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	

	@Test(priority=1,dataProvider="getIcamSheetData")
	public void createStudent(String ScNo,String fNm,String mdNm,String lNm,
		    String rlgs,String mthtong,String adrNo,String cellNo,String scNm,String wb,String adrs,String phne,String em,String ach
			) throws InterruptedException{
		     
		    createNewStudents.createNewStudent(ScNo,fNm,mdNm,lNm,rlgs,mthtong,adrNo,cellNo,scNm,wb,adrs,phne,em,ach);
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
