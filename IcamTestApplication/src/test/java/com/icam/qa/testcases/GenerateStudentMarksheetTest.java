package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.GenerateStudentMarksheet;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class GenerateStudentMarksheetTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	GenerateStudentMarksheet gnStdMrk;
	
	
	public GenerateStudentMarksheetTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		gnStdMrk=new GenerateStudentMarksheet();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnGenerateStudentMarksheetLink();
	}
	
	
	@Test
	public void generateStudntMarsht() throws InterruptedException{
		gnStdMrk.generateStudentMarksheet();
		System.out.println("===Student marksheet generated successfully===>>");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
	

}
