package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class AddDepartment extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(css="#departmentName")
	WebElement departmentName;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	public AddDepartment(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddDepartmentPage(){
		String valcheck="Add Department";
		return valcheck;
	}
	
	public AddDepartment createDepartment(String depName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(3000);
        HighlightElement.highLightElement(driver, departmentName);
        departmentName.sendKeys(depName);
        submit.click();
		return new AddDepartment();
	}
	

}
