package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class EmployeeDetails extends TestBase {
	
	// @Author Saquib
	@FindBy(how=How.CSS,using="#firstName")
	@CacheLookup WebElement firstName;
	
	@FindBy(how=How.CSS,using="#lastName")
	@CacheLookup WebElement lastName;
	
	@FindBy(how=How.CSS,using="#initialName")
	@CacheLookup WebElement initialName;
	
	@FindBy(how=How.CSS,using="#mobile")
	@CacheLookup WebElement contactNumber;
	
	@FindBy(css="#bloodGroup")
	WebElement bloodGrp;
	
	@FindBy(css="#category")
	WebElement category;
	
	@FindBy(how=How.CSS,using="#emailId")
	@CacheLookup WebElement email;
	
	@FindBy(how=How.CSS,using="#religion")
	@CacheLookup WebElement religion;
	
	@FindBy(how=How.CSS,using="#nationality")
	@CacheLookup WebElement nationality;
	
	@FindBy(how=How.CSS,using="#motherTongue")
	@CacheLookup WebElement motherTongue;
	
	@FindBy(css="#male")
	WebElement gender;
	
	@FindBy(how=How.CSS,using="#fatherFirstName")
	@CacheLookup WebElement fFirstName;
	
	@FindBy(how=How.CSS,using="#fatherLastName")
	@CacheLookup WebElement fLastName;
	
	@FindBy(how=How.CSS,using="#motherFirstName")
	@CacheLookup WebElement mFirstName;
	
	@FindBy(how=How.CSS,using="#motherLastName")
	@CacheLookup WebElement mLastName;
	
	@FindBy(how=How.CSS,using="#presentAddressLine")
	@CacheLookup WebElement pAddress;
	
	@FindBy(how=How.CSS,using="#presentAddressCityVillage")
	@CacheLookup WebElement pCity;
	
	@FindBy(how=How.CSS,using="#presentAddressPinCode")
	@CacheLookup WebElement pinCOde;
	
	@FindBy(how=How.CSS,using="#presentAddressState")
	WebElement state;
	
	@FindBy(css="#checkboxExample1")
	WebElement checkPoint;
	
	@FindBy(xpath="//*[@id='employeeDetailsForm']/div[2]/ul/li[3]/a")
	WebElement next;
	
	@FindBy(how=How.CSS,using="#employeeCode")
	@CacheLookup WebElement employeeCode;
	
	@FindBy(css="#dateOfBirth")
	WebElement dob;
	
	@FindBy(css="#dateOfJoining")
	WebElement doj;
	
	@FindBy(css="#employeeTypeName")
	WebElement employeeType;
	
	@FindBy(css="#jobTypeName")
	WebElement jobType;
	
	@FindBy(css="#designationName")
	WebElement desigName;
	
	@FindBy(css="#department")
	WebElement department;
	
	@FindBy(css="#teachingLevel")
	WebElement teachingLevel;
	
	@FindBy(css="#designationLevel")
	WebElement desigLevel;
	
	@FindBy(xpath="//*[@id='employeeDetailsForm']/div[2]/ul/li[3]/a")
	WebElement next2;
	
	@FindBy(xpath="//*[@id='employeeDetailsForm']/div[2]/ul/li[3]/a")
	WebElement next3;
	
	@FindBy(xpath="//*[@id='employeeDetailsForm']/div[2]/ul/li[3]/a")
	WebElement next4;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public EmployeeDetails(){
		PageFactory.initElements(driver, this);
		
	}

	public EmployeeDetails employeecreation(String fName,String lName, String iName, String cNo, String emal,
			String relg,String nat,String lang,String ffName, String flName,String mName,String lmName,String adrs,String cty,
			String pincd,String eCode) throws InterruptedException {
		   driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
            Thread.sleep(3000);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		initialName.sendKeys(iName);
		contactNumber.sendKeys(cNo);
		Thread.sleep(2000);
		Select select=new Select(bloodGrp);
		select.selectByVisibleText("A+");
		Thread.sleep(2000);
		Select select1=new Select(category);
		select1.selectByVisibleText("GENERAL");
		email.sendKeys(emal);
		religion.sendKeys(relg);
		nationality.sendKeys(nat);
		motherTongue.sendKeys(lang);
		gender.click();
		fFirstName.sendKeys(ffName);
		fLastName.sendKeys(flName);
		mFirstName.sendKeys(mName);
		mLastName.sendKeys(lmName);
		pAddress.sendKeys(adrs);
		pCity.sendKeys(cty);
		pinCOde.sendKeys(pincd);
		Select select2=new Select(state);
		select2.selectByVisibleText("WEST BENGAL");
		Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		checkPoint.click();?? //getting error here.....
		next.click();
		employeeCode.sendKeys(eCode);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dateOfBirth').value='11/04/1989'");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('dateOfJoining').value='11/04/2018'");
		Thread.sleep(2000);
		Select select3=new Select(employeeType);
		select3.selectByVisibleText("TEACHING STAFF");
		Select select4=new Select(jobType);
		select4.selectByVisibleText("FULL TIME");
		Select select5=new Select(desigName);
		select5.selectByVisibleText("ASSISTANCE OFFICER");
		Select select6=new Select(department);
		select6.selectByVisibleText("ACADEMIC DEPARTMANT");
		Select select7=new Select(desigLevel);
		select7.selectByVisibleText("LEVEL 2");
		next2.click();
		next3.click();
		next4.click();
		//submit.click();
		
		return  new EmployeeDetails();
	}
	
}
