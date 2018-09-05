package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CreateHostel extends TestBase {
	
	HighlightElement highLight;
	
	@FindBy(css="#hostelType")
	WebElement hostelType;
	
	@FindBy(how=How.CSS,using="#hostelName")
	WebElement hostelName;
	
	@FindBy(how=How.CSS,using="#hostelAbbreviation")
	WebElement abbrevation;
	
	@FindBy(css="#gender")
	WebElement gender;
	
	@FindBy(how=How.CSS,using="#zone")
	WebElement zone;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateHostel(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddHostelpage(){
		String vCheck="Create Hostel";
		return vCheck;
	}
	
	public CreateHostel hostelCreation(String hslName,String abbr,String zon) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
        HighlightElement.highLightElement(driver, hostelType);
		Select select=new Select(hostelType);
		select.selectByVisibleText("Fargo");
        HighlightElement.highLightElement(driver, hostelName);
		hostelName.sendKeys(hslName);
        HighlightElement.highLightElement(driver, abbrevation);
		abbrevation.sendKeys(abbr);//cannot take all row value at a time from excel
        HighlightElement.highLightElement(driver, gender);
		Select select1=new Select(gender);
		select1.selectByVisibleText("Male");
        HighlightElement.highLightElement(driver, zone);
		zone.sendKeys(zon);
        HighlightElement.highLightElement(driver, submit);
		submit.click();
		
		return new CreateHostel();
	}
	
	

}
