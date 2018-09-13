package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CreateVenue extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(how=How.CSS,using="#venueName")
	@CacheLookup WebElement venueName;
	
	@FindBy(how=How.CSS,using="#venueDesc")
	@CacheLookup WebElement desc;
	
	@FindBy(how=How.CSS,using="#availableSeat")
	@CacheLookup WebElement seat;
	
	@FindBy(css="#location")
	WebElement location;
	
	@FindBy(css="#venueCode")
	WebElement vendueCode;
	
	@FindBy(how=How.CSS,using="#roomNo") 
    @CacheLookup WebElement roomNo;
	
	@FindBy(css="#venueTypeCode")
	WebElement venueType;
	
	@FindBy(how=How.CSS,using="#building")
	@CacheLookup WebElement building;
	
	@FindBy(how=How.CSS,using="#floor")
	@CacheLookup WebElement floor;
	
	@FindBy(xpath="//h2[contains(text(),'Create Venue')]")
	public WebElement valCheck;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateVenue(){
		PageFactory.initElements(driver, this);
	}
	
	
	/*public String validateVenuePage(){
		
		return driver.getTitle();
	}*/
	public String validateVenuePage(){
		String valcheck="Create Venue";
		return valcheck;
	}
	
	public CreateVenue venueCreation(String venName,String venDes,String venSeat,
			String venRoom,String venBuild,String venFloor) throws InterruptedException{
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        HighlightElement.highLightElement(driver, venueName);
		venueName.sendKeys(venName);
        HighlightElement.highLightElement(driver, desc);
		desc.sendKeys(venDes);
        HighlightElement.highLightElement(driver, seat);
		seat.sendKeys(venSeat);
		Thread.sleep(3000);
        HighlightElement.highLightElement(driver, location);
		Select select=new Select(location);
		select.selectByVisibleText("SIGNATURE BUILDING");
		Thread.sleep(3000);
        HighlightElement.highLightElement(driver, venueType);
		Select select1=new Select(venueType);
		select1.selectByVisibleText("Examination Center");
        HighlightElement.highLightElement(driver, vendueCode);
		Select select2=new Select(vendueCode);
		select2.selectByVisibleText("XAVIER COLLEGE");
        HighlightElement.highLightElement(driver, roomNo);
		roomNo.sendKeys(venRoom);
	    Thread.sleep(2000);
        HighlightElement.highLightElement(driver, building);
		building.sendKeys(venBuild);
        HighlightElement.highLightElement(driver, floor);
		floor.sendKeys(venFloor);
        HighlightElement.highLightElement(driver, submit);
		//submit.click();

		return new CreateVenue();
		
	}
	
	
	
	
	
}
