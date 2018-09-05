package com.icam.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class VendorType extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(css=".nav-parent.nav-expanded>a>span")
	WebElement officeAdminLink;
	
	@FindBy(linkText="Vendor Management")
	WebElement vendorManagementLink;
	
	@FindBy(linkText="Add Vendor Type")
	WebElement vendorType;
	
	@FindBy(css="#vendorTypeName")
	WebElement vendor;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	  
	public VendorType(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public VendorType createNewVendorType(String type) throws InterruptedException{
	
		js.executeScript("scroll(0,1500)","");
		Thread.sleep(5000);
		driver.switchTo().frame("frame");
		vendor.sendKeys(type);
		submit.click();
		return new VendorType();
	}
	
	
	
	
}
