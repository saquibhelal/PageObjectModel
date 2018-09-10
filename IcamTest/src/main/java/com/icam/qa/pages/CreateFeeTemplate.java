package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CreateFeeTemplate extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(linkText="Office Administration")
	WebElement officeAdminLink;
	
	@FindBy(linkText="Fees Management")
	WebElement feesManagement;
	
	@FindBy(linkText="Create Fees Template")
	WebElement templatelink;
	
	@FindBy(css="#studentFeesTemplateName")
	WebElement templateName;
	
	@FindBy(xpath="//input[@value='ADMISSION FEES'][1]")
	WebElement admisionFee;
	
	@FindBy(xpath="//input[@value='REGISTRATION FEES'][1]")
	WebElement registrationFee;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public CreateFeeTemplate(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateFeesTemplatePage(){
		String valcheck="Create Fees Template";
		return valcheck;
	}
	
	
	public CreateFeeTemplate templateCreation(String tName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(3000);
        HighlightElement.highLightElement(driver, templateName);
		templateName.sendKeys(tName);
        HighlightElement.highLightElement(driver, admisionFee);
		admisionFee.click();
		registrationFee.click();
		submit.click();
		return new CreateFeeTemplate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
