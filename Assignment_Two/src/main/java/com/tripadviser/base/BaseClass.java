package com.tripadviser.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.pages.TripAdviserObjects;


public class BaseClass {

public static WebDriver driver = null;
public static TripAdviserObjects trip = null;
	
	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		trip = new TripAdviserObjects(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
