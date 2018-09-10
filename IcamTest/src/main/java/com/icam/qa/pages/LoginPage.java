package com.icam.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// @Author Saquib
	// Page Factory - OR:
	@FindBy(name="userId")
	WebElement userId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement signInBtn;
	
	@FindBy(xpath="//img[contains(@src,logo.png)]")
    WebElement icamLogo;
	
	// Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	// Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateIcamLogo(){
		return icamLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd){
		userId.sendKeys(un);
		password.sendKeys(pwd);
		signInBtn.click();
		return new HomePage();
	}
}
