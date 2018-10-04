package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class FacilityList extends TestBase {
	
	@FindBy(xpath="//*[@id='facilityCode']")
	WebElement list;
	
	@FindBy(xpath="//button[@id='edit']")
	WebElement editBtn;
	
	@FindBy(xpath="//input[@id='facilityName']")
	WebElement fName;
	
	@FindBy(xpath=".//*[@id='submit']")
	WebElement submit;
	
	
	public FacilityList(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePage(){
		String valChck="Edit Facility";
		return valChck;
	}
	
	public void facilityList() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		list.click();
		editBtn.click();
		fName.clear();
		fName.sendKeys("Selenium Testing");
		//submit.click();
	}
	
}
