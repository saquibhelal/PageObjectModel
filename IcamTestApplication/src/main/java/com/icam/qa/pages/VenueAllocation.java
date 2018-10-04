package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class VenueAllocation extends TestBase {
	
	
	@FindBy(xpath="//select[@id='venueCode']")
	WebElement venueName;
	
	@FindBy(xpath="//textarea[@id='zoneDesc']")
	WebElement desc;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	public VenueAllocation(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Venue Allocation";
		return valChck;
	}
	
	public void venueAllocation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(venueName);
		select.selectByVisibleText("ECO SPACE");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('startDate').value='05/04/2018'");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('endDate').value='07/04/2018'");
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("document.getElementById('startTime').value='11:00'");
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("document.getElementById('endTime').value='2:15'");
		desc.sendKeys("Testing");
		submit.click();
	}

}
