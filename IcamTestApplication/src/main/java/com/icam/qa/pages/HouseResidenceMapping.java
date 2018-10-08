package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class HouseResidenceMapping extends TestBase {
	
	@FindBy(xpath="//select[@id='houseName']")
	WebElement houseName;
	
	@FindBy(xpath="//select[@id='residenceName']")
	WebElement resName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public HouseResidenceMapping(){
		PageFactory.initElements(driver, this);
	}
	
	public void createHouseResMapping() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(houseName);
		select.selectByVisibleText("NETAJI");
		Select select1=new Select(resName);
		select1.selectByVisibleText("TESTING");
		submit.click();
	}
	
	
	
	public String validatePageTitle(){
		String valChck="Create House-Residence Mapping";
		return valChck;
	}
	

}
