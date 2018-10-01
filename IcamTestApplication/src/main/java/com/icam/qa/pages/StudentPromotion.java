package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class StudentPromotion extends TestBase {

	@FindBy(xpath="//select[@id='standard']")
	WebElement standard;
	
	@FindBy(xpath="//select[@id='section']")
	WebElement sec;
	
	@FindBy(xpath="//select[@id='type']")
	WebElement type;
	
	@FindBy(xpath="//select[@id='toStandard']")
	WebElement toStandard;
	
	@FindBy(xpath="//select[@id='toSection']")
	WebElement toSec;
	
	@FindBy(xpath="//*[@id='studentList']/thead/tr[17]/td[1]/input")
	WebElement student;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public StudentPromotion(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePage(){
		String valChck="Student Promotion";
		return valChck;
	}
	
	public void studentPromotion() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select = new Select(standard);
		select.selectByVisibleText("VI");
		Select select1= new Select(sec);
		select1.selectByVisibleText("A");
		Select select2= new Select(type);
		select2.selectByVisibleText("PROMOTE");
		Select select3=new Select(toStandard);
		select3.selectByVisibleText("VII");
		Select select4=new Select(toSec);
		select4.selectByVisibleText("A");
		student.click();
		submit.click();
	}
	
}
