package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CurrentOpening extends TestBase{
	
	HighlightElement highLight;

	@FindBy(xpath="//input[@value='Course-CODE-CLS-3']")
	WebElement openingDrv;
	
	@FindBy(css="#formFees")
	WebElement formFees;
	
	@FindBy(css="#admissionFormSubmissionLastDate")
	WebElement subLstDate;
	
	@FindBy(css="#admissionDriveStartDate")
	WebElement admissionDriveStartDate;
	
	@FindBy(css="#admissionDriveExpectedEndDate")
	WebElement endDate;
	
	@FindBy(css="#cap1")
	WebElement option;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit1;
	
	@FindBy(xpath="//*[@id='submitForm']")
	public WebElement submit;
	
	public CurrentOpening(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateAdmissionDrivePage(){
		String valcheck="Current Openings";
		return valcheck;
	}
	
	public ConfigureAdmissionProcess openingDrive(String formFee) throws InterruptedException{
		 driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		 Thread.sleep(4000);
	     HighlightElement.highLightElement(driver, openingDrv);
		 openingDrv.click();
		 HighlightElement.highLightElement(driver, submit);
		 submit.click();
		 //driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		 Thread.sleep(200);
		 formFees.sendKeys(formFee);
		 Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("document.getElementById('admissionFormSubmissionLastDate').value='16/04/2018'");
		 Thread.sleep(300);
		 JavascriptExecutor js1=(JavascriptExecutor) driver;
		 js1.executeScript("document.getElementById('admissionDriveStartDate').value='17/04/2018'");
		 Thread.sleep(300);
		 JavascriptExecutor js2=(JavascriptExecutor) driver;
		 js2.executeScript("document.getElementById('admissionDriveExpectedEndDate').value='18/04/2018'");
         option.click();
	    // submit1.click();
		return new ConfigureAdmissionProcess();
	}
	
}
