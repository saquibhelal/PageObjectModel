package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class DisburseSalary extends TestBase {
	
	HighlightElement highLight;
	
	@FindBy(css="#resourceTypeName")
	WebElement resourceType;
	
	@FindBy(css="#year")
	WebElement year;
	
	@FindBy(css="#month")
	WebElement month;
	
	@FindBy(xpath="//*[@id='userId_anup.roy']")
	WebElement check0;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	public DisburseSalary(){
		PageFactory.initElements(driver, this);
	}
	
	
	public DisburseSalary createDisburseSalary() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		HighlightElement.highLightElement(driver, resourceType);
		Select select=new Select(resourceType);
		select.selectByVisibleText("TEACHING STAFF");
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, year);
		Select yr=new Select(year);
		yr.selectByVisibleText("2018");
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, month);
		Select mnth=new Select(month);
		mnth.selectByVisibleText("January");
	    check0.click();
		//submit.click();	
		return new DisburseSalary();
	}
	
	
	
	

}
