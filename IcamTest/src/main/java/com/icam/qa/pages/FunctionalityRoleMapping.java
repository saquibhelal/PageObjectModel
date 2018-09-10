package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class FunctionalityRoleMapping extends TestBase {

	// @Author Saquib
	@FindBy(css="#moduleName")
	WebElement moduleName;
	
	@FindBy(css="#roleName")
	WebElement roleName;
	
	@FindBy(xpath=".//*[@id='submitButton']")
	WebElement submit;
	
	public FunctionalityRoleMapping(){
		PageFactory.initElements(driver, this);
	}
	
	
	public FunctionalityRoleMapping doFunctionalityRoleMapping() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(moduleName);
		select.selectByValue("ACAD");
		Thread.sleep(2000);
		Select select1=new Select(roleName);
		select1.selectByVisibleText("ACADEMICS ADMINISTRATOR");
		submit.click();
		return new FunctionalityRoleMapping();
	}
	
}
