package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AccessTypeRoleMapping extends TestBase {

	@FindBy(xpath="//input[@id='accessTypeName']")
	WebElement accesstypeName;
	
	@FindBy(xpath="//textarea[@id='accessTypeDesc']")
	WebElement desc;
	
	@FindBy(xpath="//select[@id='roleName']")
	WebElement rollName;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	public AccessTypeRoleMapping(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		 String	valchck="Access Type Role Mapping";
		 return valchck;
		}
		
	
	public void accessTypeMapp() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		accesstypeName.sendKeys("Academic Test");
		desc.sendKeys("Academic Testing");
		Select select=new Select(rollName);
		select.selectByVisibleText("ACADEMICS ADMINISTRATOR");
		//submit.click();
  }
	
	
	
}
