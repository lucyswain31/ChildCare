package com.smartdata.childcare.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public abstract class TestDriver {
	private String url = "https://www.bankbazaar.com/";
	protected static long waitTime = 20;
	protected WebDriver driver;
	
	protected abstract void pageSetup();
	@BeforeClass
	public void initialise(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		pageSetup();
	}
@AfterClass
public void teardown(){
	
	driver.quit();
}
	public static long getWaitTime() {
		return waitTime;
	}
}
