package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class NominalRollList extends TestBase {
	
	@FindBy(xpath="//select[@name='standardCode']")
	WebElement standard;
	
	@FindBy(xpath="//select[@name='sectionCode']")
	WebElement sec;
	
	@FindBy(xpath="//*[@id='submit']")
	WebElement submit;
	
	
	public NominalRollList(){
		PageFactory.initElements(driver, this);
	}
	
	public void nomianlReportr() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(standard);
		select.selectByVisibleText("VI");
		Select select1=new Select(sec);
		select1.selectByVisibleText("A");
		//submit.click();
		
	}

}
