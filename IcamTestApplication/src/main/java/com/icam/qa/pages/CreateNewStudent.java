package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateNewStudent extends TestBase {
	
	// @Author Saquib
	
	@FindBy(css="#courseId")
	WebElement standard;
	
	@FindBy(css="#userId")
	WebElement schoolNo;
	
	@FindBy(css="#firstName")
	WebElement firstName;
	
	@FindBy(css="#middleName")
	WebElement middleName;
	
	@FindBy(css="#lastName")
	WebElement lastName;
	
	@FindBy(css="#bloodGroup")
	WebElement bloodgroup;
	
	@FindBy(css="#category")
	WebElement category;
	
	@FindBy(css="#religion")
	WebElement religion;
	
	@FindBy(css="#motherTongue")
	WebElement motherTongue;
	
	@FindBy(css="#aadharCardNo")
	WebElement aadharNo;
	
	@FindBy(css="#house")
	WebElement house;
	
	@FindBy(css="#mobile")
	WebElement mobile;
	
	@FindBy(css=".next>a")
	WebElement next;//1st page end
	//-------------------------------
	@FindBy(css="#previousSchoolName")
	WebElement schoolName;
	
	@FindBy(css="#previousSchoolWebsite")
	WebElement website;
	
	@FindBy(css="#previousSchoolAddress")
	WebElement address;
	
	@FindBy(css="#previousSchoolPhone")
	WebElement phoneNo;
	
	@FindBy(css="#previousSchoolEmail")
	WebElement email;
	
	@FindBy(css="#previousAchivement")
	WebElement achievement;
	
	@FindBy(css=".next>a")
	WebElement next2;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	public CreateNewStudent(){
		PageFactory.initElements(driver, this);
	}
	
	public void createNewStudent(String schlNo,String fName,String mdleName,String lstName,String rlgn,String mTong
			,String adhrNo,String mblNo,String schName,String web,String addrs,String ph,String eml,
			String achiv) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		
		Select select=new Select(standard);
		select.selectByVisibleText("VI");
		schoolNo.sendKeys(schlNo);
		firstName.sendKeys(fName);
		middleName.sendKeys(mdleName);
		lastName.sendKeys(lstName);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dateOfBirth').value='10/04/2018'");
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('dateOfAdmission').value='12/04/2018'");
		
		Select select1=new Select(bloodgroup);
		select1.selectByVisibleText("A+");
		
		Select select2=new Select(category);
		select2.selectByVisibleText("GENERAL");
		
		religion.sendKeys(rlgn);
		motherTongue.sendKeys(mTong);
		aadharNo.sendKeys(adhrNo);
		
		Select select3=new Select(house);
		select3.selectByVisibleText("TAGORE");
		
		mobile.sendKeys(mblNo);
		
		next.click();	//1st page 
		//---------------------------------------------
		
		schoolName.sendKeys(schName);
		website.sendKeys(web);
		address.sendKeys(addrs);
		phoneNo.sendKeys(ph);
	    email.sendKeys(eml);
	    achievement.sendKeys(achiv);
	    next2.click();
	    submit.click();
	
		
		
		
	}
	
}
