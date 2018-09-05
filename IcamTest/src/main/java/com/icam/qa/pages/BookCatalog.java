package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class BookCatalog extends TestBase {

	@FindBy(css="#bookCategoryCode")
	WebElement bookCatageory;
	
	/*@FindBy(css="#bookEntryDate")
	WebElement entryDate;*/
	
	@FindBy(how=How.CSS,using="#publishingYear")
	WebElement pubYear;
	
	@FindBy(how=How.CSS,using="#pages")
	WebElement pages;
	
	@FindBy(how=How.CSS,using="#cost")
	WebElement cost;
	
	@FindBy(how=How.CSS,using="#classNo")
	WebElement classNo;
	
	@FindBy(how=How.XPATH,using=".//*[@id='bookDiv']/div/div[1]/div[3]/div/input")
	WebElement author;
	
	@FindBy(how=How.CSS,using="#volume")
	WebElement volume;
	
	@FindBy(how=How.CSS,using="#bookNo")
	WebElement bookNo;
	
	@FindBy(how=How.CSS,using="#bookName")
	WebElement bookTitle;
	
	@FindBy(how=How.CSS,using="#source")
	WebElement source;
	
	@FindBy(how=How.CSS,using="#withdrawalNo")
	WebElement withdrawlNo;
	
	@FindBy(how=How.CSS,using="#bookPlace")
	WebElement place;
	
	@FindBy(how=How.CSS,using="#billNo")
	WebElement billNo;
	
	/*@FindBy(css="#withdrawalDate")
	WebElement withdrwDate;*/
	
	@FindBy(how=How.CSS,using="#bookPublisherName")
	WebElement bkPbName;
	
	/*@FindBy(css="#billDate")
	WebElement billDate;*/
	
	@FindBy(how=How.CSS,using="#remarks")
	WebElement remark;
	
	@FindBy(xpath="//*[@id='footerDiv']/button")
	WebElement submti;
	
	public BookCatalog(){
		PageFactory.initElements(driver, this);
	}
	
	public BookCatalog AddBookToCatalog(String yr,String cst,String page,String clssNo,String athor,String vol,String bkNo,
			String bkTitle,String src,String withNo,String plce,String Billno,String publisher,String remarks ) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(bookCatageory);
		select.selectByVisibleText("Book");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('bookEntryDate').value='10/04/2018'");
		pubYear.sendKeys(yr);
		pages.sendKeys(page);
		cost.sendKeys(cst);
		classNo.sendKeys(clssNo);
		author.sendKeys(athor);
		volume.sendKeys(vol);
		bookNo.sendKeys(bkNo);
		bookTitle.sendKeys(bkTitle);
		source.sendKeys(src);
		withdrawlNo.sendKeys(withNo);
		place.sendKeys(plce);
		billNo.sendKeys(Billno);
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('withdrawalDate').value='15/04/2018'");
		bkPbName.sendKeys(publisher);
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("document.getElementById('billDate').value='11/04/2018'");
		remark.sendKeys(remarks);
		submti.click();
		return new BookCatalog();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
