package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripAdviserObjects {

	public TripAdviserObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@title='Search']")
	public WebElement obj_searchClick;
	
	@FindBy(xpath="//input[@id='mainSearch']")
	public WebElement obj_scndSearch;
	
	@FindBy(xpath="//button[@id='SEARCH_BUTTON']")
	public WebElement obj_clkOnSearch;
	
	@FindBy(xpath = "//div[@class='main-content']")
	public WebElement obj_selectFirstList;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	public WebElement obj_clckWriteReview;
	
	@FindBy(xpath = "//span[@id='bubble_rating']")
	public WebElement obj_overAndclick;
	
	@FindBy(id = "ReviewTitle")
	public WebElement obj_writeInFirstText;
	
}
