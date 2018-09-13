package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class AddDesignationLevel extends TestBase {
	
	// @Author Saquib
	@FindBy(css="#designationLevelName")
	WebElement desigLevel;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	
	public AddDesignationLevel(){
		PageFactory.initElements(driver, this);
	}
	
	public AddDesignationLevel createDesignationLevel(String dsgLevel) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		desigLevel.sendKeys(dsgLevel);
		submit.click();
		return new AddDesignationLevel();
	}
	
}
