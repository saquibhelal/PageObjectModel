package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class HostelType extends TestBase {

	// @Author Saquib
	@FindBy(how=How.CSS,using="#hostelTypeName")
	WebElement hstlName;
	
	@FindBy(xpath="//*[@id='submitButton']")
	WebElement submit;
	
	public HostelType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHostelPage(){
		String valcheck="Create New HostelType";
		return valcheck;
	}
	
	
	
	public HostelType createHostelType(String hstlTyp) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, hstlName);
		hstlName.sendKeys(hstlTyp); // only first row value fetch......
		submit.click();
		return new HostelType();
	}
}
