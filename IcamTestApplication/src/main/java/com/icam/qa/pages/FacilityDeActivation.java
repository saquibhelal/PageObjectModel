package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class FacilityDeActivation extends TestBase {
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement deActivate;
	
	
	public FacilityDeActivation(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="De - Activate Facility";
		return valChck;
	}
	
	public void facilityDeActivation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		deActivate.click();
	}
	
	
	
	
	
	
	

}
