package com.icam.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FractionDigitsDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class TaxSetUp extends TestBase {

	@FindBy(xpath="//input[@id='taxName']")
	WebElement taxName;
	
	@FindBy(xpath="//input[@id='percentage']")
	WebElement percentage;
	
	@FindBy(xpath="//select[@id='taxStatus']")
    WebElement status;
	
	@FindBy(xpath="//button[@value='SUBMIT']")
	WebElement submit;
	
	
	public TaxSetUp(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="TAX Setup";
		return valChck;
	}
	
	public void taxSetup() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		taxName.sendKeys("GST");
		percentage.sendKeys("18");
		Select select=new Select(status);
		select.selectByVisibleText("Active");
		submit.click();
		
	}
	
}
