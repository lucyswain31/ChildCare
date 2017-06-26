package com.smartdata.childcare.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickControl  extends WebelementControl{

	public ClickControl(WebDriver driver, By by) {
		super(driver, by);
	}
	
	public void click()
	{
		waitAndFindelement();
		
		
	}
	

}
