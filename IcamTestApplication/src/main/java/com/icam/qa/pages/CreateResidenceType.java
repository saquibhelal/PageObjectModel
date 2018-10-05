package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateResidenceType extends TestBase{
	
	@FindBy(xpath="//input[@id='hostelTypeName']")
	WebElement resiName;
	
	@FindBy(xpath="//button[@id='submitButton']")
	WebElement submit;
	
	public CreateResidenceType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Create Residence Type";
		return valChck;
				
	}
	
	public void residenceCreationType() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		resiName.sendKeys("Test");
		submit.click();
	}
	
	
	
	
	

}
