package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class MapRoleContact extends TestBase {

	// @Author Saquib
	@FindBy(css="#roleName")
	WebElement roleName;
	
	@FindBy(css="#resourceTypeName")
	WebElement resName;
	
	@FindBy(xpath="//*[@id='userId0']")
	WebElement  userID;
	
	@FindBy(css=".ui-corner-all")
	WebElement drp;
	
	@FindBy(xpath="//*[@id='submit']")
	WebElement submit;
	
	
	public MapRoleContact(){
		PageFactory.initElements(driver, this);
	}
	
	public MapRoleContact doMapRoleContact() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(roleName);
		select.selectByVisibleText("ACADEMICS ADMINISTRATOR");
		Select select1=new Select(resName);
		select1.selectByVisibleText("TEACHING STAFF");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("#userId0")).sendKeys("anup.roy");??// use action to select userId
		/*Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(""))).build().perform();*/
		//drp.click();
		submit.click();
		return new MapRoleContact();
	}
}
