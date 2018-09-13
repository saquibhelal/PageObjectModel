package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateFeesStructure extends TestBase {
	
	// @Author Saquib
	@FindBy(linkText="Office Administration")
	WebElement officeAdminLink;
	
	@FindBy(linkText="Fees Management")
	WebElement feesManagement;
	
	@FindBy(linkText="Create Fees Structure")
	WebElement createFeesStructure;
	
	@FindBy(css="#feesCategoryName")
	WebElement categoryName;
	
	@FindBy(css="#feesCategoryDuration")
	WebElement duration;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	
	
	public CreateFeesStructure(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateFeesStructurePage(){
		String valcheck="Create Fees Structure";
		return valcheck;
	}
	
	public CreateFeesStructure feesStructure(String cName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		categoryName.sendKeys(cName);
		Thread.sleep(4000);
		Select dur=new Select(duration);
        dur.selectByVisibleText("YEARLY");
        submit.click();
		return new CreateFeesStructure();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
