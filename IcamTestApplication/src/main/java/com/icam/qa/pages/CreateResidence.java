package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateResidence extends TestBase {
	
	@FindBy(xpath="//select[@id='hostelType']")
	WebElement resType;
	
	@FindBy(xpath="//input[@id='hostelName']")
	WebElement resName;
	
	@FindBy(xpath="//input[@id='hostelAbbreviation']")
	WebElement resAbbrev;
	
	@FindBy(xpath="//select[@id='gender']")
	WebElement res;
	
	@FindBy(xpath="//input[@id='zone']")
	WebElement zoneRes;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public CreateResidence(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Create Residence";
		return valChck;
	}
	
	
	public void createResidence(String resNme,String resAbr,String rsc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(resType);
		select.selectByVisibleText("Student House");
		resName.sendKeys(resNme);
		resAbbrev.sendKeys(resAbr);
		Select select1=new Select(res);
		select1.selectByVisibleText("Male");
		zoneRes.sendKeys(rsc);
		submit.click();
		
	}
		

}
