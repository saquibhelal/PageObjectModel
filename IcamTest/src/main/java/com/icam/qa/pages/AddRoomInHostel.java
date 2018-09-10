package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AddRoomInHostel extends TestBase {

	// @Author Saquib
	@FindBy(css="#hostelName")
	WebElement hstlName;
	
	@FindBy(css="#roomTypeCode")
	WebElement roomCode;
	
	@FindBy(how=How.CSS,using="#roomName")
	@CacheLookup WebElement roomNo;
	
	@FindBy(how=How.CSS,using="#roomDesc")
	@CacheLookup WebElement pos;
	
	@FindBy(how=How.CSS,using="#bedTotal")
	@CacheLookup WebElement totalBed;
	
	@FindBy(xpath="//*[@id='submit']")
	WebElement submit;
	
	public AddRoomInHostel(){
		PageFactory.initElements(driver, this);
	}
	
	public AddRoomInHostel addingRoomInHostel(String roomNum,String roomPos,String bedCount) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(hstlName);
		select.selectByVisibleText("TAGORE");
		Thread.sleep(2000);
		Select select1=new Select(roomCode);
		select1.selectByVisibleText("AC");
		roomNo.sendKeys(roomNum);
		pos.sendKeys(roomPos);
		totalBed.sendKeys(bedCount);
		submit.click();
		return new AddRoomInHostel();
	}
	
	
	
	
	
	
	
	
	
	
	
}
