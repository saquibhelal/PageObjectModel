package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class GenerateTicket extends TestBase {
	
	// @Author Saquib
	@FindBy(css="#ticketServiceName")
	WebElement category;
	
	@FindBy(css="#ticketSummary")
	WebElement summary;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public GenerateTicket(){
		PageFactory.initElements(driver, this);
	}
	
	public GenerateTicket ticketCreation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(category);
		select.selectByVisibleText("LEAVE APPROVAL");
		//driver.findElement(By.cssSelector("summary")).sendKeys("QA Summery");??
		//driver.findElement(By.xpath("description")).sendKeys("Testing description");??
		//submit.click();
		
		return new GenerateTicket();
	}

}
