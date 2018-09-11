package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class GenerateConsolidateMarks extends TestBase {
	
	@FindBy(xpath="//select[@name='academicYearCode']")
	WebElement academicYear;
	
	@FindBy(xpath="//select[@name='standardCode']")
	WebElement standard;
	
	@FindBy(xpath="//select[@name='sectionCode']")
	WebElement section;
	
	@FindBy(xpath="//select[@name='examName']")
	WebElement exam;
	
	@FindBy(xpath="//*[@id='submitGrade']")
	WebElement submit;
	
	public GenerateConsolidateMarks(){
		PageFactory.initElements(driver, this);
	}
	
	public void generateConsMark() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(academicYear);
		select.selectByVisibleText("2018-2019");
		Select select1=new Select(standard);
		select1.selectByVisibleText("VI");
		Select select2=new Select(section);
		select2.selectByVisibleText("A");
		Select select3=new Select(exam);
		select3.selectByVisibleText("Half Yearly Exam");
		submit.click();
		
	}
	

}
