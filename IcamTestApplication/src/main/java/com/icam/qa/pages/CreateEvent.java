package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateEvent extends TestBase {

	//@Author Saquib
	@FindBy(xpath="//input[@id='eventName']")
	WebElement eventName;
	
	@FindBy(xpath="//textarea[@id='eventDescription']")
	WebElement desc;
	
	@FindBy(xpath="//input[@id='eventIncharge']")
	WebElement incharge;
	
	@FindBy(xpath="//input[@id='smsEnabled']")
	WebElement chck;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public CreateEvent(){
		PageFactory.initElements(driver, this);
	}
	
	public void eventCreation(String evntNm,String evnDes,String inc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		eventName.sendKeys(evntNm);
		desc.sendKeys(evnDes);
		//chck.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('eventStartDate').value='22/12/2018'");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('eventEndDate').value='25/12/2018'");
		incharge.sendKeys(inc);
		String tagName=submit.getTagName();
		System.out.println("Submit button location is:"+submit.getLocation());
		
		System.out.println("----------Tag Name-------"+tagName);
		//submit.click();
		
		
	}
	
}
