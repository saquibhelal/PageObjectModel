package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateNewRole extends TestBase {

	@FindBy(css="#moduleName")
	WebElement moduleName;
	
	@FindBy(css="#roleName")
	WebElement roleName;
	
	@FindBy(css="#roleDescription")
	WebElement des;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateNewRole(){
		PageFactory.initElements(driver, this);
	}
	
	public  String validateRoelPage(){
		String Vcheck="Create Roles";
		return Vcheck;
	}
	public CreateNewRole roleCreation(String rolName,String desc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(moduleName);
		select.selectByVisibleText("ACADEMICS");
		roleName.sendKeys(rolName);
		des.sendKeys(desc);
		//submit.click();
		return new CreateNewRole();
	}
}
