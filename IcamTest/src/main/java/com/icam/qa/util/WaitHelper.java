package com.icam.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.icam.qa.base.TestBase;

public class WaitHelper extends TestBase {
	
	
	private WebDriverWait getWait(int timeOutInSeconds, int pollingEveryInMiliSec) 
	{
	WebDriverWait wait = new WebDriverWait(TestBase.driver, timeOutInSeconds);
	wait.pollingEvery(pollingEveryInMiliSec, TimeUnit.MILLISECONDS);
	wait.ignoring(NoSuchElementException.class);
	wait.ignoring(ElementNotVisibleException.class);
	wait.ignoring(StaleElementReferenceException.class);
	wait.ignoring(NoSuchFrameException.class);
	return wait;
}

public void waitForElementVisible(WebElement locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
	WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
	wait.until(ExpectedConditions.visibilityOf(locator));

}
}
