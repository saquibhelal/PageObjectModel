package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class AddDesignation extends TestBase{
	
	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(css="#designationTypeName")
    WebElement designType;
	
	@FindBy(css="#designationName")
	WebElement desigName;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	public AddDesignation(){
		PageFactory.initElements(driver, this);
	}

	public String validateAddDesignationPage(){
		String valcheck="Add Designation";
		return valcheck;
	}
	
	public AddDesignation createDesignation(String dsName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		 HighlightElement.highLightElement(driver, designType);
		Select dsgType=new Select(designType);
		dsgType.selectByVisibleText("GENERAL STAFF");
		 HighlightElement.highLightElement(driver, desigName);
		desigName.sendKeys(dsName); 
		submit.click();
		return new AddDesignation();
	}
	
	

}
