package com.tripadviser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tripadviser.base.BaseClass;

public class TripAdviserRunner extends BaseClass{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeiPhonePricefromAmzn()
	{
		try {
					

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void takeiPhonePricefromFlpkrt()
	{
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
