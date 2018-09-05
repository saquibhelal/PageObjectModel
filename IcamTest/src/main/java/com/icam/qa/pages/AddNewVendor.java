package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class AddNewVendor extends TestBase {
	
	HighlightElement highLight;
	
	@FindBy(css="#vendorName")
	WebElement vendorName;
	
	@FindBy(css="#vendorType")
	WebElement selectVendor;
	
	@FindBy(css="#vendorContactNo1")
	WebElement contactNo;
	
	@FindBy(css="#emailId")
	WebElement email;
	
	@FindBy(css="#address")
	WebElement address;
	
	@FindBy(css="#bankName")
	WebElement bankName;
	
	@FindBy(css="#accountNo")
	WebElement accountNo;
	
	@FindBy(css="#bankCode")
	WebElement ifscCode;
	
	@FindBy(css="#bankLocation")
	WebElement bankLocation;
	
	@FindBy(css="#branchCode")
	WebElement branchCode;
	
	@FindBy(css="#openingBal")
	WebElement openingBal;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	
	public AddNewVendor(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public AddNewVendor createVendor(String name,String contact,String emil,String adress,String bkName,
			String accntNo,String ifsc,String location,String code,String opngBal) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		 HighlightElement.highLightElement(driver, vendorName);
		vendorName.sendKeys(name);
	    HighlightElement.highLightElement(driver, selectVendor);
		Select select=new Select(selectVendor);
		select.selectByVisibleText("Mess Vendor");
	    HighlightElement.highLightElement(driver, contactNo);
		contactNo.sendKeys(contact);
	    HighlightElement.highLightElement(driver, email);
		email.sendKeys(emil);
	    HighlightElement.highLightElement(driver, address);
		address.sendKeys(adress);
	    HighlightElement.highLightElement(driver, bankName);
		bankName.sendKeys(bkName);
	    HighlightElement.highLightElement(driver, accountNo);
		accountNo.sendKeys(accntNo);
	    HighlightElement.highLightElement(driver, ifscCode);
		ifscCode.sendKeys(ifsc);
	    HighlightElement.highLightElement(driver, bankLocation);
		bankLocation.sendKeys(location);
	    HighlightElement.highLightElement(driver, branchCode);
	    branchCode.sendKeys(code);
	    HighlightElement.highLightElement(driver, openingBal);
		openingBal.sendKeys(opngBal);
	    HighlightElement.highLightElement(driver, submit);
		submit.click();
		
		return new AddNewVendor();
	}
	
}
