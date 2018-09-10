package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CourseType extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;

	@FindBy(how=How.CSS,using="#courseTypeName") public 
	WebElement typeName;
	
	@FindBy(how=How.CSS,using="#desc") public 
	WebElement desc;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public CourseType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateCourseTypePage(){
		String valCheck="Standard & Sections";
		return valCheck;
	}
	
	public void createCourseType(String typName,String dsc) throws Exception{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, typeName);
		typeName.sendKeys(typName);
		HighlightElement.highLightElement(driver, desc);
		desc.sendKeys(dsc);
		HighlightElement.highLightElement(driver, submit);
		submit.click();
	}
	
	
}
