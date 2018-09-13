package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class AssignHostelToStudent extends TestBase {

	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(css="#userId")
	WebElement userId;
	
	@FindBy(css="#hostelName")
	WebElement hstlName;
	
	@FindBy(css="#roomTypeName")
	WebElement roomTypeName;
	
	@FindBy(css="#roomName")
	WebElement roomNo;
	
	@FindBy(xpath="//*[@id='submitButton']")
	WebElement submit;
	
	public AssignHostelToStudent(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateAssignHostelStundentPage(){
		String valcheck="Student And Hostel Details";
		return valcheck;
	}
	
	
	public AssignHostelToStudent hostelAssigned() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        HighlightElement.highLightElement(driver, userId);
		Select select=new Select(userId);
		select.selectByVisibleText("2002");
		Thread.sleep(2000);
        HighlightElement.highLightElement(driver, hstlName);
		Select select1=new Select(hstlName);
		select1.selectByVisibleText("TESTQA");
		Thread.sleep(2000);
        HighlightElement.highLightElement(driver, roomTypeName);
		Select select2=new Select(roomTypeName);
		select2.selectByVisibleText("AC");
		Thread.sleep(2000);
        HighlightElement.highLightElement(driver, roomNo);
		Select select3=new Select(roomNo);
		select3.selectByVisibleText("12");
        HighlightElement.highLightElement(driver, submit);
		submit.click();
		
		return new AssignHostelToStudent();
	}
	
	
}
