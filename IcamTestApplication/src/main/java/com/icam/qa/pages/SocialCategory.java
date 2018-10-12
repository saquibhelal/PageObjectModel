package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.icam.qa.base.TestBase;

public class SocialCategory extends TestBase {

	@FindBy(xpath="//input[@id='socialCategoryName']")
	WebElement  socialCatName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	//@FindBy(xpath="//*[@class='sorting_1']/input[1]")
//	WebElement categories;
	
	public SocialCategory(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChk="Social Category";
		return valChk;
	}
	
	public void socialCat() throws InterruptedException{
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		socialCatName.sendKeys("Automation");
		
		submit.click();
		
		// you write your code here let c 
		
		
		
		
	String text =	driver.findElement(By.id("javascriptmsg")).getText();
	
	System.out.println("--------------------------------------------------------------------------------------");
	
	System.out.println("Text; "+text);
	
	Assert.assertEquals(text,"Social Category Name Already Exists!");
	
	List<WebElement>elements= driver.findElements(By.xpath("//*[@class='sorting_1']"));
	String test_data="AUTOMATION";
	int count=0;
	for(int i=0;i<elements.size();i++){
		System.out.println("-----"+elements.get(i).getText());
		if(elements.get(i).getText().equals(test_data))
		  
			count++;
	}
	    if(count==1)
		Assert.assertTrue(true);
		else{
		Assert.assertTrue(false);
		}
	}
	
	//Assert.assertEquals(text, "");
		
		/*if(driver.getPageSource().contains("Social Category Name Already Exists!"))
		{
			System.out.println("Category is already present Test Case Failed!!!!!!");
		}else
		{
			System.out.println("Category Added Successfully!!!!");
		}
		String actualString=driver.findElement(By.xpath("socialCatName")).getText();
		Assert.assertTrue(actualString.contains("Automations"));*/
	}
	
	
	
	
	
	
	

