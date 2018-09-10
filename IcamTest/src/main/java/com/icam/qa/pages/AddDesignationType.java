package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class AddDesignationType extends TestBase {
	
	// @Author Saquib
	@FindBy(css="#designationTypeName")
	WebElement desigType;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	public AddDesignationType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateDesignationTypePage(){
		String valcheck="Create New Designation Type";
		return valcheck;
	}
	
	public AddDesignationType createDesignationType(String desigTyp) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(3000);
		desigType.sendKeys(desigTyp);
		submit.click();
		return new AddDesignationType();
	}
	


}

	
	
	
	
	
	
	
	
	


