package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.TC;

public class TcTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TC tc;
	
	public TcTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		tc=new TC();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void generateTcTest() {
		homePage.clickOnGenerateTcLink();
		try {
			tc.generateTc();
		} catch (InterruptedException e) {
			System.out.println("Generate Tc Successfull....");
			e.printStackTrace();
		}
	}
	
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
