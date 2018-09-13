package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class MapVendorCommodity extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;

	@FindBy(css="#vendorName")
	WebElement vendorName;
	
	@FindBy(css="#check0")
	WebElement check0;
	
	@FindBy(css="#txt0")
	WebElement tx0;
	
	@FindBy(css="#check1")
	WebElement check1;
	
	@FindBy(css="#txt1")
	WebElement tx1;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	public MapVendorCommodity(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateCommodityVendorMappingPage(){
		String valcheck="Commodity Vendor Mapping";
		return valcheck;
	}
	
	public MapVendorCommodity doCommodityMapping(String cm1) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        HighlightElement.highLightElement(driver, vendorName);
		Select select= new Select(vendorName);
		select.selectByVisibleText("Mukesh");
        HighlightElement.highLightElement(driver, check0);
		check0.click();
        HighlightElement.highLightElement(driver, tx0);
        tx0.clear();
		tx0.sendKeys(cm1);
        HighlightElement.highLightElement(driver, check1);
		check1.click();
        HighlightElement.highLightElement(driver, tx1);
        tx1.clear();
		tx1.sendKeys(cm1);
        HighlightElement.highLightElement(driver, submit);
        //submit.click();
		return new MapVendorCommodity();
	}
	
	
}
