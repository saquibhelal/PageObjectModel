package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class SchoolNote extends TestBase {
	
	@FindBy(xpath="//input[@id='note']")
	WebElement notes;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement desc;
	
	@FindBy(xpath=".//select[@id='recipients']")
	WebElement recipient;
	
	@FindBy(xpath="//*[@id='rollNumber']")
	WebElement rollNo;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public SchoolNote(){
		PageFactory.initElements(driver, this);
	}
	
	public void schoolNote() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		notes.sendKeys("QTP");
		desc.sendKeys("HP QTP TESTING");
		Select select = new Select(recipient);
		select.selectByVisibleText("Roll");
		rollNo.sendKeys("");
		boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b1);
		submit.click();
	}
	

}
