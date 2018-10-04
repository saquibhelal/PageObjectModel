package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateVoucherType extends TestBase {
	
	@FindBy(xpath="//input[@id='voucherTypeName']")
	WebElement voucherTypeName;
	
	@FindBy(xpath=".//*[@id='department']")
	WebElement radioBtn;
	
	@FindBy(xpath=".//*[@id='command']/section/footer/button[1]")
	WebElement submit;
	
	public CreateVoucherType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Create Voucher Type";
		return valChck;
	}
	
	public void voucherCreation() throws InterruptedException{
		
	  driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	  Thread.sleep(3000);
	  voucherTypeName.sendKeys("RPA");
	  radioBtn.click();
	  //submit.click();
	}
	
}
