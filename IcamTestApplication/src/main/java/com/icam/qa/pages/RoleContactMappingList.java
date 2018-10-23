package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class RoleContactMappingList extends TestBase{
	
	@FindBy(xpath="//select[@id='query']")
	WebElement searchType;
	
	@FindBy(xpath="//input[@id='data']")
	WebElement search;
	
	@FindBy(xpath="//*[@id='command']/section/footer/button[1]")
	WebElement submit;
	
	public RoleContactMappingList(){
		PageFactory.initElements(driver, this);
	}

	public String validatePageTitle(){
		String valChck="Role Contact Mapping List";
		return valChck;
	}
	
	public void roleContactMapping() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(searchType);
		select.selectByVisibleText("User ID");
		search.sendKeys("ssp_mkd");
		submit.click();
	}
	
}
