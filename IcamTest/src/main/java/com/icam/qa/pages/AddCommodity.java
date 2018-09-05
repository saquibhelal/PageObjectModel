package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AddCommodity extends TestBase {
	
	@FindBy(css="#commodityName")
	WebElement commodityName;
	
	@FindBy(css="#commodityDesc")
	WebElement des;
	
	@FindBy(css="#commodityType")
	WebElement type;
	
	@FindBy(css="#commoditySubType")
	WebElement subType;
	
	@FindBy(css="#modelNo")
	WebElement unit;
	
	@FindBy(css="#threshold")
	WebElement threshold;
	
	@FindBy(css="#submit")
	WebElement submit;
	

	public AddCommodity(){
		PageFactory.initElements(driver, this);
	}
	
	public AddCommodity createCommodity(String comName,String comDes,String comThres) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		commodityName.sendKeys(comName);
		des.sendKeys(comDes);
		Select select= new Select(type);
		select.selectByVisibleText("Asset");
		Select select1= new Select(subType);
		select1.selectByVisibleText("IT");
		Select select2= new Select(unit);
		select2.selectByVisibleText("PIECE");
		threshold.sendKeys(comThres);
		submit.click();
		
		return new AddCommodity();
	}
	
}
