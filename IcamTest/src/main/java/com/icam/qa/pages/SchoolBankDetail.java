package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class SchoolBankDetail extends TestBase{
	
	@FindBy(css="#bankName")
	WebElement bnkName;
	
	@FindBy(css="#branchName")
	WebElement brnchName;
	
	@FindBy(css="#accountNo")
	WebElement accountNo;
	
	@FindBy(css="#bankIfscCode")
	WebElement ifscCode;
	
	@FindBy(css="#bankBranchCode")
	WebElement brnchCode;
	
	@FindBy(css="#bankLocation")
	WebElement location;
	
	@FindBy(css="#openingBal")
	WebElement bal;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	public SchoolBankDetail(){
		PageFactory.initElements(driver, this);
	}
	
	
	public SchoolBankDetail createSchoolBankDetail(String bNm,String brNm,String acc,
			String iscCd,String brCd,String loc,String opBl) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		bnkName.sendKeys(bNm);
		Thread.sleep(2000);
		brnchName.sendKeys(brNm);
		Thread.sleep(2000);
		accountNo.sendKeys(acc);
		Thread.sleep(2000);
		ifscCode.sendKeys(iscCd);
		Thread.sleep(2000);
		brnchCode.sendKeys(brCd);
		Thread.sleep(2000);
		location.sendKeys(loc);
		Thread.sleep(2000);
		bal.sendKeys(opBl);
		Thread.sleep(2000);
		//submit.click();
		
		return new SchoolBankDetail();
	}
	
	
	
	
	
	

}
