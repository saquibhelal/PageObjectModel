package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class StandardDetails extends TestBase {
	
	@FindBy(linkText="Enter Standard Details")
	WebElement standardDetailsLink;
	
	
	@FindBy(css="#courseName")
	WebElement standardName;
	
	@FindBy(css="#courseType")
	WebElement courseType;
	
	@FindBy(xpath="//input[@value='ACTIVE']")
	WebElement availableStatus;
	
	@FindBy(css="#courseAcronym")
	WebElement acronym;
	
	@FindBy(css="#courseDuration")
	WebElement duration;
	
	@FindBy(xpath="//input[@value='OFFLINE']")
	WebElement mode;
	
	@FindBy(css="#A_capacity")
	WebElement capacity;
	
	@FindBy(css="#B_capacity")
	WebElement capacity2;
	
	@FindBy(css=".btn.btn-primary")
	WebElement submit;
	
	
	public StandardDetails(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateStandardDetailstPage(){
		String valcheck="Enter Standard Details";
		return valcheck;
	}
	
	public StandardDetails enterStandardDetails(String courseAcronym, String dur, String cap) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select name=new Select(standardName);
		name.selectByVisibleText("I");
		Select type=new Select(courseType);
		type.selectByVisibleText("LONG TERM");
		availableStatus.click();
		acronym.sendKeys(courseAcronym);
		duration.sendKeys(dur);
		mode.click();
		Thread.sleep(5000);
		capacity.clear();
		capacity.sendKeys(cap);
		capacity2.clear();
		capacity2.sendKeys(cap);
		submit.click();
		
		return new StandardDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
