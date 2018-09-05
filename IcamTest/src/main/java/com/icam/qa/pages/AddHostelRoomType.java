package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class AddHostelRoomType extends TestBase {

	@FindBy(how=How.CSS,using="#roomTypeName")
	@CacheLookup WebElement roomType;
	
	@FindBy(how=How.XPATH,using="//input[@name='GENERAL']")
	@CacheLookup WebElement general;
	
	@FindBy(how=How.XPATH,using="//input[@name='SC']")
	@CacheLookup WebElement sc;
	
	@FindBy(how=How.XPATH,using="//input[@name='ST']")
	@CacheLookup WebElement st;
	
	@FindBy(how=How.XPATH,using="//input[@name='OBC']")
	@CacheLookup WebElement obc;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup WebElement submit;
	
	
	public AddHostelRoomType(){
		PageFactory.initElements(driver, this);
	}
	
	public void createHostelType(String romType,String gen,String scc,String stt,String obcc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		roomType.sendKeys(romType);
		general.clear();
		general.sendKeys(gen);
		sc.clear();
		sc.sendKeys(scc);
		st.clear();
		st.sendKeys(stt);
		obc.clear();
		obc.sendKeys(obcc);
		submit.click();
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
}
