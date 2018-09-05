package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CommodityDetails extends TestBase{

	@FindBy(css="#commodityCode")
	WebElement comdty;
	
	@FindBy(xpath="#commodityCode1")
	WebElement chck;
	
	@FindBy(css="#model1")
	WebElement mdNo;
	
	@FindBy(css="#warranty1")
	WebElement wrnty;
	
	@FindBy(css="#depreciation1")
	WebElement deprectn;
	
	@FindBy(css="#edit")
	WebElement edit;
	
	@FindBy(css="#update")
	WebElement update;
	
	public CommodityDetails(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateCommodityDetailsPage(){
		String valcheck="Individual Commodity Details";
		return valcheck;
	} 
	
	public CommodityDetails addCommodityDetails(String mdlNo,String wnty,String dep) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(comdty);
		select.selectByVisibleText("DUSTER");
		chck.click();
		Thread.sleep(2000);
		edit.click();??// unable to locate element.....
		mdNo.sendKeys(mdlNo);
		wrnty.sendKeys(wnty);
		deprectn.sendKeys(dep);
		update.click();
		return new CommodityDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
