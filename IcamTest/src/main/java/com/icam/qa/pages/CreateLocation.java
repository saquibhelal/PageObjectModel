package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateLocation extends TestBase {

	// @Author Saquib
	@FindBy(how=How.CSS,using="#locationName")
	@CacheLookup WebElement locationName;
	
	@FindBy(how=How.CSS,using="#locationDesc")
	@CacheLookup WebElement desc;
	
	@FindBy(how=How.CSS,using="#area")
	@CacheLookup WebElement area;
	
	@FindBy(css="#zone")
	WebElement zone;
	
	@FindBy(css="#country")
	WebElement country;
	
	@FindBy(css="#state")
	WebElement state;
	
	@FindBy(css="#city")
	WebElement city;
	
	@FindBy(css="#pin")
	WebElement pin;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateLocation(){
		PageFactory.initElements(driver, this);
	}
	
	public CreateLocation locationCreation(String locName,String locDes,String locArea,
			String locCity,String locPin) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		locationName.sendKeys(locName);
		desc.sendKeys(locDes);
		area.sendKeys(locArea);
		Thread.sleep(3000);
		Select select=new Select(zone);
		select.selectByVisibleText("EAST ZONE");
		Thread.sleep(3000);
		Select select1=new Select(country);
		select1.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		Select select2=new Select(state);
		select2.selectByVisibleText("WEST BENGAL");
		Thread.sleep(2000);
		city.sendKeys(locCity);
		pin.sendKeys(locPin);
		submit.click();// Page working perfectly.........
		
		return new CreateLocation();
	}
	
	
	
	
	
	
	
	
	
	
	
}
