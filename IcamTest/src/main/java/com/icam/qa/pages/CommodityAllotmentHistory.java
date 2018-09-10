package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CommodityAllotmentHistory extends TestBase{
	
	
	// @Author Saquib
	@FindBy(how=How.CSS,using="#commodityCode")
	 WebElement commodity;
	
	@FindBy(how=How.CSS,using="#individualCommodity")
	 WebElement indCom;
	
	public CommodityAllotmentHistory(){
		PageFactory.initElements(driver, this);
	}
	
	
	public CommodityAllotmentHistory checkCommodityAllotmentHistory(){
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Select com = new Select(commodity);
		com.selectByVisibleText("CHAIR");
		Select indcomm = new Select(indCom);
		indcomm.selectByVisibleText("CHAIR-1");
		return new CommodityAllotmentHistory();
	}
	

}
