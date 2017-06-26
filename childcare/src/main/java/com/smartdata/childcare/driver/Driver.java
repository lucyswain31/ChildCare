package com.smartdata.childcare.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Driver {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/");
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}

}
