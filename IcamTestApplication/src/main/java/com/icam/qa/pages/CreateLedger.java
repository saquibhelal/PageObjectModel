package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateLedger extends TestBase {

	@FindBy(xpath="//input[@id='ledgerName']")
	WebElement ledgerName;
	
	@FindBy(xpath="//input[@id='openingBal']")
	WebElement openingBal;
	
	@FindBy(xpath="//select[@id='parentGroupCode']")
	WebElement parentGroup;
	
	@FindBy(xpath="//select[@id='subGroup']")
	WebElement subGroup;
	
	@FindBy(xpath="//select[@id='ledgerType']")
	WebElement ledgerType;
	
	@FindBy(xpath="//*[@id='command']/section/footer/button[1]")
	WebElement submit;
	
	
	public CreateLedger(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePagetTitle(){
		String valChck="Create Ledger";
		return valChck;
	}

	public void createLedger(String ledName,String opBal) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		ledgerName.sendKeys(ledName);
		openingBal.sendKeys(opBal);
		Select select=new Select(ledgerType);
		select.selectByVisibleText("Cash");
		Select select1=new Select(parentGroup);
		select1.selectByVisibleText("SHAREHOLDERS FUNDS");
		Select select3=new Select(subGroup);
		select3.selectByVisibleText("SHARE CAPITAL");
		submit.click();
	}
	
	
}
