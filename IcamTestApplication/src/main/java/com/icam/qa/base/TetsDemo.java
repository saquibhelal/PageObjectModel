package com.icam.qa.base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TetsDemo 
{
	
	@Test
	public void checkAssertion()
	{
		String firstString = "A";
		String secondString = "B";
		String thirdString = "C";
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("A", firstString);
		softAssert.assertEquals("B", secondString);
		softAssert.assertEquals("C", thirdString);
		softAssert.assertAll();
		
		
		
	}

}
