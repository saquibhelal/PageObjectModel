package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class AddHostelFacility extends TestBase {

	@FindBy(how=How.CSS,using="#hostelFacilityName")
	@CacheLookup WebElement facilityName;
	
	@FindBy(how=How.CSS,using="#hostelFacilityDesc")
	@CacheLookup WebElement desc;
	
	@FindBy(how=How.XPATH,using="//input[@name='GENERAL']")
	@CacheLookup WebElement cat1;
	
	@FindBy(how=How.XPATH,using="//input[@name='SC']")
	@CacheLookup WebElement cat2;
	
	@FindBy(how=How.XPATH,using="//input[@name='ST']")
	@CacheLookup WebElement cat3;
	
	@FindBy(how=How.XPATH,using="//input[@name='OBC']")
	@CacheLookup WebElement cat4;
	
	@FindBy(xpath="//input[@name='hostelName']")
	WebElement chck;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public AddHostelFacility(){
		PageFactory.initElements(driver, this);
	}
	
	public AddHostelFacility facilityAddToHostel(String fName,String descp,String gene,
			String sc,String st,String obc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		facilityName.sendKeys(fName);
		desc.sendKeys(descp);
		Thread.sleep(2000);
		cat1.clear();
		cat1.sendKeys(gene);
		cat2.clear();
		cat2.sendKeys(sc);
		cat3.clear();
		cat3.sendKeys(st);
		cat4.clear();
		cat4.sendKeys(obc);
		chck.click(); // decimal value issue..........
		submit.click();
		return new AddHostelFacility();
	}
	

}
