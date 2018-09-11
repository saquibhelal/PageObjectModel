package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class ScheduleInterview extends TestBase{

	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(how=How.CSS,using="#firstName")
	@CacheLookup WebElement firstName;
	
	@FindBy(how=How.CSS,using="#lastName")
	@CacheLookup WebElement lastName;
	
	@FindBy(css="#genderM")
	WebElement gender;
	
	@FindBy(css="#dateOfBirth")
	WebElement dob;
	
	@FindBy(how=How.CSS,using="#qualification")
	@CacheLookup WebElement qualification;
	
	@FindBy(how=How.CSS,using="#specialization")
	@CacheLookup WebElement subjctSpecliz;
	
	@FindBy(css="#dateOfInterview")
	WebElement doi;
	
	@FindBy(css="#teachingLevelName")
	WebElement teachingLevelName;
	
	@FindBy(css="#examinerName")
	WebElement examinerName;
	
	@FindBy(css="#roomNumber")
	WebElement venue;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public ScheduleInterview(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateSchedulePage(){
		String valCheck="Schedule Teacher Interview";
		return valCheck;
	}
	
	public void createSchedule(String frstName,String lstName,String highQual,String sbjctSpc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, firstName);
		firstName.sendKeys(frstName);
		HighlightElement.highLightElement(driver, lastName);
		lastName.sendKeys(lstName);		
		HighlightElement.highLightElement(driver, gender);
		gender.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dateOfBirth').value='12/10/1991'");
		HighlightElement.highLightElement(driver, qualification);
		qualification.sendKeys(highQual);
		Thread.sleep(1000);
		HighlightElement.highLightElement(driver, subjctSpecliz);
		subjctSpecliz.sendKeys(sbjctSpc);
		Thread.sleep(1000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('dateOfInterview').value='12/07/2018'");
		Thread.sleep(1000);
		HighlightElement.highLightElement(driver, teachingLevelName);
		Select select=new Select(teachingLevelName);
		select.selectByVisibleText("SECONDARY");
		Thread.sleep(1000);
		HighlightElement.highLightElement(driver, examinerName);
		Select select1=new Select(examinerName);
		select1.selectByVisibleText("naimisha.ghosh");
		Thread.sleep(1000);
		HighlightElement.highLightElement(driver, venue);
		Select select2=new Select(venue);
		select2.selectByVisibleText("CAMPUS");
		//submit.click();
		
		
	}
}
