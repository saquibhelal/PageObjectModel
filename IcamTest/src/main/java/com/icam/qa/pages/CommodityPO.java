package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CommodityPO extends TestBase{
	
	
	@FindBy(how=How.XPATH,using="//select[@id='departmentCode']")
	 WebElement depCode;
	
	@FindBy(how=How.CSS,using="##vendor")
	 WebElement vendorName;
	
	@FindBy(how=How.CSS,using="#quantity1")
	@CacheLookup WebElement quantity;
	
	@FindBy(how=How.CSS,using="#discount1")
	@CacheLookup  WebElement discount;
	
	@FindBy(how=How.CSS,using="#submit")
	 WebElement submit;
	
	
	public CommodityPO generateCommodityPo(String quanty,String disc) throws InterruptedException{
		//driver.switchTo().frame("frame");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(depCode);??// error in this line NullPointerExceprion...
		//Thread.sleep(4000);
		select.selectByVisibleText("ACADEMIC DEPARTMANT");
		Select ven=new Select(vendorName);
		ven.selectByVisibleText("Mukesh  (Mess Vendor)");
		quantity.sendKeys(quanty);
		discount.sendKeys(disc);
		//submit.click();
		
		return new CommodityPO();
	}
	
	
	
	
	
	
	
	

}
