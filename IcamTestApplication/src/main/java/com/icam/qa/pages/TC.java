package com.icam.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class TC extends TestBase {
	
	@FindBy(xpath="//input[@id='rollNumber']")
    WebElement rollNo;	
	
	@FindBy(xpath="//button[@id='detailsButton']")
	WebElement getDetails;
	
	@FindBy(xpath="//select[@id='reason']")
    WebElement reason;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement desc;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	WebElement grantTc;
	
	
	public TC(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void generateTc() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		rollNo.sendKeys("5082");
		getDetails.click();
		Select select= new Select(reason);
		select.selectByVisibleText("PASSOUT");
		desc.sendKeys("Test");
		grantTc.click();
		
	}
	
	public String validatePage(){
		String titleChck="Create Tc";
		return titleChck;
	}
	
	
	
	
	
}