package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.UploadQuestionPaper;

public class UploadQuestionPaperTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	UploadQuestionPaper qustPpr;
	
	public UploadQuestionPaperTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		qustPpr=new UploadQuestionPaper();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	    homePage.clickOnUploadQuestionPaper();   
	}    
	    
	    
	    @Test(priority=1)
	    public void uploadQustionPaper() throws InterruptedException{
	    	qustPpr.UploadQuestion();
	    	System.out.println("====File uploaded successfully====>>");
	    }
	    
	    @AfterClass
		public void tearDown(){
			System.out.println("======Browser is shutting down=====>>\n");
			//driver.quit();
		}
	    
	    
	    
	    
	    
}
