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
	
	@FindBy(css="#status")
	WebElement status;
	
	@FindBy(css="#department")
	WebElement dep;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public GenerateTicket(){
		PageFactory.initElements(driver, this);
	}
	
	public GenerateTicket ticketCreation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		/*Select select=new Select(dep);
		select.selectByVisibleText("ACADEMICS DEPARTMENT");
		Select select2=new Select(status);
		select2.selectByVisibleText("WIP");
		Select select3=new Select(category);
		select3.selectByVisibleText("LEAVE APPROVAL");*/
		driver.findElement(By.cssSelector("#ticketSummary")).sendKeys("QA Summery");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testing description");
		//submit.click();
		
		return new GenerateTicket();
	}

}
