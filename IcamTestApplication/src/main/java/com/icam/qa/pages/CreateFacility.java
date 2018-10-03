package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateFacility extends TestBase {

	
	@FindBy(xpath="//input[@id='facilityName']")
	WebElement facilityName;
	
	@FindBy(xpath="//input[@id='facilityDesc']")
	WebElement desc;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	public CreateFacility(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePage(){
		String valChck="Add Facility";
	   return valChck;
	}
	
	public void addFacility(String fName,String fDesc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		facilityName.sendKeys(fName);
		desc.sendKeys(fDesc);
		//submit.click();
		
	}
	
}
