package com.smartdata.childcare.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smartdata.childcare.driver.TestDriver;

public class WebelementControl {
	protected WebDriver driver;
	protected By by;
	private long waitTime;
	protected WebElement webElement;
	public WebelementControl(WebDriver driver, By by) {
		super();
		this.driver = driver;
		this.by = by;
		this.waitTime = TestDriver.getWaitTime();
		
	}
	protected void waitAndFindelement(){
		waitAndFindElement(by);
	}
	
	private void waitAndFindElement(final By by2)
	{
		try{
			
			webElement = (new WebDriverWait(driver, waitTime)).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver){
					return driver.findElement(by2);}});
		}
		catch(WebDriverException exp){
			exp.printStackTrace();
		}
		
		
	}

}
