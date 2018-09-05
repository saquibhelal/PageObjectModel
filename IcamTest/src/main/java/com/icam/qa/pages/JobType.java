package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class JobType extends TestBase{
	HomePage homePage;
//	TestBase driver;
	
	public JobType(){
		PageFactory.initElements(driver, this);  // this is your constructor , either you can simple access the TestBase Driver, same
	}
	
	@FindBy(how = How.CSS,using="#jobTypeName") 
	@CacheLookup public WebElement jobName;
	@FindBy(how = How.CSS,using="#submitButton")
	@CacheLookup public WebElement submit;
	
	
	
	
	
	

//	public JobType(TestBase driver){
//		this.driver= driver;
//	} WORK SAME
	
	/*public JobType createjobType(String jName) throws InterruptedException{
		
		driver.switchTo().frame("frame");
//		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		jobName.sendKeys(jName);
		//submit.click();
		return new JobType();
	}*/
	
	
	public void getTextByRowColNum(int row,int col,String givenText)
		{
			String text=null;
			try {
				text = driver.findElement(By.xpath("//*[@id='datatable-editable']/tbody/tr["+row+"]/td["+col+"]")).getText();
			} catch (Exception e) {
				// TODO: handle exception
			}
		if(givenText.equals(text))
			{
				System.out.println("Found Text : "+text);
			} else
			{
				System.out.println("No Text Found");
			}
		}

	/*public void getTextByRowColNum(int row,int col,String givenText){
		String text= driver.findElements(By.xpath(".//*[@id='datatable-editable']/tbody/tr["+row+"]/td["+col+"]")).getText(row);
	}*/
//concrete flow
	
	public void createJobType(String jName) throws InterruptedException{
		Thread.sleep(2000);
		jobName.sendKeys(jName);
		submit.click();
		jobName.click();
	}
	

}
